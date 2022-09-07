package com.metlife.apitest;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo5PostAddPet {
public static String baseUrl="https://petstore.swagger.io/v2/";

    public static void main(String[] args) throws FileNotFoundException {

        String resource="pet";

        FileInputStream file=new FileInputStream("data/data.json");

        JsonPath json=new JsonPath(file);

        String jsonBody=json.prettify();
        System.out.println(jsonBody);

        RestAssured
                .given().headers("Content-Type","application/json")
                .body(jsonBody)
                .when().post(baseUrl+resource)
                .then()
                .log().all().statusCode(200);
    }
}
