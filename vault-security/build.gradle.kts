dependencies {
    implementation(project(":vault-common"))

    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("org.springframework.boot:spring-boot-starter-data-jdbc")
    runtimeOnly("mysql:mysql-connector-java")
    testImplementation("org.springframework.security:spring-security-test")
}