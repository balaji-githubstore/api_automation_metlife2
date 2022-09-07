package com.metlife.apitest;

import io.restassured.RestAssured;

public class Demo4PostAddPet {
public static String baseUrl="https://petstore.swagger.io/v2/";

    public static void main(String[] args) {

        String resource="pet";

       RestAssured
                .given().headers("Content-Type","application/json")
                .body("{\n" +
                        "    \"id\": 901,\n" +
                        "    \"category\": {\n" +
                        "        \"id\": 0,\n" +
                        "        \"name\": \"string\"\n" +
                        "    },\n" +
                        "    \"name\": \"doggie-901\",\n" +
                        "    \"photoUrls\": [\n" +
                        "        \"string\"\n" +
                        "    ],\n" +
                        "    \"tags\": [\n" +
                        "        {\n" +
                        "            \"id\": 0,\n" +
                        "            \"name\": \"string\"\n" +
                        "        }\n" +
                        "    ],\n" +
                        "    \"status\": \"available\"\n" +
                        "}")
                .when().post(baseUrl+resource)
                .then()
                .log().all().statusCode(200);



    }
}
