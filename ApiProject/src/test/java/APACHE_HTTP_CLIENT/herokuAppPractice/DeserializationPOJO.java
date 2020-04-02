package APACHE_HTTP_CLIENT.herokuAppPractice;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;

public class DeserializationPOJO {
    @Test
    public void getFacts() throws URISyntaxException, IOException {
        HttpClient client = HttpClientBuilder.create().build();
        URIBuilder uri = new URIBuilder();
        uri.setScheme("https").setHost("cat-fact.herokuapp.com/").setPath("facts");
        HttpGet get = new HttpGet(uri.build());
        get.addHeader("Accept", "application/json");
        get.addHeader("Accept", "application/json");
        HttpResponse response = client.execute(get);
        ObjectMapper objectMapper = new ObjectMapper();
        AllPojo getValues = objectMapper.readValue(response.getEntity().getContent(), AllPojo.class);
        System.out.println("the total number of facts are: " + getValues.getAll().size());
        int count = 0;
        for (int i = 0; i < getValues.getAll().size(); i++) {
            if (getValues.getAll().get(i).getUpvotes() >= 3) {
                System.out.println(getValues.getAll().get(i).getText());
            }
            if (!getValues.getAll().get(i).getText().contains("cat") || getValues.getAll().
                    get(i).getText().contains("Cats")) {
                count++;
            }
        }
        System.out.println(count + " facts without cat keyword");

    }
}


