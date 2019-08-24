package patches.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_1.*
import jetbrains.buildServer.configs.kotlin.v2018_1.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v2018_1.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2018_1.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the buildType with id = 'Build'
accordingly, and delete the patch script.
*/
changeBuildType(RelativeId("Build")) {
    expectSteps {
        script {
            name = "Build"
            scriptContent = """node --version && echo "Success!""""
            dockerImage = "node:8.16.1-jessie"
        }
    }
    steps {
        update<ScriptBuildStep>(0) {
            scriptContent = """
                node --version
                mkdir %env.my_password%
                mkdir %env.my_second_password%
                ls -a
                echo "Success!"
            """.trimIndent()
        }
    }
}
