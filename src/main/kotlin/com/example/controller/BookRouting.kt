package com.example.controller

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.server.locations.*

fun Route.bookController() {
    // 普通のRouting
    route("/book") {
        get("/{id}") {
            val id = call.parameters["id"]?.toLong()!!
            call.respond("id = $id")
        }
    }

    // Locations使用版
    // まだ実験的な処理らしい
    get<GetReq> { req ->
        call.respond("id = ${req.id}")
    }
}

@Location("/book2/{id}")
data class GetReq(
    val id: Long
)