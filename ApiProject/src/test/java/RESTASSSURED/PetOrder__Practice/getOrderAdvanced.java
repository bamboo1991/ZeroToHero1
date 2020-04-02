package RESTASSSURED.PetOrder__Practice;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class getOrderAdvanced {
    @Test
    public void getOrder(){
        RestAssured.baseURI="https://petstore.swagger.io";
        RestAssured.basePath="v2/store/order";

        Response response= given().accept(ContentType.JSON).contentType(ContentType.JSON)
                .when().get("/{orderId}",1999);
        System.out.println(response.path("orderId").toString());

        JsonPath jsonPath = response.jsonPath();
        System.out.println(jsonPath.getMap("$"));
        response.then().statusCode(200);
    }
    @Test
    public void getAllEmial(){
            RestAssured.baseURI="https://reqres.in";
            RestAssured.basePath="api/users";
            Response response=given().accept(ContentType.JSON).contentType(ContentType.JSON)
                    .when().get().then().statusCode(200).extract().response();
            JsonPath jsonPath = response.jsonPath();
        List<Map<String,Object>> listEmails = jsonPath.getList("data");
        for (int i=0;i<listEmails.size();i++){
            System.out.println(listEmails.get(i).get("email"));
        }



    }
    @Test
    public void getAllUsers(){
        RestAssured.baseURI="https://reqres.in";
        RestAssured.basePath="api/users";
        Response response = given().accept(ContentType.JSON).contentType(ContentType.JSON)
                .when().request("GET").then().statusCode(200).extract().response();
        JsonPath jsonPath = response.jsonPath();
        List<Map<String,Object>> listOfUsers = jsonPath.getList("data");
        listOfUsers.forEach(f -> System.out.println(f.get("email")));

    }
}
//0789b89e0fa24c2984a59c894a2c5f2c