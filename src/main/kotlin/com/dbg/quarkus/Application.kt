package com.dbg.quarkus

import com.dbg.quarkus.dao.TodoDAO
import com.dbg.quarkus.model.Todo
import javax.inject.Inject
import javax.ws.rs.*
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response


@Path("/todo")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
class Application {

    @Inject
    private lateinit var todoDAO: TodoDAO

    @GET
    fun all(): List<Todo> = todoDAO.findAll()

    @POST
    fun create(todo: Todo?): Response =
        todo?.let { Response.ok(todoDAO.create(todo)).build() } ?: Response.noContent().build()

}