dependencies {
    implementation(project(":vault-common"))

    implementation("org.springframework.kafka:spring-kafka")
    testImplementation("org.springframework.kafka:spring-kafka-test")
}

tasks {
    jar {
        enabled = true
    }
    bootJar {
        enabled = false
    }
}