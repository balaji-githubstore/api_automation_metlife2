package com.metlife.apitest;

import io.restassured.path.json.JsonPath;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo8JSONWork {

    public static void main(String[] args) throws FileNotFoundException {


        FileInputStream file=new FileInputStream("data/data.json");

        JsonPath json=new JsonPath(file);

        int id= json.get("id");
        System.out.println(id);

        String name= json.get("name");
        System.out.println(name);

        System.out.println(json.get("category").toString());
    }
}
