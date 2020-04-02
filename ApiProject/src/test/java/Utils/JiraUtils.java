package Utils;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class JiraUtils {
    public static String getSessionIdCookie(){
        RestAssured.baseURI="http://localhost:8080";
        RestAssured.basePath="rest/auth/1/session";
        String credentials = PayloadUtils.logInBody(ConfigReader.getProperty("jiraUserName"),
                ConfigReader.getProperty("jiraPassword"));
        String jsessionid = given().accept(ContentType.JSON).contentType(ContentType.JSON)
                .body(credentials)
                .when().post().then().statusCode(200).extract().cookie("JSESSIONID");
        return jsessionid;

    }
}
