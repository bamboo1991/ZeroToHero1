package APACHE_HTTP_CLIENT.PetStore;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;

public class PetPractice {
    @Test
    public void petPractice() throws URISyntaxException, IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        HttpClient httpClient = HttpClientBuilder.create().build();
        URIBuilder uriBuilder = new URIBuilder();
        uriBuilder.setScheme("http")
                .setHost("petstore.swagger.io")
                .setPath("v2/pet/112233");
        HttpGet httpGet = new HttpGet(uriBuilder.build());
        httpGet.addHeader("Accept","application/jason");
        HttpResponse response = httpClient.execute(httpGet);




    }

}
