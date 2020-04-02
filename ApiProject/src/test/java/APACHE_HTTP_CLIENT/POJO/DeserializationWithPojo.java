package APACHE_HTTP_CLIENT.POJO;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

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
        Assert.assertEquals("Morris", userDetails.getData().getLast_name());
    }
    @Test
            public void serialize() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Ad ad = new Ad();
        ad.setText("Text1");
        ad.setCompany("Techtoril Academy");
        ad.setUrl("www.techtorialacademy.com");
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        Data data = new Data();
        UserPojo userPojo = new UserPojo();
        data.setAvatar("www.google.com");
        data.setEmail("ariet.com");
        data.setFirst_name("Pojo");
        data.setLast_name("Mojo");
        data.setId(02);
        userPojo.setAd(ad);
        userPojo.setData(data);
        File file = new File("src\\test\\java\\APACHE_HTTP_CLIENT.POJO\\ad.json");
        objectMapper.writeValue(file, userPojo);





    }

}

