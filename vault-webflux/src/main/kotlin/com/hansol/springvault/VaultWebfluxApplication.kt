package com.hansol.springvault

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class VaultWebfluxApplication

fun main(args: Array<String>) {
    runApplication<VaultWebfluxApplication>()
}