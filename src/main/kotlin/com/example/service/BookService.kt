package com.example.service

import com.example.entity.Book
import com.example.request.book.PostReq
import com.example.table.BookTable
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.transactions.transaction

object BookService {
    fun create(req: PostReq) = transaction {
        // DSL
        BookTable.insert {
            it[name] = req.name
            it[price] = req.price
        }

        // DAO
        Book.new {
            name = req.name
            price = req.price
        }
    }
}