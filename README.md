# Flying Pig

A Minecraft Fabric mod that gives pigs the magical ability to fly!

## Features

- **Flying Pigs**: Pigs will randomly launch themselves into the air and float gracefully
- **Slow Falling**: When in the air, pigs descend slowly like they have wings
- **Fall Damage Immunity**: Pigs no longer take fall damage from any height
- **Multiple Flying Pigs**: All pigs in your world will have these abilities

## How It Works

The mod modifies pig behavior so that:

1. Pigs periodically jump high into the air (3% chance per tick while on ground)
2. When falling, pigs float down slowly instead of plummeting
3. Fall distance is always reset to zero, preventing any fall damage

Watch your pigs soar through the sky! They can reach heights of over 100 blocks above where they started.

## Requirements

- Minecraft 1.21.1
- Fabric Loader 0.16.0 or higher
- Fabric API 0.116.10+1.21.1 or compatible version

## Installation

1. Install [Fabric Loader](https://fabricmc.net/use/) for Minecraft 1.21.1
2. Download and install [Fabric API](https://modrinth.com/mod/fabric-api)
3. Download the `flying-pig-1.0.0.jar` from the releases or `build/libs/` folder
4. Place the JAR file in your `mods` folder
5. Launch Minecraft and enjoy flying pigs!

## Building from Source

```bash
./gradlew build
```

The compiled mod will be in `build/libs/flying-pig-1.0.0.jar`

## Usage

Simply spawn or find pigs in your world. They will automatically:
- Jump high into the air randomly
- Float down slowly when falling
- Survive falls from any height

You can also use commands to spawn pigs and watch them fly:
```
/summon pig ~ ~ ~
```

## Technical Details

- Mod ID: `flying-pig`
- Version: 1.0.0
- Minecraft Version: 1.21.1
- Mod Loader: Fabric

## Author

Created by ali77sina

## License

MIT License
