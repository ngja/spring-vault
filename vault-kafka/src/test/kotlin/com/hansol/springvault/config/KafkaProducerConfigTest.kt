package com.hansol.springvault.config

import com.hansol.springvault.logger
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.kafka.core.ProducerFactory

@SpringBootTest
class KafkaProducerConfigTest(
    @Autowired val kafkaTemplate: KafkaTemplate<String, String>,
    @Autowired val producerFactory: ProducerFactory<String, String>,
) {
    val log = logger()

    @Test
    fun test() {
        log.info { producerFactory.configurationProperties }
    }
}