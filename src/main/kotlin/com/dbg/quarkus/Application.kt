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

    @GET
    @Path("/{id}")
    fun byId(@PathParam("id") id: String?): Response =
        id.let { Response.ok(todoDAO.findById(it)).build() } ?: Response.noContent().build()

    @POST
    fun create(todo: Todo?): Response =
        todo?.let { Response.ok(todoDAO.create(todo)).build() } ?: Response.noContent().build()

    @DELETE
    @Path("/{id}")
    fun delete(@PathParam("id") id: String?): Response =
        id.let { Response.ok().build() } ?: Response.noContent().build()

    @PUT
    @Path("/{id}")
    fun update(@PathParam("id") id: String?, todo: Todo?): Response =
        id.let { todo.let { Response.ok().build() } } ?: Response.noContent().build()

}