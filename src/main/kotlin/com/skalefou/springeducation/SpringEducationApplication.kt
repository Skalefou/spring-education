package com.skalefou.springeducation

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.persistence.autoconfigure.EntityScan
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringEducationApplication

fun main(args: Array<String>) {
    runApplication<SpringEducationApplication>(*args)
}
