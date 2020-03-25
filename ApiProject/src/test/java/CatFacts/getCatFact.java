package CatFacts;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;

public class getCatFact {
    @Test
    public void getUser() throws URISyntaxException, IOException {
        HttpClient client = HttpClientBuilder.create().build();
        URIBuilder uri = new URIBuilder();
        uri.setScheme("http").setHost("cat-fact.herokuapp.com/").setPath("facts/58e008ad0aac31001185ed0c");
        HttpGet get = new HttpGet(uri.build());
        get.addHeader("Accept", "application/json");
        get.addHeader("Content-Type", "application/json");
        HttpResponse response = client.execute(get);
        ObjectMapper objectMapper = new ObjectMapper();
        catFactsPojo getCatFacts = objectMapper.readValue(response.getEntity().getContent(), catFactsPojo.class);
        System.out.println(getCatFacts.get__v());
        System.out.println(getCatFacts.get_id());
        System.out.println(getCatFacts.getSource());
        System.out.println(getCatFacts.getText());
    }
}