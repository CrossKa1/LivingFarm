package com.crosskai.livingfarm.simulation;

import java.util.Objects;
import java.util.random.RandomGenerator;

/** Immutable normalized genetic traits for an animal. */
public record Genetics(double growth, double health, double fertility,
                       double temperatureTolerance, double production) {
    public Genetics {
        growth = clamp(growth);
        health = clamp(health);
        fertility = clamp(fertility);
        temperatureTolerance = clamp(temperatureTolerance);
        production = clamp(production);
    }

    public static Genetics neutral() {
        return new Genetics(0.5, 0.5, 0.5, 0.5, 0.5);
    }

    /** Average-parent inheritance with optional bounded random mutation. */
    public static Genetics inherit(Genetics a, Genetics b, double mutationChance,
                                   double mutationStrength, RandomGenerator random) {
        Objects.requireNonNull(a);
        Objects.requireNonNull(b);
        Objects.requireNonNull(random);
        double chance = clamp(mutationChance);
        double strength = clamp(mutationStrength);
        return new Genetics(
                trait(a.growth, b.growth, chance, strength, random),
                trait(a.health, b.health, chance, strength, random),
                trait(a.fertility, b.fertility, chance, strength, random),
                trait(a.temperatureTolerance, b.temperatureTolerance, chance, strength, random),
                trait(a.production, b.production, chance, strength, random));
    }

    private static double trait(double a, double b, double chance, double strength,
                                RandomGenerator random) {
        double value = (a + b) / 2.0;
        if (random.nextDouble() < chance) {
            value += (random.nextDouble() * 2.0 - 1.0) * strength;
        }
        return clamp(value);
    }

    private static double clamp(double value) {
        if (!Double.isFinite(value)) return 0.5;
        return Math.max(0.0, Math.min(1.0, value));
    }
}
