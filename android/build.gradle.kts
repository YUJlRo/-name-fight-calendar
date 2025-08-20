android { namespace = "com.fightcalendar.app" // 実プロジェクトのnamespaceに合わせて compileSdk = 34

defaultConfig {
    minSdk = 26
    targetSdk = 34
    versionCode = 1
    versionName = "0.9.0"
}

buildTypes {
    getByName("release") {
        isMinifyEnabled = false
    }
}
compileOptions {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}
kotlinOptions {
    jvmTarget = "17"
}
