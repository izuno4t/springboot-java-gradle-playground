package com.example.gradle5kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Gradle5KotlinApplication

fun main(args: Array<String>) {
	runApplication<Gradle5KotlinApplication>(*args)
}
