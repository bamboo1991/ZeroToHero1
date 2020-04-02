package APACHE_HTTP_CLIENT.ReqresUser;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AvatarS {

    @Test
    public void getAvatars() throws URISyntaxException, IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        HttpClient httpClient = HttpClientBuilder.create().build();
        URIBuilder uri = new URIBuilder();
        uri.setScheme("https").setHost("reqres.in").setPath("api/users").setCustomQuery("per_page=21");
        HttpGet httpGet = new HttpGet(uri.build());
        httpGet.addHeader("Accept", "application/json");
        HttpResponse response = httpClient.execute(httpGet);
        System.out.println(response.getStatusLine().getStatusCode());
        Assert.assertEquals(HttpStatus.SC_OK, response.getStatusLine().getStatusCode());
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> getObjects = objectMapper.readValue(
                response.getEntity().getContent(), new TypeReference<Map<String, Object>>() {
                });
        List<Object> listOfAvatars = (List<Object>) getObjects.get("data");
        System.out.println(((List<Object>) getObjects.get("data")).size());
        for (int i = 0; i < listOfAvatars.size(); i++) {
            Map<String, Object> avatars = (Map<String, Object>) listOfAvatars.get(i);
            List<Object> listPhotoUrls = new ArrayList<>();
            listPhotoUrls.add(avatars.get("avatar"));
            driver.get((String) avatars.get("avatar"));
            System.out.println(listPhotoUrls);

        }

    }


}