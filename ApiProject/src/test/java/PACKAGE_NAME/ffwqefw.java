package PACKAGE_NAME;

import Utils.PayloadUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Assert;
import org.junit.Test;
import reqresProject.CreateUser;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.util.Map;
import java.util.Properties;

public class ffwqefw {
    @Test
    public void createNewUser() throws URISyntaxException, IOException {
        ObjectMapper objectMapper =new ObjectMapper();
        HttpClient httpClient = HttpClientBuilder.create().build();
        URIBuilder uri = new URIBuilder();
        uri.setScheme("https").setHost("reqres.in").setPath("api/users");
        HttpPost httpPost = new HttpPost(uri.build());
        Properties properties = new Properties();
        File file = new File("config.properties");
        FileInputStream fileInputStream = new FileInputStream(file);
        properties.load(fileInputStream);
        String json = properties.getProperty("applicationJson");


        httpPost.addHeader("Content-Type", json);
        httpPost.addHeader("Accept", json);
        String name = "Nursultan";
        String job = "president";
        String requestBody = PayloadUtils.setUserNameAndJobTitle(name, job);
        HttpEntity entity = new StringEntity(requestBody);//polymorphism
        httpPost.setEntity(entity); //setting request body
        HttpResponse response = httpClient.execute(httpPost);
        Assert.assertEquals(HttpStatus.SC_CREATED, response.getStatusLine().getStatusCode());
        System.out.println(response.getStatusLine().getStatusCode());
        Assert.assertTrue(response.getEntity().getContentType().getValue().contains(json));
        ObjectMapper mapper = new ObjectMapper();
        Map<String, String> details = mapper.readValue(response.getEntity().getContent(),
                new TypeReference<Map<String, String>>() {
                });
        Assert.assertEquals(name, details.get("name"));
        Assert.assertEquals(job, details.get("job"));

    }
    }
