package ArietProject;

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
import java.util.*;


public class ArietTestClass {


    @Test
    public void CreateAriet() throws IOException, URISyntaxException {
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> info1 = new HashMap<>();
        Map<String, Object> info2 = new HashMap<>();
        Map<String, Object> info3 = new HashMap<>();
        info1.put("name", "Ariet");
        info1.put("LastName", "Stamov");
        info1.put("Date", "11/22/1991");
        List<Map<String, Object>> liStMaps = new ArrayList<>();
        liStMaps.add(info1);
        info2.put("Name", "Sandu");
        info2.put("LastName", "Kurush");
        info2.put("Date", "12/15/1991");
        liStMaps.add(info2);
        info3.put("Name", "Sarah");
        info3.put("LastName", "Taalai");
        info3.put("Date", "11/22/1991");
        liStMaps.add(info3);
        Ariet ariet = new Ariet(1222, "Ariet", liStMaps, "married");
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        objectMapper.writeValue(new File("src\\test\\java\\ArietProject\\family.json"), ariet);
        HttpClient httpClient = HttpClientBuilder.create().build();
        URIBuilder uri = new URIBuilder();
        uri.setScheme("https").setHost("petstore.swagger.io").setPath("v2/pet");
        HttpPost httpPost = new HttpPost(uri.build());
        httpPost.addHeader("Content-Type", "application/json");
        httpPost.addHeader("Accept", "application/json");
        String json = objectMapper.writeValueAsString(ariet);
        StringEntity stringEntity = new StringEntity(json);
        httpPost.setEntity(stringEntity);
        HttpResponse response = httpClient.execute(httpPost);
        Assert.assertEquals(HttpStatus.SC_OK,response.getStatusLine().getStatusCode());
    }
}
