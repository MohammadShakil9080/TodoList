package com.todo.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.todo.data.model.TodoListResponseItem

@Database(
    entities = [TodoListResponseItem::class],
    version = 1,
    exportSchema = false
)
abstract class TodoDatabase : RoomDatabase(){

    abstract val todoDao: TodoDao

    companion object{
        const val DATABASE_NAME = "todo_db"
    }
}