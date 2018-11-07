package dependencies

object Dep {
    val androidGradlePlugin = "com.android.tools.build:gradle:3.2.1"

    object AndroidX {
        val appCompat = "com.android.support:appcompat-v7:28.0.0"
        val design = "com.android.support:design:28.0.0"
        val constraintLayout = "com.android.support.constraint:constraint-layout:1.1.3"
        object Test {
            val testRunner = "com.android.support.test:runner:1.0.2"
            val epsresso = "com.android.support.test.espresso:espresso-core:3.0.2"
        }
    }
    object Koitlin{
        val KOTLIN_VERSION = "1.3.0"
        val plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$KOTLIN_VERSION"
        val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$KOTLIN_VERSION"
    }
    val junit = "junit:junit:4.12"
}
