package RESTASSSURED.POST;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.when;

public class RestAssuredDelete {
    @Test
    public void deletePet(){
        RestAssured.baseURI="https://petstore.swagger.io";
        RestAssured.basePath="v2/pet";
        Response response=when().delete("/112233");
        response.then().statusCode(200);
    }
    @Test
    public void deletePet2(){
        RestAssured.baseURI="https://petstore.swagger.io";
        RestAssured.basePath="v2/pet";

        when().request("DELETE","/{petId}",112344).then().statusCode(200);
    }

}
