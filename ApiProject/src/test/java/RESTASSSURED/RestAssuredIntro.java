package RESTASSSURED;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class RestAssuredIntro {
    @Before
    public void setUp(){
        RestAssured.baseURI="https://reqres.in";
        RestAssured.basePath="api/users";
    }
    @Test
    public void restAssured() {
        given().accept(ContentType.JSON)
                .when()
                .get()
                .then().statusCode(200).contentType(ContentType.JSON).body("page", equalTo(1));
    }

    @Test
    public void restAssuredGetUser() {
        given().accept(ContentType.JSON)
                .when()
                .get("/11")
                .then().statusCode(200)
                .and().body("data.first_name", equalTo("George")).log().body();
    }

    @Test
    public void getText() {
        given().accept(ContentType.JSON)
                .when()
                .get("/11")
                .then().statusCode(200)
                .and().body("ad.text", notNullValue()).log();
    }

    @Test
    public void getAllUsers() {
        given().accept(ContentType.JSON)
                .when()
                .get()
                .then().statusCode(200)
                .body("data", Matchers.hasSize(6)).log().body();
    }

    @Test
    public void getAllUsers1() {
        given().accept(ContentType.JSON)
                .when()
                .get()
                .then().statusCode(200)
                .body("data[1].last_name", Matchers.equalTo("Weaver")).log().body();
    }

    @Test
    public void get12Users() {

        Map<String ,Object> maps = new HashMap<>();
        maps.put("aieef",21);
        maps.put("per_page",12);
        given().accept(ContentType.JSON).params(maps)
                .when()
                .get()
                .then().body("data", Matchers.hasSize(12)).log().body();
    }
    @Test
    public void getUserResponse(){
        Response response=given().accept(ContentType.JSON)
                .when()
                .get();
          response.then().statusCode(200).and().body("data.id",Matchers.hasSize(6)).log().body();
    }
}
