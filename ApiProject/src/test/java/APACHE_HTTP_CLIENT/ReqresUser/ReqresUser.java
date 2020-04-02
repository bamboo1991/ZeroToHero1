package APACHE_HTTP_CLIENT.ReqresUser;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Map;

public class ReqresUser {
    @Test
    public void reqresUser() throws URISyntaxException, IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        HttpClient httpClient = HttpClientBuilder.create().build();
        URIBuilder uri = new URIBuilder();
        uri.setScheme("https");
        uri.setHost("reqres.in");
        uri.setPath("api/users/2");
        HttpGet httpGet = new HttpGet(uri.build());
        httpGet.addHeader("Accept", "application/json");
        HttpResponse response = httpClient.execute(httpGet);
        System.out.println(response.getEntity().getContentType().getValue());
        System.out.println(response.getStatusLine().getStatusCode());
        Assert.assertEquals(HttpStatus.SC_OK, response.getStatusLine().getStatusCode());
        Map<String, Object> deserilizedObject = objectMapper.readValue(response.
                getEntity().getContent(), new
                TypeReference<Map<String, Object>>() {
                });
        System.out.println(deserilizedObject.keySet());
        System.out.println(deserilizedObject.size());
        Map<String,Object>  map = (Map<String,Object>)deserilizedObject.get("data");
        Map<String,String>  map1 = (Map<String,String>)deserilizedObject.get("ad");
//        System.out.println(map.get("email"));
//
//        System.out.println("User's name is:" +map.get("last_name"));
//        System.out.println("User's name is:" +map.get("avatar"));
//        System.out.println("+++++++++++++++++++++++++++++++++++++");
//        System.out.println("User's Company is:"+ map1.get("company"));
//        System.out.println("User's url is: "+map1.get("url"));
        for (String st:map.keySet()){
            System.out.printf("User's %s is %s\n",st, map.get(st));
        }



    }
}
