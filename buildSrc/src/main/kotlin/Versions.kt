/*
 * Copyright 2019 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

object Versions {
    object Android {
        const val compileSdk = 28
        const val targetSdk = 28
        const val minSdk = 21
    }

    const val kotlin = "1.3.60-eap-76"

    private const val mokoResources = "0.4.0-1.3.60-eap-76"

    object Plugins {
        const val android = "3.4.1"

        const val kotlin = Versions.kotlin
        const val androidExtensions = Versions.kotlin

        const val mokoResources = Versions.mokoResources
    }

    object Libs {
        object Android {
            const val appCompat = "1.0.2"
            const val lifecycle = "2.0.0"
            const val material = "1.0.0"
        }

        object MultiPlatform {
            const val mokoResources = Versions.mokoResources
            const val mokoMvvm = "0.3.1-1.3.60-eap-76"
            const val mokoFields = "0.1.0-1.3.60-eap-76"
        }

        object Jvm {
            const val kotlinPoet = "1.3.0"
        }
    }
}