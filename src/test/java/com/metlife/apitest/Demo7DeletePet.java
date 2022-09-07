package com.metlife.apitest;

import io.restassured.RestAssured;

public class Demo7DeletePet {
public static String baseUrl="https://petstore.swagger.io/v2/";

    public static void main(String[] args) {
        int petId=905;
        String resource="pet/"+petId;

        String response=RestAssured.given().when().delete(baseUrl+resource).then().extract().asString();

        System.out.println(response);
        System.out.println(response.contains("901"));

        System.out.println(response.contains("doggie-501"));
    }
}
