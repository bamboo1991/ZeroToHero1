package jiraAPI.JiraApiRequestBoeard;

import Utils.JiraUtils;
import Utils.PayloadUtils;
import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import org.junit.Assert;
import org.junit.Test;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.request;

public class TestBoard {
    @Test
    public void getBoard(){

        RestAssured.baseURI="http://localhost:8080";
        RestAssured.basePath="rest/agile/1.0/board";
        Response response = given().accept(ContentType.JSON)
                .cookie("JSESSIONID",JiraUtils.getSessionIdCookie())
                .when()
                .get();
                response.then().statusCode(200).extract().response();
        BoardPojo GET= response.getBody().as((BoardPojo.class));

        System.out.println(GET.getValues().get(0).getId());
        System.out.println(GET.getValues().get(0).getName());
        Assert.assertEquals("Board info verification Failure ",GET.getTotal(),GET.getValues().size());
        Assert.assertTrue(GET.getValues().get(0).getName().toString().startsWith("JC"));
        Assert.assertEquals(GET.getValues().get(0).getType(),"scrum");
    }
    @Test
    public void addComment(){
        RestAssured.baseURI="http://localhost:8080";
        RestAssured.basePath="/rest/api/2/issue";

        String comment = "Fixed the bug, please check";
        Response response=given().cookie("JSESSIONID",JiraUtils.getSessionIdCookie())
                .accept(ContentType.JSON).contentType(ContentType.JSON)
                .body(PayloadUtils.getComment(comment))
                .when().post("{issueId}/comment","JC-9").then().statusCode(201).extract().response();
        CommentPojo commentPojo = response.getBody().as(CommentPojo.class);
        Assert.assertEquals(comment,commentPojo.getBody());
    }


}
