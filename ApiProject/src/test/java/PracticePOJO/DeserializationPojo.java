package PracticePOJO;

import PracticePOJO.FactPojo;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;

public class DeserializationPojo {
    @Test
    public void getFactById() throws URISyntaxException, IOException {
        HttpClient httpClient = HttpClientBuilder.create().build();
        URIBuilder uriBuilder = new URIBuilder()
                .setScheme("http")
                .setHost("cat-fact.herokuapp.com")
                .setPath("facts/58e008b80aac31001185ed0d");
        HttpGet httpGet = new HttpGet(uriBuilder.build());
        httpGet.addHeader("Accept","application/json");
        HttpResponse response = httpClient.execute(httpGet);
        ObjectMapper objectMapper = new ObjectMapper();
        FactPojo factPojo=objectMapper.readValue(response.getEntity().getContent(),FactPojo.class );
        System.out.println(factPojo.getText());

    }
}
