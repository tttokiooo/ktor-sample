package com.example.entity

import com.example.table.BookTable
import org.jetbrains.exposed.dao.LongEntity
import org.jetbrains.exposed.dao.LongEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class Book(id: EntityID<Long>) : LongEntity(id) {
    companion object : LongEntityClass<Book>(BookTable)

    var name by BookTable.name
    var price by BookTable.price
}