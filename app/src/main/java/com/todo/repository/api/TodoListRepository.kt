package com.todo.repository.api

import com.todo.data.model.TodoListResponse
import com.todo.utils.Resource


interface TodoListRepository {
    suspend fun todoListResponse():
            Resource<TodoListResponse>
}