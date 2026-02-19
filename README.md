<div align="center">

# 🛠️ MCUtils

**A collection of ready-to-use Minecraft (Bukkit/Spigot) utility snippets in Java and Kotlin.**

[![License](https://img.shields.io/github/license/PaxonicYT/MCUtils?style=flat-square)](LICENSE)
[![Stars](https://img.shields.io/github/stars/PaxonicYT/MCUtils?style=flat-square)](https://github.com/PaxonicYT/MCUtils/stargazers)
[![Forks](https://img.shields.io/github/forks/PaxonicYT/MCUtils?style=flat-square)](https://github.com/PaxonicYT/MCUtils/network/members)

</div>

---

## 📖 About

MCUtils is a community-driven repository of reusable Minecraft plugin code snippets for **Bukkit / Spigot / Paper** servers. Each snippet is self-contained and ready to copy into your own plugin. All snippets are available in both **Java** and **Kotlin**.

---

## 📋 Table of Contents

- [Getting Started](#-getting-started)
- [Java Snippets](#-java-snippets)
  - [Listeners / Events](#listeners--events)
  - [Commands](#commands)
  - [Main Class](#main-class)
- [Kotlin Snippets](#-kotlin-snippets)
  - [Listeners / Events](#listeners--events-1)
  - [Commands](#commands-1)
  - [Main Class](#main-class-1)
- [Start Scripts](#-start-scripts)
- [Contributing](#-contributing)

---

## 🚀 Getting Started

1. Copy the desired snippet into your plugin project.
2. Register commands in your `plugin.yml`:
   ```yaml
   commands:
     heal:
       description: Heal a player
     fly:
       description: Toggle fly mode
     gm:
       description: Change gamemode
     broadcast:
       description: Broadcast a message
     give:
       description: Give items to a player
     speed:
       description: Set player speed
     tp:
       description: Teleport a player
     kill:
       description: Kill a player
     feed:
       description: Feed a player
     clearinv:
       description: Clear a player's inventory
   ```
3. Register listeners and commands in your main class (see `MainClassExample.java` or `MainClassFull.kt`).

---

## ☕ Java Snippets

### Listeners / Events

| File | Description |
|------|-------------|
| [`NoHunger.java`](Java/NoHunger.java) | Prevents players from losing hunger |
| [`NoWeatherChange.java`](Java/NoWeatherChange.java) | Prevents weather from changing |
| [`NoFallDamage.java`](Java/NoFallDamage.java) | Disables fall damage for all entities |
| [`NoFireDamage.java`](Java/NoFireDamage.java) | Disables fire and lava damage |
| [`NoExplosionDamage.java`](Java/NoExplosionDamage.java) | Disables explosion damage |
| [`NoItemDropOnDeath.java`](Java/NoItemDropOnDeath.java) | Prevents item drops on player death |
| [`NoBlockBreak.java`](Java/NoBlockBreak.java) | Restricts block breaking by permission |
| [`NoBlockPlace.java`](Java/NoBlockPlace.java) | Restricts block placing by permission |
| [`NoMobSpawn.java`](Java/NoMobSpawn.java) | Prevents hostile mobs from spawning naturally |
| [`InfiniteArrows.java`](Java/InfiniteArrows.java) | Prevents arrows from being consumed |
| [`CustomJoinMessage.java`](Java/CustomJoinMessage.java) | Custom colored join message |
| [`CustomQuitMessage.java`](Java/CustomQuitMessage.java) | Custom colored quit message |
| [`ChatFormat.java`](Java/ChatFormat.java) | Custom chat format with optional color code support |
| [`AntiSwear.java`](Java/AntiSwear.java) | Blocks forbidden words in chat |
| [`PotionEffectOnJoin.java`](Java/PotionEffectOnJoin.java) | Gives players permanent potion effects on join |

### Commands

| File | Description | Usage |
|------|-------------|-------|
| [`HealCommand.java`](Java/HealCommand.java) | Heal yourself or another player | `/heal [player]` |
| [`FeedCommand.java`](Java/FeedCommand.java) | Feed yourself or another player | `/feed [player]` |
| [`KillCommand.java`](Java/KillCommand.java) | Kill yourself or another player | `/kill [player]` |
| [`FlyCommand.java`](Java/FlyCommand.java) | Toggle fly mode | `/fly [player]` |
| [`GameModeCommand.java`](Java/GameModeCommand.java) | Change gamemode (0-3) | `/gm <0\|1\|2\|3> [player]` |
| [`TeleportCommand.java`](Java/TeleportCommand.java) | Teleport yourself or a player | `/tp <player> [target]` |
| [`GiveItemCommand.java`](Java/GiveItemCommand.java) | Give items to a player | `/give <player> <material> [amount]` |
| [`SpeedCommand.java`](Java/SpeedCommand.java) | Set walk/fly speed (1-10) | `/speed <1-10> [player]` |
| [`ClearInventoryCommand.java`](Java/ClearInventoryCommand.java) | Clear a player's inventory | `/clearinv [player]` |
| [`BroadcastCommand.java`](Java/BroadcastCommand.java) | Broadcast a message to all players | `/broadcast <message>` |

### Main Class

| File | Description |
|------|-------------|
| [`MainClassExample.java`](Java/MainClassExample.java) | Example main plugin class with command & listener registration |

---

## 🟣 Kotlin Snippets

### Listeners / Events

| File | Description |
|------|-------------|
| [`ExampleListener.kt`](Kotlin/ExampleListener.kt) | Basic listener example (BlockBreakEvent) |
| [`NoFallDamage.kt`](Kotlin/NoFallDamage.kt) | Disables fall damage |
| [`JoinQuitListener.kt`](Kotlin/JoinQuitListener.kt) | Custom join and quit messages |
| [`AntiSwearListener.kt`](Kotlin/AntiSwearListener.kt) | Blocks forbidden words in chat |
| [`BuildPermissionListener.kt`](Kotlin/BuildPermissionListener.kt) | Restricts building by permission |

### Commands

| File | Description | Usage |
|------|-------------|-------|
| [`ExampleCommand.kt`](Kotlin/ExampleCommand.kt) | Basic command example | `/example` |
| [`HealCommand.kt`](Kotlin/HealCommand.kt) | Heal yourself or another player | `/heal [player]` |
| [`FlyCommand.kt`](Kotlin/FlyCommand.kt) | Toggle fly mode | `/fly [player]` |
| [`GameModeCommand.kt`](Kotlin/GameModeCommand.kt) | Change gamemode (0-3) | `/gm <0\|1\|2\|3> [player]` |
| [`BroadcastCommand.kt`](Kotlin/BroadcastCommand.kt) | Broadcast a message to all players | `/broadcast <message>` |

### Main Class

| File | Description |
|------|-------------|
| [`MainClass.kt`](Kotlin/MainClass.kt) | Minimal main class example |
| [`MainClassFull.kt`](Kotlin/MainClassFull.kt) | Full main class with all snippets registered |

---

## 🖥️ Start Scripts

| File | Description |
|------|-------------|
| [`startscript_linux.sh`](startscript_linux.sh) | Start script for Linux |
| [`startscript_win.bat`](startscript_win.bat) | Start script for Windows |

---

## 🤝 Contributing

Contributions are welcome! If you have a useful Minecraft plugin snippet you'd like to share:

1. Fork the repository
2. Add your snippet to the `Java/` or `Kotlin/` folder
3. Update the README table with a short description
4. Open a Pull Request

---

<div align="center">
Made with ❤️ by <a href="https://github.com/PaxonicYT">PaxonicYT</a> and contributors
</div>
