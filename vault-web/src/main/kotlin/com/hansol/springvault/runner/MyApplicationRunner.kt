package com.hansol.springvault.runner

import com.hansol.springvault.logger
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
class MyApplicationRunner : ApplicationRunner{
    val log = logger()

    /**
     * ApplicationRunner를 implement하면 SpringApplication.run(...)이 완료되기 전에 실행된다.
     * program arguments에 --foo=bar --foo=baz args1 args2 이렇게 넣으면
     * nonOptionArgs에는 args1, args2가
     * optionNames에는 foo가
     * foo의 optionValues에는 bar, baz가 들어간다.
     */
    override fun run(args: ApplicationArguments?) {
        log.info { "This is ApplicationRunner" }
        log.info { "Non Option args: ${args!!.nonOptionArgs}" }
        log.info { "Option Names ${args!!.optionNames}" }
        log.info { "Option Values: ${args!!.getOptionValues("foo")}" }
    }
}