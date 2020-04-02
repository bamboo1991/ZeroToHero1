package StepDefs.BreakingBad;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;


import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Test2negative {
    Response response;
    SoftAssert softAssert;

    @Before
    public void setUp() {
        RestAssured.baseURI = "https://www.breakingbadapi.com";
        RestAssured.basePath = "api/quotes";
    }

    @Given("the user Get all the quotes {string}")
    public void the_user_Get_all_the_quotes(String negative) {
        response = given().accept(ContentType.JSON).when().get();
        List<Map<String, Object>> data = response.getBody().as(new TypeRef<List<Map<String, Object>>>() {
        });
        for (int i = 0; i < data.size(); i++) {
            Map<String, Object> wholeData = data.get(i);
            System.out.println(wholeData.get("quote"));
        }

    }

    @Given("the status code is {int}")
    public void the_status_code_is(int statusCode) {
        int actualCode = response.statusCode();
       Assert.assertTrue(statusCode!=actualCode);
    }

    @Then("the user don't get the expected amount of Quotes")
    public void the_user_don_t_get_the_expected_amount_of_Quotes() {
        int expectedAmount = 81;
        List<Map<String, Object>> data = response.getBody().as(new TypeRef<List<Map<String, Object>>>() {
        });
        Assert.assertTrue(expectedAmount!=data.size());

    }
}
