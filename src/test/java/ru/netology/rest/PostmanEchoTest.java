package ru.netology.rest;

import ....

public class PostmanEchoTest {
    @Test
    void  shouldSendData() {
        given()
                .baseUri("https://postman-echo.com")
                .body("H1")
                .when()
                .post( "/post")
                .then()
                .statucCode( 200)
                .body("data", equalTo)( "H1"));
    }
}
