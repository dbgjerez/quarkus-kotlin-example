package com.dbg.quarkus

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.given
import org.hamcrest.CoreMatchers.`is`
import org.junit.jupiter.api.Test

@QuarkusTest
open class ApplicationTest {

    @Test
    fun testHelloEndpoint() {
        given()
            .`when`().get("/todo")
            .then()
            .statusCode(200)
            .body(`is`("{\"title\":\"Hello world!\"}"))
    }

}