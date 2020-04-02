package APACHE_HTTP_CLIENT.DeleteIntro;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class DeleteSomething {
    @Test
    public void deleteUser() throws URISyntaxException, IOException {
        HttpClient client = HttpClientBuilder.create().build();
        URIBuilder uri = new URIBuilder();
        uri.setScheme("https").setHost("reqres.in").setPath("api/users/2");
        HttpDelete delete = new HttpDelete(uri.build());
        HttpResponse response = client.execute(delete);
        assertEquals(HttpStatus.SC_NO_CONTENT, response.getStatusLine().getStatusCode());
        Assert.assertEquals(HttpStatus.SC_NO_CONTENT, response.getStatusLine().getStatusCode());
        HttpGet httpGet = new HttpGet(uri.build());
        HttpResponse response1 =client.execute(httpGet);
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String,Object> getPetDetails = objectMapper.readValue(response1.getEntity().getContent(),new TypeReference<Map<String,Object>>(){});

    }
}
