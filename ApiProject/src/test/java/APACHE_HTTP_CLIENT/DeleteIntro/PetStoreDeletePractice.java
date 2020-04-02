package APACHE_HTTP_CLIENT.DeleteIntro;

import Utils.PayloadUtils;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
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



public class PetStoreDeletePractice {
    @Test
    public void CreateApetAndDelete() throws URISyntaxException, IOException {
        HttpClient httpClient = HttpClientBuilder.create().build();
        URIBuilder uri = new URIBuilder();
        uri.setScheme("https").setHost("petstore.swagger.io").setPath("v2/pet");
        HttpPost httpPost = new HttpPost(uri.build());
        Properties properties = new Properties();
        File file = new File("config.properties");
        FileInputStream fileInputStream = new FileInputStream(file);
        properties.load(fileInputStream);
        String appJson = properties.getProperty("applicationJson");
        httpPost.setHeader("Accept", appJson);
        httpPost.setHeader("Content-Type", appJson);
        ObjectMapper objectMapper = new ObjectMapper();
        String request = PayloadUtils.getPetPayLoad(12);
        HttpEntity entity = new StringEntity(request);
        httpPost.setEntity(entity);
        HttpResponse httpResponse = httpClient.execute(httpPost);
        Map<String,Object> getPetDetails1 = objectMapper.readValue(httpResponse.getEntity().getContent(),new TypeReference<Map<String,Object>>(){});
        Assert.assertEquals(12, getPetDetails1.get("id"));
        Assert.assertEquals("Black Star", getPetDetails1.get("name"));


        uri.setPath("v2/pet/" + 12);
        HttpGet httpGet = new HttpGet(uri.build());
        HttpResponse response1 = httpClient.execute(httpGet);
        Map<String, Object> getPetDetails = objectMapper.readValue(response1.getEntity().getContent(), new TypeReference<Map<String, Object>>() {
        });
        Assert.assertEquals(12, getPetDetails.get("id"));
        Assert.assertEquals("Black Star", getPetDetails.get("name"));


    }


}
