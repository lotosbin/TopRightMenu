import com.android.build.api.dsl.SettingsExtension

pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
    }
}
plugins {
    id("com.android.settings").version("8.3.2")
}
configure<SettingsExtension> {
    compileSdk = 34
    minSdk = 23
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
include(":app")
include(":toprightmenu")
