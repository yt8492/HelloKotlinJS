plugins {
    id("org.jetbrains.kotlin.js") version "1.3.70"
}

group = "com.yt8492"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-js"))
}

kotlin.target.browser {
    webpackTask {
        outputFileName = "main.js"
    }
    runTask {
        outputFileName = "main.js"
    }
}