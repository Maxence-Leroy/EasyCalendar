pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        jcenter()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://maven.fabric.io/public")
        }
        maven {
            url = uri("https://s3.amazonaws.com/repo.commonsware.com")
        }
        maven {
            url = uri("https://jitpack.io")
        }
        jcenter()
    }
}

include(":library")
