@file:Suppress("PackageDirectoryMismatch", "SpellCheckingInspection", "unused")

import dependencies.DependencyNotationAndGroup
import org.gradle.api.Incubating

@Incubating
object Kotlin {

    val stdlib = Stdlib
    val test = Test

    object Stdlib : DependencyNotationAndGroup(group = "org.jetbrains.kotlin", name = "kotlin-stdlib") {
        @JvmField val jdk7 = "$artifactPrefix-jdk7:_"
        @JvmField val jdk8 = "$artifactPrefix-jdk8:_"
        @JvmField val js = "$artifactPrefix-js:_"
        @JvmField val common = "$artifactPrefix-common:_"
    }

    object Test {
        private const val artifactPrefix = "org.jetbrains.kotlin:kotlin-test"

        const val annotationsCommon = "$artifactPrefix-annotations-common:_"
        const val common = "$artifactPrefix-common:_"
        const val js = "$artifactPrefix-js:_"
        const val jsRunner = "$artifactPrefix-js-runner:_"

        const val junit = "$artifactPrefix-junit:_"
        const val junit5 = "$artifactPrefix-junit5:_"
        const val testng = "$artifactPrefix-testng:_"
    }
}
