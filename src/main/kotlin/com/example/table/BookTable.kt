package com.example.table

import org.jetbrains.exposed.dao.id.LongIdTable
import org.jetbrains.exposed.sql.Column

object BookTable : LongIdTable("book") {
    val name: Column<String> = varchar("name", 50)
    val price: Column<Int> = integer("price")
}