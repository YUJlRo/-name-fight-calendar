plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
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

    // MainActivity だけを一時的にビルド対象に絞る
    sourceSets {
        named("main") {
            // ソースディレクトリ（必要に応じて kotlin も追加）
            java.srcDirs("src/main/java")
            // パッケージに合わせた相対パスで指定
            java.setIncludes(setOf("com/fightcalendar/app/MainActivity.kt"))
        }
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions { jvmTarget = "17" }

    // Composeを使う場合のみ（不要なら削除）
    buildFeatures { compose = true }
    composeOptions { kotlinCompilerExtensionVersion = "1.5.14" }
}

dependencies {
    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.4")

    // Compose（MainActivityの最小UIで使用）
    implementation(platform("androidx.compose:compose-bom:2024.06.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.activity:activity-compose:1.9.0")
}
