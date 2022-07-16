package com.hansol.springvault

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class VaultWebApplication

fun main(args: Array<String>) {
    runApplication<VaultWebApplication>(*args)
}

@RestController
class HelloWorldController {

    @GetMapping("/hello")
    fun helloWorld(): String = "world"
}