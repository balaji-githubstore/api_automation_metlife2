package com.metlife.apitest;

import io.restassured.RestAssured;

public class Demo3GetUsingQueryParameter {
public static String baseUrl="https://petstore.swagger.io/v2/";

    public static void main(String[] args) {

        String resource="pet/findByStatus";

        String response=RestAssured
                .given().queryParam("status","sold").queryParam("status","available")
                .when().get(baseUrl+resource)
                .then().statusCode(200)
                .extract().asString();

        System.out.println(response);

    }
}
