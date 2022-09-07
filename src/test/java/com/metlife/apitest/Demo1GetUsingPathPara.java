package com.metlife.apitest;

import io.restassured.RestAssured;

public class Demo1GetUsingPathPara {
public static String baseUrl="https://petstore.swagger.io/v2/";

    public static void main(String[] args) {
        int petId=905;
        String resource="pet/"+petId;

        RestAssured.when().get(baseUrl+resource).then().statusCode(200);
    }
}
