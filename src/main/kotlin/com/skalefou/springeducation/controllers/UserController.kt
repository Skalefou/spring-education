package com.skalefou.springeducation.controllers

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {

    @PostMapping("/users")
    fun createUser(): String {
        return "User created"
    }
}