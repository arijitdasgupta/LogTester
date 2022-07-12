package io.dazgupta.logtester

import mu.KotlinLogging

object Main {
    @JvmStatic fun main(args: Array<String>) {
        val logger = KotlinLogging.logger("main")

        logger.info(args.joinToString(" "))
    }
}
