# EasyHologramPlugin

A lightweight and beginner-friendly Minecraft Spigot plugin for creating and managing holograms using invisible armor stands.

## ✨ Features

- Spawn floating text (holograms) at your location or a specific location.
- Stack multiple lines of holograms with customizable vertical spacing.
- Despawn the latest spawned hologram or all at once.
- Easy command-based interface.
- Clean and efficient handling using internal player-specific storage.

## 📦 Installation

1. Download the compiled `.jar` file from the [releases](https://github.com/bluqen/EasyHologramPlugin/releases) page (or build it yourself).
2. Place it in the `/plugins/` folder of your Spigot server.
3. Restart or reload the server.

## 📜 Commands

| Command | Description |
|--------|-------------|
| `/spawnhologram <text>` | Spawns a floating text (hologram) at your location. (Supports color codes)|
| `/spawnhologram <line1;line2;line3>` | Spawns a multi-line hologram (lines separated by `;`). |
| `/despawnhologram` | Removes the most recently spawned hologram for you. |
| `/despawnallholograms` | Removes all of your spawned holograms. |

## 🛠 Usage Example

```plaintext
/spawnhologram Hello, World!
/spawnhologram Welcome;to;&c&lEasyHologram!
/despawnhologram
