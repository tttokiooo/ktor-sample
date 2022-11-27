package com.example.controller

import com.example.request.book.PostReq
import com.example.service.BookService
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.bookController() {
    // 普通のRouting
    route("/book") {
        get("/{id}") {
            val id = call.parameters["id"]?.toLong()!!
            call.respond("id = $id")
        }
        post {
            val req = call.receive<PostReq>()
            BookService.create(req)

            call.respond("name = ${req.name}、price = ${req.price}")
        }
    }

    // Locations使用版
    // まだ実験的な処理らしい
//    get<LocationGetReq> { req ->
//        call.respond("id = ${req.id}")
//    }
}

//@Location("/book2/{id}")
//data class LocationGetReq(
//    val id: Long
//)