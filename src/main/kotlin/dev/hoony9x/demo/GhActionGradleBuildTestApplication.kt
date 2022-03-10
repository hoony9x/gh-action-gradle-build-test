package dev.hoony9x.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GhActionGradleBuildTestApplication

fun main(args: Array<String>) {
    runApplication<GhActionGradleBuildTestApplication>(*args)
}
