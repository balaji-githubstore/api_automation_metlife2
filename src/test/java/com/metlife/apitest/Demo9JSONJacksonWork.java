package com.metlife.apitest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;

import java.io.*;

public class Demo9JSONJacksonWork {

    public static void main(String[] args) throws IOException {



        FileInputStream file=new FileInputStream("data/data.json");
        ObjectMapper mapper=new ObjectMapper();
        JsonNode json1= mapper.readTree(file);


        System.out.println(json1.get("id"));
        System.out.println(json1.get("name"));
        System.out.println(json1.get("category"));

        System.out.println(json1.get("category").get("id"));
        System.out.println(json1.get("category").get("name"));

        FileInputStream file2=new FileInputStream("data/data2.json");

        JsonNode json2= mapper.readTree(file2);

        System.out.println(json1.equals(json2));

        //equals method inside JsonNode - compares json file
        Assert.assertTrue(json1.equals(json2));  //expect true

    }
}
