package com.hansol.springvault.properties

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component
import java.net.InetAddress

/**
 * @ConfigurationProperties 를 사용해 type safe 한 properties 를 불러 올 수 있다.
 * 이 경우 @EnableConfigurationProperties 나 @ConfigurationPropertiesScan 을 추가로 붙여서 사용한다.
 * 아니면 bean 으로 만들어준다.
 */
@Component
@ConfigurationProperties("my.service")
class TypeSafeConfigurationProperties {

    var isEnabled = false

    var remoteAddress: InetAddress? = null

    val security = Security()

    class Security {

        var username: String? = null

        var password: String? = null

        var roles: List<String> = ArrayList(setOf("USER"))

        override fun toString(): String {
            return "Security(username=$username, password=$password, roles=$roles)"
        }
    }

    override fun toString(): String {
        return "TypeSafeConfigurationProperties(isEnabled=$isEnabled, remoteAddress=$remoteAddress, security=$security)"
    }
}