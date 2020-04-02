package APACHE_HTTP_CLIENT;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.*;

public class PrintArray {
    @Test
    public void printArray() throws URISyntaxException, IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        HttpClient httpClient = HttpClientBuilder.create().build();
        URIBuilder uri = new URIBuilder();
        uri.setScheme("https").setHost("breakingbadapi.com").setPath("api/characters");
        HttpGet httpGet = new HttpGet(uri.build());
        Properties properties = new Properties();
        File file = new File("config.properties");
        FileInputStream fileInputStream = new FileInputStream(file);
        properties.load(fileInputStream);
        String json = properties.getProperty("applicationJson");
        httpGet.addHeader("Accept", json);
        HttpResponse response = httpClient.execute(httpGet);
        List<Map<String, Object>> getArrays = objectMapper.readValue(response.getEntity().getContent(),
                new TypeReference<List<Map<String, Object>>>() {
                });
        List<Object> occupation = new ArrayList<>();
       int [] nums = new int[]{};
       int count =0;
        for (Map<String, Object> map : getArrays) {
            occupation.add(map.get("occupation"));
            nums[count++]=(int) map.get("better_call_saul_appearance");
            System.out.println(nums);




            }

}


        }


