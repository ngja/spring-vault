package com.hansol.springvault.properties

import com.hansol.springvault.logger
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
class ExternalizedConfiguration(
    val typeSafeConfigurationProperties: TypeSafeConfigurationProperties
) {
    private val log = logger()

    /**
     * @Value 결정 되는 순서 (주로 쓰는 것 위주 모든 순서는 여기 https://docs.spring.io/spring-boot/docs/2.7.2/reference/htmlsingle/#features.external-config)
     * 아래에 있는 항목이 overriding 된다
     * SpringApplication.setDefaultProperties
     * 같은 jar의 application.yml -> 같은 jar의 application-{profile}.yml -> 다른 jar의(test..) application.yml -> 다른 jar의(test..) application-{profile}.yml
     * System.getProperties()
     * Command line arguments (program arguments) (--name=foo)
     * @SpringBootTest 의 properties attribute
     * @TestPropertySource 의 properties (locations는 다른 jar의 yml과 비슷하게 동작)
     */
    @Value("\${name}")
    private val name: String = "ExternalizedConfiguration.kt"

    /**
     * Property Placeholders
     * ${} 를 사용해 다른 property 를 참조할 수 있다.
     *
     * Random Values
     * ${random.value}, ${random.int}, ${random.long}, ${random.uuid}, ${random.int(10)}, ${random.int[1024,65536]} 등을 통해 random value도 사용 가능
     */
    @Value("\${description}")
    private val description: String = "description"

    fun sayName(): String {
        log.info { "My name is $name" }
        return this.name
    }

    fun sayDescription(): String {
        log.info { description }
        return this.description
    }

    fun sayTypeSafeConfigurationProperties(): String {
        log.info { typeSafeConfigurationProperties }
        return typeSafeConfigurationProperties.toString()
    }
}