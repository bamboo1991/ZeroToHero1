package StepDefs.secondFolder;

import Utils.PayloadUtils;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Map;
import java.util.Properties;

public class stepsForCreating {
    HttpClient client;
    URIBuilder uri;
    HttpPost post;
    HttpResponse response;
    Properties properties;
    private String appJson;
    private int petId;
    @When("I will {string} one pet with id num {int}")
    public void i_will_one_pet_with_id_num(String action, Integer petId) throws URISyntaxException, IOException {
        this.petId=petId;
        client= HttpClientBuilder.create().build();
        uri = new URIBuilder();
        uri.setScheme("https").setHost("petstore.swagger.io").setPath("v2/pet");
        post=new HttpPost(uri.build());
        properties = new Properties();
        File file = new File("config.properties");
        FileInputStream fileInputStream = new FileInputStream(file);
        properties.load(fileInputStream);
        appJson=properties.getProperty("applicationJson");
        post.setHeader("Accept",appJson);
        post.setHeader("Content-Type",appJson);
        String getBody = PayloadUtils.getPetPayLoad(petId);
        HttpEntity entity = new StringEntity(getBody);
        post.setEntity(entity);
        response = client.execute(post);



    }

    @Then("check its existence by statud code {int}")
    public void check_its_existence_by_statud_code(int statusCode) {
        Assert.assertEquals(statusCode,response.getStatusLine().getStatusCode());

    }

    @Then("pet is created")
    public void pet_is_created() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> getDetails = objectMapper.readValue(response.getEntity().getContent(),new TypeReference<Map<String,Object>>(){});
        Assert.assertEquals(petId, getDetails.get("id"));
    }
}
