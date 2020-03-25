package PetStore.PetSerializeClass;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.it.Ma;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class PrintAllPetData {
    @Test
    public void printAllPetInfo() throws URISyntaxException, IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        HttpClient httpClient = HttpClientBuilder.create().build();
        URIBuilder uri = new URIBuilder();
        uri.setScheme("https").setHost("petstore.swagger.io").setPath("v2/pet/112233");
        HttpGet httpGet = new HttpGet(uri.build());
        httpGet.addHeader("Accept","application/json");
        HttpResponse response = httpClient.execute(httpGet);
        Map<String, Object> deserialization = objectMapper.readValue(response.getEntity().
                getContent(),new TypeReference<Map<String,Object>>(){});
        System.out.println("Pet id is: "+deserialization.get("id"));
        Map<String,Object> listOfObjects = (Map<String,Object>) deserialization.get("category");
        System.out.println("category id is: "+listOfObjects.get("id"));
        System.out.println("Pet name is: "+listOfObjects.get("name"));
        System.out.println(deserialization.get("name"));
        System.out.println(deserialization.get("photoUrls"));
        System.out.println(deserialization.get("tags"));



    }
}
