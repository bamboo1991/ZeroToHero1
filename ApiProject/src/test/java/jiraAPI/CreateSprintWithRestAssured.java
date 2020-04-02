package jiraAPI;

import Utils.PayloadUtils;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CreateSprintWithRestAssured {
@Test
    public void createSPrint(){
    RestAssured.baseURI="http://localhost:8080";
    RestAssured.basePath="rest/api/1.0/sprint";
    String SprintBody = PayloadUtils.getSprintBody("JC Sprint 9","Created in Rest Assured");
    Response response = given().accept(ContentType.JSON).contentType(ContentType.JSON)
            .cookie( "JSESSIONID","4EED3D13DD1F3E590BA272C1EAD6730E")
            .body(SprintBody)
            .when().post().then().statusCode(201).extract().response();

}
}
