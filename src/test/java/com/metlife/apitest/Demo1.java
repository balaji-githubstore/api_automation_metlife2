package com.metlife.apitest;

import com.fasterxml.jackson.databind.ObjectMapper;
import groovy.json.JsonParser;
import groovy.json.JsonSlurper;
import io.restassured.internal.mapping.GsonMapper;

import io.restassured.path.json.JsonPath;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Demo1 {

    public static void main(String[] args) throws IOException {

        FileInputStream file=new FileInputStream("data/data.json");

        JsonPath json=new JsonPath(file);

//        System.out.println(json.prettify());

        String s = json.get("id").toString();
        System.out.println(s);

        System.out.println(json.get("tags").toString());
        System.out.println(json.get("status").toString());
        System.out.println(json.get("name").toString());
        System.out.println(json.get("photoUrls").toString());
        System.out.println(json.get("name").toString());
        System.out.println(json.get("category").toString());
        System.out.println(json.get("id").toString());

        System.out.println(json.getMap("category").get("id"));
        System.out.println(json.getMap("category").get("name"));

        ObjectMapper mapper = new ObjectMapper();

        System.out.println(mapper.readTree(new File("data/data.json")));

        System.out.println(mapper.readTree(new File("data/data.json")).equals(mapper.readTree(new File("data/data.json"))));

        System.out.println(mapper.readTree(new File("data/data.json")).get("id"));

        System.out.println(mapper.readTree(new File("data/data.json")).get("category").get("name"));

        System.out.println(mapper.readTree(new File("data/data.json")).equals(mapper.readTree(new File("data/data1.json"))));
    }
}
