// android/app/build.gradle.kts（Java最小構成＋Kotlin重複除去）

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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

// Kotlin旧JDKモジュールを排除し、stdlibを1.8.22に統一
configurations.all {
    exclude(group = "org.jetbrains.kotlin", module = "kotlin-stdlib-jdk8")
    exclude(group = "org.jetbrains.kotlin", module = "kotlin-stdlib-jdk7")
    resolutionStrategy.eachDependency {
        if (requested.group == "org.jetbrains.kotlin" && requested.name == "kotlin-stdlib") {
            useVersion("1.8.22")
        }
    }
    resolutionStrategy.force("org.jetbrains.kotlin:kotlin-stdlib:1.8.22")
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.7.0")
    // 念のため明示（不要なら削除可）
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.8.22")
}
