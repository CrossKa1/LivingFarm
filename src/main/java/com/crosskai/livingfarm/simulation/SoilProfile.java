package com.crosskai.livingfarm.simulation;

/** Immutable soil nutrient values normalized to [0, 1]. */
public record SoilProfile(double nitrogen, double phosphorus, double potassium,
                          double organicMatter) {
    public SoilProfile {
        nitrogen = clamp(nitrogen);
        phosphorus = clamp(phosphorus);
        potassium = clamp(potassium);
        organicMatter = clamp(organicMatter);
    }

    public static SoilProfile fertile() {
        return new SoilProfile(0.8, 0.8, 0.8, 0.7);
    }

    public double fertilityIndex() {
        return (nitrogen + phosphorus + potassium) / 3.0;
    }

    public SoilProfile extract(double n, double p, double k) {
        return new SoilProfile(nitrogen - n, phosphorus - p, potassium - k, organicMatter);
    }

    public SoilProfile replenish(double n, double p, double k, double organic) {
        return new SoilProfile(nitrogen + n, phosphorus + p, potassium + k,
                organicMatter + organic);
    }

    private static double clamp(double value) {
        if (!Double.isFinite(value)) return 0.0;
        return Math.max(0.0, Math.min(1.0, value));
    }
}
