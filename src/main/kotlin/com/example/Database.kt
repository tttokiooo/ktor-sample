package com.example

import com.example.table.BookTable
import io.ktor.server.application.*
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.transactions.transaction

fun Application.configureDatabase() {
    Database.connect(
        url = "jdbc:mysql://localhost:3306/ktor_test",
        driver = "com.mysql.cj.jdbc.Driver",
        user = "root",
        password = "root",
    )

    transaction {
        SchemaUtils.create(BookTable)
    }
}