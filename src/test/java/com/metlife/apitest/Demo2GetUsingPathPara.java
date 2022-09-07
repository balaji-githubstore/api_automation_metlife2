package com.metlife.apitest;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class Demo2GetUsingPathPara {
public static String baseUrl="https://petstore.swagger.io/v2/";

    public static void main(String[] args) {
        int petId=905;
        String resource="pet/"+petId;

        String response=RestAssured.given().when().get(baseUrl+resource).then().extract().asString();

        System.out.println(response);
        System.out.println(response.contains("901"));

        System.out.println(response.contains("doggie-501"));
    }
}
