package APACHE_HTTP_CLIENT.Api;

import Utils.PayloadUtils;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Map;
import java.util.Properties;

public class PostAndVerifyThePet {
    private HttpResponse response;
    @Test
    public void createUser() throws IOException, URISyntaxException {
        int petID = 6576575;
        HttpClient client = HttpClientBuilder.create().build();
        URIBuilder uri = new URIBuilder();
        uri.setScheme("https").setHost("petstore.swagger.io").setPath("v2/pet");
        HttpPost httpPost = new HttpPost(uri.build());
        Properties properties = new Properties();
        File file = new File("config.properties");
        FileInputStream fileInputStream = new FileInputStream(file);
        properties.load(fileInputStream);
        String json = properties.getProperty("applicationJson");

        httpPost.addHeader("Accept", json);
        httpPost.addHeader("Content-Type", json);

        String body = PayloadUtils.getPetPayLoad(petID);

        HttpEntity entity = new StringEntity(body);
        httpPost.setEntity(entity);
        response = client.execute(httpPost);
        Assert.assertEquals(HttpStatus.SC_OK, response.getStatusLine().getStatusCode());
        Assert.assertEquals(json, response.getEntity().getContentType().getValue());


        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> getPetValue = objectMapper.readValue(response.getEntity().getContent(),
                new TypeReference<Map<String, Object>>() {
                });


        Assert.assertEquals(petID, getPetValue.get("id"));
        Assert.assertEquals("Black Star", getPetValue.get("name"));
        uri.setPath("v2/pet/" + petID);
        HttpGet httpGet = new HttpGet(uri.build());
        HttpResponse response = client.execute(httpGet);
        Map<String, Object> getPetDetails = objectMapper.readValue(response.getEntity().getContent(), new
                TypeReference<Map<String, Object>>() {
                });
        Assert.assertEquals(petID, getPetDetails.get("id"));
        Assert.assertEquals("Black Star", getPetDetails.get("name"));


    }
}