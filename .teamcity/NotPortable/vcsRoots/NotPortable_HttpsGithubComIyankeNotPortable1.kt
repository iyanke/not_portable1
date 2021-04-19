package NotPortable.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

object NotPortable_HttpsGithubComIyankeNotPortable1 : GitVcsRoot({
    uuid = "d5d49775-bb54-4551-b0fe-0ae3cb71cd14"
    name = "https://github.com/iyanke/not_portable1"
    url = "https://github.com/iyanke/not_portable1"
    branch = "refs/heads/main"
    authMethod = password {
        userName = "iyanke"
        password = "credentialsJSON:7c44fbf5-6ed1-4ecb-ac02-060f37b97bf7"
    }
})
