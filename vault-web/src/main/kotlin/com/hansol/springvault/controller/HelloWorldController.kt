package com.hansol.springvault.controller

import com.hansol.springvault.properties.ExternalizedConfiguration
import com.hansol.springvault.component.MyBean
import com.hansol.springvault.logger
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController(
    val myBean: MyBean,
    val externalizedConfiguration: ExternalizedConfiguration
) {
    val log = logger()

    @GetMapping("/hello-world")
    fun helloWorld(): String {
        myBean.accessingApplicationArguments()
        return "Hello, World!"
    }

    @GetMapping("/hello")
    fun hello(): String = externalizedConfiguration.sayName()

    @GetMapping("/description")
    fun description(): String = externalizedConfiguration.sayDescription()

    @GetMapping("/type-safe-configuration")
    fun typeSafeConfiguration(): String = externalizedConfiguration.sayTypeSafeConfigurationProperties()

}