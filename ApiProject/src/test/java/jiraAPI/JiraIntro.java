package jiraAPI;

import Utils.JiraUtils;
import Utils.PayloadUtils;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import org.junit.Test;



import static io.restassured.RestAssured.given;

public class JiraIntro {


    @Test
    public void createStory(){
        RestAssured.baseURI="http://localhost:8080";
        RestAssured.basePath="rest/api/2/issue";
        String body =PayloadUtils.getJiraStoryBody("Bug","bamboo1991",
                "Learn how to work with Jira",
                "Working on the JIra","High");
       Response response=given().accept(ContentType.JSON).contentType(ContentType.JSON)
               .cookie("JSESSIONID", JiraUtils.getSessionIdCookie())
               .body(body)
               .when().post().then().statusCode(201).extract().response();
    }
}
