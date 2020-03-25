package StepDefs.firstFolder;

import Utils.PayloadUtils;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Assert;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.net.URISyntaxException;

import java.util.Map;
import java.util.Properties;


public class ComboCreate_Delete {
    private HttpClient httpClient;
    private HttpResponse httpResponse;
    private URIBuilder uri;
    private String appJson;
    private int petId;
    public static final String ID = "id";
    public static final String NAME = "name";
    public static final String HTTPS = "https";
    @When("user {string} a pet with id {int}")
    public void user_creates_a_pet(String action, Integer petId) throws IOException, URISyntaxException {
        this.petId = petId;
        httpClient = HttpClientBuilder.create().build();
        uri = new URIBuilder();
        uri.setScheme(HTTPS);
        uri.setHost("petstore.swagger.io");
        if (action.equalsIgnoreCase("creates")) {
            uri.setPath("v2/pet");
            Properties properties = new Properties();
            File file = new File("config.properties");
            FileInputStream fileInputStream = new FileInputStream(file);
            properties.load(fileInputStream);
            appJson = properties.getProperty("applicationJson");
            HttpPost httpPost = new HttpPost(uri.build());
            httpPost.setHeader("Accept", appJson);
            httpPost.setHeader("Content-Type", appJson);
            String requestBody = PayloadUtils.getPetPayLoad(petId);
            HttpEntity entity = new StringEntity(requestBody);
            httpPost.setEntity(entity);
            httpResponse = httpClient.execute(httpPost);
        } else if (action.equalsIgnoreCase("deletes")) {
            uri.setPath("v2/pet/" + petId);
            HttpDelete delete = new HttpDelete(uri.build());
            httpResponse = httpClient.execute(delete);
        }
    }
    @Then("the status code should be {int}")
    public void the_status_code_should_be(int statusCode) {
        Assert.assertEquals(statusCode, httpResponse.getStatusLine().getStatusCode());
        Assert.assertEquals(appJson, httpResponse.getEntity().getContentType().getValue());
    }
    @Then("pet is {string}")
    public void pet_is_created(String action) throws URISyntaxException, IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        uri.setPath("v2/pet/" + petId);
        HttpGet get = new HttpGet(uri.build());
        HttpResponse response = httpClient.execute(get);
        Map<String, Object> getPetDetails = objectMapper.readValue(response.getEntity().getContent(),
                new TypeReference<Map<String, Object>>() {
                });
        Assert.assertEquals(petId, getPetDetails.get(ID));
        Assert.assertEquals("Black Star", getPetDetails.get(NAME));
    }
}
