package dependencies

const val kotlinVersion = "1.3.61"

object Dependencies {
    object Gradle {
        val plugin = "com.android.tools.build:gradle:3.6.0-rc01"
    }
    
    object Kotlin {
        val std = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlinVersion"
        val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
    }

    object KotlinX {
        val coroutniesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.3"
    }


    object AndroidX {
        val appCompat = "androidx.appcompat:appcompat:1.1.0"
        val core = "androidx.core:core-ktx:1.1.0"
        val constraintLayout = "androidx.constraintlayout:constraintlayout:1.1.3"
        val coordinatorLayout = "androidx.coordinatorlayout:coordinatorlayout:1.1.0"
        object Lifecycle {
            val runtime = "androidx.lifecycle:lifecycle-runtime-ktx:2.2.0"
        }

        object Navigation {
            private val version = "2.1.0"
            val safeArgs = "androidx.navigation:navigation-safe-args-gradle-plugin:$version"
        }
    }
    
    object Dagger {
        private val version = "2.24"
        val dagger  = "com.google.dagger:dagger:$version"
        val compiler =  "com.google.dagger:dagger-compiler:$version"

    }
}

object TestDependencies {
    val junit = "junit:junit:4.13"
}

object AndroidTestDependencies {

    object AndroidXTest {
        val junitExt = "androidx.test.ext:junit:1.1.1"
        val espressoCore = "androidx.test.espresso:espresso-core:3.2.0"
    }
}