package RESTASSSURED.PetOrder__Practice;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.testng.collections.ListMultiMap;

import javax.print.DocFlavor;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class ResAssuredAdavanced1 {
    @Before
    public void setUp() {
        RestAssured.baseURI = "http://api.football-data.org";
        RestAssured.basePath = "v2/competitions/2000/teams";
    }

    @Test
    public void getteam() {
        RestAssured.baseURI = "http://api.football-data.org";
        RestAssured.basePath = "v2/competitions/2000/teams";
        Response response = given().accept(ContentType.JSON)
                .header("X-Auth-Token", "0789b89e0fa24c2984a59c894a2c5f2c")
                .when().request("GET").then().statusCode(200).extract().response();

        Map<String, Object> japan = response.path("teams.find {it.name == 'Japan'}");
        Assert.assertEquals(japan.get("name"), "Japan");
        System.out.println(japan.get("name"));
    }

    @Test
    public void get2169() {
        Response response = given().accept(ContentType.JSON).header("X-Auth-Token", "0789b89e0fa24c2984a59c894a2c5f2c")
                .when().request("GET").then().statusCode(200).extract().response();

        Map<String, Object> data = response.getBody().as(new TypeRef<Map<String, Object>>() {
        });

        List<Object> list = (List<Object>) data.get("teams.find {it.id }.name ");
        System.out.println(list);
    }

    @Test
    public void FindAll() {
        Response response = given().accept(ContentType.JSON).header("X-Auth-Token", "0789b89e0fa24c2984a59c894a2c5f2c")
                .when().request("GET").then().statusCode(200).extract().response();
        List<String> countryNames = response.path("teams.finAll { it.founded < 1900 }.name");
        System.out.println(countryNames);
    }

    @Test
    public void findMax() {
        Response response = given().accept(ContentType.JSON).header("X-Auth-Token", "0789b89e0fa24c2984a59c894a2c5f2c")
                .when().request(Method.GET).then().statusCode(200).extract().response();
        System.out.println(response.path("teams.max {it.id}.area.name").toString());
    }

    @Test
    public void collect() {
        Response response = given().accept(ContentType.JSON).header("X-Auth-Token", "0789b89e0fa24c2984a59c894a2c5f2c")
                .when().request(Method.GET).then().statusCode(200).extract().response();
        int sumOfIDS = response.path("teams.collect {it.id}.sum()");
        System.out.println(sumOfIDS);
        List<String> names = response.path("teams.collect {it.name}");
        System.out.println(names);
    }

    @Test
    public void getCountry() {
        Response response = given().accept(ContentType.JSON).header("X-Auth-Token", "0789b89e0fa24c2984a59c894a2c5f2c")
                .when().request(Method.GET).then().statusCode(200).extract().response();

        List<String> webSites = response.path("teams.collect{it.website}");
        List<String> counties = response.path("teams.collect{it.name}");
        System.out.println(webSites);
    }

    @Test
    public void generatingDataType() {
        Response response = given().accept(ContentType.JSON).header("X-Auth-Token", "0789b89e0fa24c2984a59c894a2c5f2c")
                .when().request(Method.GET).then().statusCode(200).extract().response();
        Map<String, ?> competition = response.path("competition");
        Map<String, Object> area = (Map<String, Object>) competition.get("area");
        System.out.println(area.get("name"));
    }

    @Test
    public void getCount() {
        Response response = given().accept(ContentType.JSON).header("X-Auth-Token", "0789b89e0fa24c2984a59c894a2c5f2c")
                .when().request(Method.GET).then().statusCode(200).extract().response();
        Map<String, Object> count = response.getBody().as(new TypeRef<Map<String, Object>>() {
        });
        System.out.println(count.get("count"));
    }

    @Test
    public void getCompetitionInfo() {
        Response response = given().accept(ContentType.JSON).header("X-Auth-Token", "0789b89e0fa24c2984a59c894a2c5f2c")
                .when().request(Method.GET).then().statusCode(200).extract().response();

        Map<String, ?> getInfo = response.getBody().as(new TypeRef<Map<String, ?>>() {
        });
        Map<String, Object> id = (Map<String, Object>) getInfo.get("competition");
        System.out.println(id.get("id"));
    }

    @Test
    public void getAreaId() {

        Response response = given().accept(ContentType.JSON).header("X-Auth-Token", "0789b89e0fa24c2984a59c894a2c5f2c")
                .when().request(Method.GET).then().statusCode(200).extract().response();

        Map<String, ?> getID = response.path("competition");
        Map<String, Object> ids = (Map<String, Object>) getID.get("area");
        System.out.println(ids.get("id"));
        System.out.println(ids.get("name"));
    }

    @Test
    public void printWFC___Info() {
        Response response = given().accept(ContentType.JSON).header("X-Auth-Token", "0789b89e0fa24c2984a59c894a2c5f2c")
                .when().request(Method.GET).then().statusCode(200).extract().response();

        Map<String, ?> info = response.getBody().as(new TypeRef<Map<String, ?>>() {
        });
        Map<String, Object> data = (Map<String, Object>) info.get("competition");
        System.out.println(data.get("name"));

    }

    @Test
    public void printSeasonInfo() {
        Response response = given().accept(ContentType.JSON).header("X-Auth-Token", "0789b89e0fa24c2984a59c894a2c5f2c")
                .when().request(Method.GET).then().statusCode(200).extract().response();
        Map<String, ?> season = response.path("season");
        Map<String, Object> winnerName = (Map<String, Object>) season.get("winner");
        System.out.println(winnerName.get("name"));
    }

    @Test
    public void teams() {
        Response response = given().accept(ContentType.JSON).header("X-Auth-Token", "0789b89e0fa24c2984a59c894a2c5f2c")
                .when().request(Method.GET).then().statusCode(200).extract().response();
        Map<String, ?> startsWithY = response.path("teams.find {it.name == 'Japan'}");
        System.out.println(startsWithY.get("name"));
    }

    @Test
    public void getAllTeams() {
        Response response = given().accept(ContentType.JSON).header("X-Auth-Token", "0789b89e0fa24c2984a59c894a2c5f2c")
                .when().get().then().statusCode(200).extract().response();

        List<String> teams = response.path("teams.collect{it.name}");
        System.out.println(teams);
    }

    @Test
    public void getSum() {
        Response response = given().accept(ContentType.JSON).header("X-Auth-Token", "0789b89e0fa24c2984a59c894a2c5f2c")
                .when().request(Method.GET).then().statusCode(200).extract().response();
        int sum = response.path("teams.collect{it.id}.sum() ");
        System.out.println(sum);
    }
    @Test
    public void printFirstFounded(){
        Response response= given().accept(ContentType.JSON).header("X-Auth-Token","0789b89e0fa24c2984a59c894a2c5f2c")
                .when().request(Method.GET).then().statusCode(200).extract().response();
        List<String> foundedCountry = response.path("teams.findAll {it.founded<1900}.name");
        System.out.println(foundedCountry);
    }


}



