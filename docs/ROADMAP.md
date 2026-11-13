# Living Farm — roadmap

## Phase 0: project foundation
- [x] Fabric 1.21.11 project structure
- [x] Java 21 and Mojang official mappings
- [x] Common mod entrypoint
- [x] Pure Java genetics and soil value models
- [ ] First successful CI build

## Phase 1: persistent livestock state
- [ ] Persistent animal identity, sex, age, genome and health
- [ ] Save/load across chunk unloads and world restarts
- [ ] Server-side inspection/debug command

## Phase 2: reproduction
- [ ] Sex-aware mating for cattle, sheep and pigs
- [ ] Pregnancy timers and offspring spawning
- [ ] Fertilized chicken eggs and incubation
- [ ] Vanilla breeding compatibility option

## Phase 3: heredity
- [ ] Trait inheritance, bounded mutation and lineage

## Phase 4: farming ecology
- [ ] Per-block soil nutrient storage
- [ ] Crop nutrient consumption and recovery
- [ ] Crop rotation and organic matter
- [ ] Temperature, shelter and nutrition modifiers

All simulation must be server-authoritative. Persistent formats will be versioned.
