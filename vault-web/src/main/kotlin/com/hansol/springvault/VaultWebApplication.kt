package com.hansol.springvault

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class VaultWebApplication

fun main(args: Array<String>) {
    runApplication<VaultWebApplication>(*args) {
        this.setDefaultProperties(mapOf("name" to "VaultWebApplication.kt"))
    }
}