package RESTASSSURED.PetOrder__Practice;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Test;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class practice__1 {
    @Test
    public void createPetOrder(){
        RestAssured.baseURI="https://petstore.swagger.io/v2";
        RestAssured.basePath="store/order";
        Map<String,Object> order = new HashMap<>();
        order.put("id",121);
        order.put("petId",212);
        order.put("quantity",12);
        order.put("shipDate", "03/29/2020");
        order.put("status", "placed");
        order.put("complete",true);
        Response response = given().accept(ContentType.JSON)
                .body(order).when().post();
        response.then().statusCode(200);
    }
    @Test
    public void CreateUsinGPOJO(){
        RestAssured.baseURI="https://petstore.swagger.io";
        RestAssured.basePath="v2/store/order";
        OrderPoJo orderPoJo =new OrderPoJo();
        orderPoJo.setId(21);
        orderPoJo.setPetId(211);
        orderPoJo.setQuantity(8);
        orderPoJo.setShipDate("2/2/20");
        orderPoJo.setComplete(true);
        Response response = given().accept(ContentType.JSON).contentType(ContentType.JSON)
                .body(orderPoJo).when().request(Method.POST);
        response.then().statusCode(200).and().body("petId", Matchers.is(21));

    }
}
