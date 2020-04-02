package RESTASSSURED;


import io.restassured.http.ContentType;
import io.restassured.response.Response;

import org.junit.Test;


import static io.restassured.RestAssured.given;


public class RestAssuredPoJoIntro {
    @Test
    public void getPet() {
        Response response = given().accept(ContentType.JSON)
                .when().get("https://petstore.swagger.io/v2/pet/112233");
        response.then().statusCode(200);
    }


}


