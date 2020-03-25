package POJO;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Map;

public class DeserializationWithPojo {
    @Test
    public void getUser() throws URISyntaxException, IOException {
        HttpClient client = HttpClientBuilder.create().build();
        URIBuilder uri = new URIBuilder();
        uri.setScheme("https").setHost("reqres.in").setPath("api/users/5");
        HttpGet get = new HttpGet(uri.build());
        get.addHeader("Accept", "application/json");
        get.addHeader("Content-Type", "application/json");
        HttpResponse response = client.execute(get);
        ObjectMapper objectMapper = new ObjectMapper();

        UserPojo userDetails = objectMapper.readValue(response.getEntity().getContent(), UserPojo.class);
        System.out.println(userDetails.getData().getAvatar());
        System.out.println(userDetails.getAd().getCompany());
        Assert.assertEquals("Charles", userDetails.getData().getFirst_name());
        Assert.assertEquals("Morris",userDetails.getData().getLast_name());


    }

}

