plugins {
    id("com.android.application") version "8.5.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.24" apply false
}

sourceSets {
    getByName("main") {
        // 一時的にMainActivity以外をビルド対象から外す
        // 方式A: ディレクトリごと除外
        java.exclude(
            "**/di/**",
            "**/data/**",
            "**/db/**",
            "**/domain/**",
            "**/worker/**",
            "**/ui/screens/**",
            "**/ui/theme/**"
        )
        // 方式B（必要なら）: 明示的にMainActivityだけを含める
        // java.setSrcDirs(listOf("src/main/java"))
        // include("com/fightcalendar/app/MainActivity.kt")
    }
}
