plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("com.google.dagger.hilt.android")
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
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions { jvmTarget = "17" }

    // Composeを使う場合
    buildFeatures { compose = true }
    composeOptions { kotlinCompilerExtensionVersion = "1.5.14" }
}

dependencies {
    // Material3テーマ解決用（XML Theme.Material3）
    implementation("com.google.android.material:material:1.12.0")

    // 基本
    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.4")

    // Compose（使っていないなら下の4行は削除OK）
    implementation(platform("androidx.compose:compose-bom:2024.06.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.activity:activity-compose:1.9.0")

    // WorkManager（ジョブ実行）
    implementation("androidx.work:work-runtime-ktx:2.9.0")

    // Glance（ウィジェット。使っていなければ削除OK）
    implementation("androidx.glance:glance-appwidget:1.0.0")

    // Hilt（使っていなければ下3行は削除OK）
    implementation("com.google.dagger:hilt-android:2.51.1")
    kapt("com.google.dagger:hilt-compiler:2.51.1")
    implementation("androidx.hilt:hilt-navigation-compose:1.2.0")
}

kapt {
    correctErrorTypes = true
}
