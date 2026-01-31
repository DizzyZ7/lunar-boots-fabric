# 🚀 Lunar Boots (Fabric Mixin Project)

Developed by **DizzyZ7**.

This mod demonstrates advanced **bytecode manipulation** using SpongePowered Mixins to override Minecraft's internal physics engine.

## 🧪 Technical Mechanics
* **Bytecode Injection:** Injects custom logic into `LivingEntity.travel()` using the `@Inject` annotation.
* **Physics Modification:** Intercepts and modifies the entity's velocity vector (`Vec3d`) in real-time.
* **Low Gravity Simulation:** Reduces downward vertical velocity by 50% when specific criteria (Golden Boots) are met.

## 🛠 Skills Showcased
* **Mixins:** Targeted code injection into Minecraft's obfuscated source.
* **Physics Engine Hooks:** Direct manipulation of movement math.
* **Performance:** Lightweight logic that runs with zero impact on server TPS
