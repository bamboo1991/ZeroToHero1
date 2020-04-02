package APACHE_HTTP_CLIENT;

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

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Map;

public class ApiIntro {
    @Test
    public void firstApiCall() throws URISyntaxException, IOException {
        HttpClient httpClient = HttpClientBuilder.create().build();
        URIBuilder uri = new URIBuilder(); // endpoint
        uri.setScheme("https");
        uri.setHost("petstore.swagger.io");
        uri.setPath("v2/pet/112233");
        HttpGet httpGet = new HttpGet(uri.build());
        httpGet.addHeader("Accept","application/json");

       HttpResponse response=  httpClient.execute(httpGet);
       System.out.println("Status code of my first api call is: "+response.getStatusLine().getStatusCode());
        Assert.assertEquals(HttpStatus.SC_OK,response.getStatusLine().getStatusCode());
        Assert.assertEquals("Invlaid content type ", "application/json",response.getEntity().getContentType().getValue());

    }
    @Test
    public void getUsers() throws URISyntaxException, IOException {
        HttpClient httpClient = HttpClientBuilder.create().build();
        URIBuilder uri = new URIBuilder(); // endpoint
        uri.setScheme("https");
        uri.setHost("reqres.in");
        uri.setPath("api/users");
        uri.setCustomQuery("page=2");
        HttpGet httpGet = new HttpGet(uri.build());
        httpGet.addHeader("Accept","application/json");
        //httpGet.addHeader("Content-Type","application/json");
        HttpResponse response=httpClient.execute(httpGet);
        System.out.println("Status code of my first api call is: "+response.getStatusLine().getStatusCode());
        int indexOFSpace = response.getEntity().getContentType().getValue().indexOf(" ");
        System.out.println(response.getEntity().getContentType().getValue().substring(indexOFSpace+1));
        Assert.assertTrue(response.getEntity().getContentType().getValue().contains("charset=utf-8"));
        //Assert.assertEquals(HttpStatus.SC_OK,response.getStatusLine().getStatusCode());
    }
    @Test
    public void getSigleUser() throws URISyntaxException, IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        HttpClient httpClient = HttpClientBuilder.create().build();
        URIBuilder uriBuilder = new URIBuilder();
        uriBuilder.setScheme("https");
        uriBuilder.setHost("reqres.in");
        uriBuilder.setPath("api/users/2");
        HttpGet httpGet = new HttpGet(uriBuilder.build());
        httpGet.addHeader("Accept","application/json");
        HttpResponse response = httpClient.execute(httpGet);
        System.out.println("The status code is: "+response.getStatusLine().getStatusCode());
        System.out.println(response.getEntity().getContentType().getValue());
        Map<String, String > deserialization = objectMapper.readValue(response.getEntity().getContent(), new TypeReference<Map<String,String>>(){}
        );
        System.out.println(deserialization.get("id"));
    }
    @Test
    public void userNotFound() throws URISyntaxException, IOException {

        HttpClient httpClient = HttpClientBuilder.create().build();
        URIBuilder uri = new URIBuilder();
        uri.setScheme("https");
        uri.setHost("reqres.in");
        uri.setPath("api/users/2");
        HttpGet httpGet = new HttpGet(uri.build());
        httpGet.addHeader("Accept","application/xml");
        HttpResponse response = httpClient. execute(httpGet);
        System.out.println(HttpStatus.SC_OK);
        System.out.println(response.getEntity().getContentType().getValue());
    }
    @Test
    public void listOfEmp() throws URISyntaxException, IOException {
        HttpClient httpClient = HttpClientBuilder.create().build();
        URIBuilder uri = new URIBuilder();
        uri.setScheme("https");
        uri.setHost("reqres.in");
        uri.setPath("api/unknown");
        HttpGet httpGet = new HttpGet(uri.build());
        httpGet.addHeader("Accept", "application/json");
        HttpResponse response = httpClient.execute(httpGet);
        System.out.println("the status code is: "+response.getStatusLine().getStatusCode());

        System.out.println(response.getEntity().getContentType().getValue());
    }
}