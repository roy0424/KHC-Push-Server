plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            from(files("dependencies.toml"))
        }
    }
}

rootProject.name = "Push-Server"
