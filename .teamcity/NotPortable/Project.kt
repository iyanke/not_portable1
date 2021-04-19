package NotPortable

import NotPortable.buildTypes.*
import NotPortable.vcsRoots.*
import NotPortable.vcsRoots.NotPortable_HttpsGithubComIyankeNotPortable1
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "4f36da07-5308-4597-8067-2cc34a612a4e"
    id("NotPortable")
    parentId("_Root")
    name = "Not portable"

    vcsRoot(NotPortable_HttpsGithubComIyankeNotPortable1)

    buildType(NotPortable_Build)

    features {
        versionedSettings {
            id = "PROJECT_EXT_3"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = "${NotPortable_HttpsGithubComIyankeNotPortable1.id}"
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }
})
