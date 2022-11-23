package com.example

import com.example.controller.bookController
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        bookController()
    }
}
