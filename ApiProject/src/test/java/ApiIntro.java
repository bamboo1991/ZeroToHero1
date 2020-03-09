

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.junit.Assert;
import org.junit.Test;

import javax.management.ObjectName;
import java.io.IOException;
import java.net.URISyntaxException;

import java.util.List;
import java.util.Map;

public class ApiIntro {
    @Test
    public void fiRSTGetCall() throws URISyntaxException, IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        //Creating client like postman
        HttpClient httpClient = HttpClientBuilder.create().build();
        //Cobstructing an URL
        URIBuilder uriBuilder = new URIBuilder();
        uriBuilder.setScheme("https").setHost("petstore.swagger.io").setPath("v2/pet/112233");
        //Defining API call
        HttpGet httpGet = new HttpGet(uriBuilder.build());
        httpGet.addHeader("Accept","Application");
        //Executing the api call
        HttpResponse response = httpClient.execute(httpGet);
       Map<String, Object> deserialization = objectMapper.readValue(response.getEntity().getContent(),new TypeReference<Map<String,Object>>(){});
        System.out.println(deserialization.get("id"));
        System.out.println(deserialization.get("status"));
        Map<String, Object> categoryMap1 = (Map<String, Object>) deserialization.get("category");
        String value = (String)categoryMap1.get("name");
        Integer idNum = (Integer)categoryMap1.get("id");
        System.out.println(value);
        System.out.println(idNum);
        Assert.assertEquals(HttpStatus.SC_NOT_FOUND,response.getStatusLine().getStatusCode());




    }
//    @Test
//    public void gettallUsersName() throws IOException, URISyntaxException {
//        HttpClient httpClient = HttpClientBuilder.create().build();
//        //Constructing URL
//        URIBuilder uriBuilder = new URIBuilder();
//        uriBuilder.setScheme("https").setHost("petstore.swagger.io").setPath("v2/pet/112233");
//        //defining the api call
//        HttpGet httpGet = new HttpGet(uriBuilder.build());
//        httpGet.addHeader("Accept", "application/json");
//        //executing the api call
//        HttpResponse response = httpClient.execute(httpGet);
//        ObjectMapper objectMapper = new ObjectMapper();
//        //deserialization
//        Map<String,Object> allUsers = objectMapper.readValue(response.getEntity().getContent(), new TypeReference <Map<String,Object>>(){});
//        List<Map<String,Object>> useraDataList = (List<Map<String,Object>>)allUsers.get("data");
//        System.out.println(useraDataList);
//        for (int i =0; i<useraDataList.size(); i++){
//            String firstName= (String) useraDataList.get(i).get("first_name");
//            System.out.println(firstName);
//        }
//    }
//    @Test
//    public void printByCategoryData() throws URISyntaxException, IOException {
//        HttpClient httpClient = HttpClientBuilder.create().build();
//        //Constructing URL
//        URIBuilder uriBuilder = new URIBuilder();
//        uriBuilder.setScheme("https").setHost("petstore.swagger.io").setPath("v2/pet/112233");
//        //defining the api call
//        HttpGet httpGet = new HttpGet(uriBuilder.build());
//        httpGet.addHeader("Accept", "application/json");
//        //executing the api call
//        HttpResponse response = httpClient.execute(httpGet);
//        ObjectMapper objectMapper = new ObjectMapper();
//
//        Map<String ,Object> map= objectMapper.readValue(response.getEntity().getContent(),new TypeReference<Map<String,Object>>(){
//        });
//        Map<String ,Object>category= (Map<String, Object>)map.get("category");
//        String categoryName = (String) category.get("Name");
//        System.out.println("Category name: "+categoryName);
//
//        String name = (String) map.get("name");
//        System.out.println("regular name: "+name);
//        Map<String,Object> tagsData =(Map<String, Object>)map.get("tags");
//        String tagName = (String) tagsData.get("name");
//        System.out.println("tag name: "+tagName);
//
//
//    }
}
