package com.hansol.springvault

import org.junit.jupiter.api.Test
import org.springframework.boot.autoconfigure.AutoConfigurations
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.runner.ApplicationContextRunner

@SpringBootTest
class VaultWebApplicationTests {
    val log = logger()

    @Test
    fun contextLoads() {
        val contextRunner = ApplicationContextRunner()
            .withConfiguration(AutoConfigurations.of(VaultWebApplication::class.java))

        contextRunner.run { context ->
            log.info { ">>>>> context : $context" }
            log.info { context.beanDefinitionNames }
        }
    }
}