package com.dbg.quarkus.dao

import com.dbg.quarkus.model.Todo
import java.util.*
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class TodoDAO {

    fun findAll() = Arrays.asList(Todo("a"), Todo("b"))
    fun create(todo: Todo): Todo = Todo("a")
    fun findById(id: String?) = id.let { Todo("ok") }

}