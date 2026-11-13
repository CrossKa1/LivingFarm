# Living Farm

A Fabric mod for Minecraft 1.21.11 focused on deeper livestock breeding, animal genetics, incubation, soil fertility and sustainable farming.

## Project status

**Early development — foundation commit.** The repository is being initialized with the build system, mod entry point, project conventions and a staged implementation plan. Gameplay systems will be added in small, testable increments; this initial commit is not yet a feature-complete release.

## Target platform

- Minecraft Java Edition 1.21.11
- Fabric Loader
- Fabric API
- Java 21
- Mojang official mappings

## Build

Use JDK 21 and Gradle. Run:

```bash
gradle build
```

The remapped mod JAR will be in `build/libs/`.

## Planned systems

1. Persistent animal records and genetic traits.
2. Sex-aware livestock breeding and pregnancy for cattle, sheep and pigs.
3. Fertilized chicken eggs and configurable incubation.
4. Heredity, mutation bounds and lineage.
5. Soil nutrients, crop rotation and environmental conditions.
6. Server-authoritative synchronization and configuration.

## Design principles

- Server authoritative: clients display state; the logical server owns simulation.
- Persistent data: animal and soil state must survive save/reload.
- Vanilla-friendly: preserve vanilla entities, items and breeding behavior where possible.
- Configurable simulation rates and clear compatibility boundaries.

## License

MIT for this project code. Minecraft and Fabric remain the property of their respective owners.
