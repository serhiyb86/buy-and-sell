package com.vm.buyandsell

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication

@SpringBootApplication
class BuyandsellApplication

fun main(args: Array<String>) {
    runApplication<BuyandsellApplication>(*args)
}
