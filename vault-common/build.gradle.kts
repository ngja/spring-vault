dependencies {
    api("io.github.microutils:kotlin-logging-jvm:2.1.23")
}

tasks {
    jar {
        enabled = true
    }
    bootJar {
        enabled = false
    }
}