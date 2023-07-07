package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.given;

class PostmanEchoTest {

    @Test
    void shouldReturnSendData() {
        given()
                .baseUri("http://postman-echo.com")
                .body("H1")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body( "data", equaTo("H1"));
        ;
    }
}

