package StepDefs.BreakingBad;


import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;


import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class BreakingBadSteps {


    Response response;

    @When("the user Get all quotes {string}")
    public void the_user_Get_all_quotes(String action) {
        String value = "positive";
        if (action.equals("positive")) {
            response = given().accept(ContentType.JSON).when().get("https://www.breakingbadapi.com/api/quotes");
            List<Map<String, Object>> data = response.getBody().as(new TypeRef<List<Map<String, Object>>>() {
            });
            for (int i = 0; i < data.size(); i++) {
                Map<String, Object> quote = data.get(i);
                System.out.println(quote.get("quote"));
            }
        } else {

            List<Map<String, Object>> data = response.getBody().as(new TypeRef<List<Map<String, Object>>>() {
            });
            for (int i = 0; i < data.size(); i++) {
                Map<String, Object> quotesForNegative = data.get(i);
                System.out.println(quotesForNegative.get("quote"));
            }

        }

    }

    @When("status code is {int}")
    public void status_code_is(int statusCode) {
        response.then().statusCode(statusCode);
    }

    @Then("the user get the expected amount of Quotes")
    public void the_user_get_the_expected_amount_of_Quotes() {
        List<Map<String, Object>> data = response.getBody().as(new TypeRef<List<Map<String, Object>>>() {
        });
        Assert.assertTrue(data.size() > 0);
    }
}
