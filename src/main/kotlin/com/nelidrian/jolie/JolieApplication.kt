package com.nelidrian.jolie

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class JolieApplication {

	@Bean
    fun run(): CommandLineRunner {
        return CommandLineRunner { print("this is my first feature change!") }
    }
}

fun main(args: Array<String>) {
    runApplication<JolieApplication>(*args)
}
