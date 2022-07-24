package com.hansol.springvault.component

import com.hansol.springvault.logger
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.ApplicationArguments
import org.springframework.stereotype.Service
import java.io.PrintStream

@Service
class MyBean {
    val log = logger()

    private val yourBean: YourBean
    private val out: PrintStream
    private val args: ApplicationArguments

    /**
     * 생성자가 1개를 초과하면 @Autowired를 통해 Spring이 사용할 생성자를 지정해줘야한다.
     * 안그러면 No default constructor found; nested exception is java.lang.NoSuchMethodException 이렇게 에러가 난다.
     */
    @Autowired
    constructor(yourBean: YourBean, args: ApplicationArguments) {
        this.yourBean = yourBean
        out = System.out
        this.args = args
    }

    constructor(yourBean: YourBean, out: PrintStream, args: ApplicationArguments) {
        this.yourBean = yourBean
        this.out = out
        this.args = args
    }

    /**
     * ApplicationArguments로 program arguments에 접근 가능하다
     */
    fun accessingApplicationArguments() {
        val debug = args.containsOption("debug")
        val files = args.nonOptionArgs
        if (debug) {
            log.info { files }
        }
    }
}