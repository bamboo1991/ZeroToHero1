package APACHE_HTTP_CLIENT.reqresProject;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

public class CreatedUser {
    @Test
    public void createUser() throws IOException, URISyntaxException {
        CreateUser user = new CreateUser("Mercury", "SDET");
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        objectMapper.writeValue(new File("src\\test\\java\\APACHE_HTTP_CLIENT.reqresProject\\new.json"), user);
        HttpClient httpClient = HttpClientBuilder.create().build();
        URIBuilder uri = new URIBuilder();
        uri.setScheme("https").setHost("reqres.in").setPath("api/users");
        HttpPost httpPost = new HttpPost(uri.build());
        httpPost.addHeader("Content-Type", "application/json");
        httpPost.addHeader("Accept", "application/json");
        String json = objectMapper.writeValueAsString(user);
        StringEntity entity = new StringEntity(json);
        httpPost.setEntity(entity);
        HttpResponse response = httpClient.execute(httpPost);
        CreateUser createUser = objectMapper.readValue(response.getEntity().getContent(),CreateUser.class);
        Assert.assertEquals(createUser.getName(),user.getName());
        Assert.assertEquals(createUser.getJob(),user.getJob());
        Assert.assertEquals(HttpStatus.SC_CREATED, response.getStatusLine().getStatusCode());
        System.out.println(response.getStatusLine().getStatusCode());
    }
}
