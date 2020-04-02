package RESTASSSURED;

import io.cucumber.java.it.Ma;
import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class RestAssuredTypeRefIntro {
    @Before
    public void setup(){
        RestAssured.baseURI="https://reqres.in";
        RestAssured.basePath="api/users";
    }

    @Test
    public void typeReferenceDeserialization(){
        Response response= given().accept(ContentType.JSON)
                .when().log().all().get("/7");
Map<String,Object> map =  response.getBody().as(new TypeRef<Map<String,Object>>() {
});
        System.out.println(map.get("data"));
        Map<String,Object> userDetails = (Map<String,Object>) map.get("data");
        Assert.assertEquals("Email is invalid","michael.lawson@reqres.in",map.get("email"));
    }
    @Test
    public void getQuoates(){
        Response response = given().accept(ContentType.JSON)
                .when()
                .get("https://www.breakingbadapi.com/api/quotes");

           response.then().statusCode(200);

          List<Map<String,Object>> quotesList = (List<Map<String, Object>>) response.getBody().as(new TypeRef<Object>() {
          });
          Assert.assertTrue(quotesList.size()>0);


    }}
