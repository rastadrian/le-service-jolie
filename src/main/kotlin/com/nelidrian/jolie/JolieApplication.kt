package com.nelidrian.jolie

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JolieApplication

fun main(args: Array<String>) {
	runApplication<JolieApplication>(*args)
}
