package RESTASSSURED.POST;


import APACHE_HTTP_CLIENT.PetPojo.Category;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class PostMethodOnRestAssured_______1 {


    @Test
    public void postMethod(){
        RestAssured.baseURI="https://reqres.in";
        RestAssured.basePath="api/users";

        Map<String, Object> reqBody = new HashMap<>();
        reqBody.put("name","Techtorial");
        reqBody.put("job", "SDET");
       Response response= given().accept(ContentType.JSON).contentType(ContentType.JSON)
                .body(reqBody)
                .when().post();
       response.then().statusCode(201).and().body("name", Matchers.is("Techtorial"));
    }
@Test
    public void CreatePet(){
        RestAssured.baseURI="https://petstore.swagger.io";
        RestAssured.basePath="v2/pet";
    File file = new File("petson.json");
        Response response= given().accept(ContentType.JSON).contentType(ContentType.JSON)
                .body(file)
                .when().post();
        response.then().statusCode(200).body("name",Matchers.is("Harlamov"));
    }
    @Test
    public void createPet2(){
        RestAssured.baseURI="https://petstore.swagger.io";
        RestAssured.basePath="v2/pet";
        String reqBody = "{\n" +
                "  \"id\": 203,\n" +
                "  \"category\": {\n" +
                "    \"id\": 7,\n" +
                "    \"name\": \"bulldog\"\n" +
                "  },\n" +
                "  \"name\": \"AkTash\",\n" +
                "  \"photoUrls\": [\n" +
                "    \"www.pictures.com\"\n" +
                "  ],\n" +
                "  \"tags\": [\n" +
                "    {\n" +
                "      \"id\": 17777,\n" +
                "      \"name\": \"tag name\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"status\": \"best friend\"\n" +
                "}";
        Response response = given().accept(ContentType.JSON).contentType(ContentType.JSON)
                .body(reqBody)
                .when().post();
        response.then().statusCode(200).body("name",Matchers.is("AkTash"));
    }
    @Test
    public void creatPet3(){
        RestAssured.baseURI="https://petstore.swagger.io";
        RestAssured.basePath="v2/pet";
        Category petBody = new Category();
        petBody.setId(113);
        petBody.setName("John");
        petBody.setStatus("sold");

        Response response=given().accept(ContentType.JSON).contentType(ContentType.JSON)
                .body(petBody).when().post();
        response.then().statusCode(200)
                .and().body("id",Matchers.is(113))
                .and().body("status",Matchers.is("sold"))
                .and().body("name",Matchers.is("John"));
    }



}

