package com.hansol.springvault.runner

import com.hansol.springvault.logger
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class MyCommandLineRunner : CommandLineRunner {
    val log = logger()

    /**
     * CommandLineRunner를 implement하면 SpringApplication.run(...)이 완료되기 전에 실행된다.
     * CommandLineRunner는 program arguments에 string array 형태로 접근 가능하다.
     * --foo=bar --foo=baz args1 args2 이렇게 넣으면
     * ["--foo=bar", "--foo=baz", "args1", "args2"] 이렇게 받아진다.
     */
    override fun run(vararg args: String?) {
        for (arg in args) {
            log.info { "arg = $arg" }
        }
    }
}