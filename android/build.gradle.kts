plugins {
    id("com.android.application")
}

android {
    namespace = "com.fightcalendar.app"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.fightcalendar.app"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "0.9.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        // Javaのみでビルド
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.7.0")
}
