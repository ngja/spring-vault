package com.hansol.springvault.properties

import com.hansol.springvault.properties.ExternalizedConfiguration
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.TestPropertySource

@SpringBootTest(properties = ["name=SpringBootTest"])
@TestPropertySource(value = ["classpath:custom.yml"], properties = ["name=TestPropertySource"])
class ExternalizedConfigurationTest(
    @Autowired val externalizedConfiguration: ExternalizedConfiguration
) {
    @Test
    fun `외부 설정 불러오기 테스트`() {
        externalizedConfiguration.sayName()
    }
}