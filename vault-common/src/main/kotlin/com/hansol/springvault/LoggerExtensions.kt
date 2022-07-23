package com.hansol.springvault

import mu.KLogger
import mu.KotlinLogging

inline fun <reified T : Any> T.logger(): KLogger = KotlinLogging.logger(T::class.java.name)