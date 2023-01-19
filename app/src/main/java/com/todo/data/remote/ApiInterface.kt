package com.todo.data.remote

import com.todo.data.model.TodoListResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST


interface ApiInterface {
    @GET("todos")
    suspend fun getTodoList(
    ): TodoListResponse
}