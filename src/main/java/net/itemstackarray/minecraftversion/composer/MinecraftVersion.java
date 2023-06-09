package net.itemstackarray.minecraftversion.composer;

public enum MinecraftVersion {

    V1_8("v1_8"),
    V1_9("v1_9"),
    V1_10("v1_10"),
    V1_11("v1_11"),
    V1_12("v1_12"),
    V1_13("v1_13"),
    V1_14("v1_14"),
    V1_15("v1_15"),
    V1_16("v1_16"),
    V1_17("v1_17"),
    V1_18("v1_18"),
    V1_19("v1_19"),
    V1_20("v1_20");

    static String version;

    MinecraftVersion(String version) {
        version = version;
    }

    private static final MinecraftVersion MINECRAFT_VERSION = build();

    private static MinecraftVersion build() {
        for (final MinecraftVersion minecraftVersion : MinecraftVersion.values()) {
            if (version.contains(minecraftVersion.version))
                return minecraftVersion;
        }
        // Return newest version because can't get version
        return V1_20;
    }

    public static MinecraftVersion GET() {
        return build();
    }
}
