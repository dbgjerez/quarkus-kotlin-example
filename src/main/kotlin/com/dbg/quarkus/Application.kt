package com.dbg.quarkus

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

data class Todo(val title: String?)


@Path("/todo")
@Produces(MediaType.APPLICATION_JSON)
class Application {

    @GET
    fun hello() = Todo("Hello world!")

}