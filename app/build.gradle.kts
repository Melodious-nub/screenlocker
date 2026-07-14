plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.screenlocker"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.screenlocker"
        minSdk = 28
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    // No external dependencies for ultra-lightweight APK
}
