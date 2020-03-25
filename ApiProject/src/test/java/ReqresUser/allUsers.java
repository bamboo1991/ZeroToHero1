package ReqresUser;

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
import java.util.List;
import java.util.Map;

public class allUsers {
    @Test
    public void getListOFUsers() throws IOException, URISyntaxException {


        ObjectMapper objectMapper = new ObjectMapper();
        HttpClient httpClient = HttpClientBuilder.create().build();
        URIBuilder uri = new URIBuilder();
        uri.setScheme("https");
        uri.setHost("reqres.in");
        uri.setPath("api/users").setCustomQuery("per_page=12");
        HttpGet httpGet = new HttpGet(uri.build());
        httpGet.addHeader("Accept", "application/json");
        HttpResponse response = httpClient.execute(httpGet);
        System.out.println(response.getEntity().getContentType().getValue());
        System.out.println(response.getStatusLine().getStatusCode());
        Assert.assertEquals(HttpStatus.SC_OK, response.getStatusLine().getStatusCode());
        Map<String, Object> deserializedObject = objectMapper.readValue(response.
                getEntity().getContent(), new
                TypeReference<Map<String, Object>>() {
                });

        List<Object> listOfObjects = (List<Object>) deserializedObject.get("data");
        Assert.assertEquals(deserializedObject.get("per_page"), listOfObjects.size());
        int sum = 0;
        for (int i = 0; i < listOfObjects.size(); i++) {
            Map<String, Object> userData = (Map<String, Object>) listOfObjects.get(i);
            System.out.println(userData.get("first_name"));
            sum += (int) userData.get("id");
        }
        System.out.println(sum);

    }


}





