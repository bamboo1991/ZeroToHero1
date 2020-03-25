import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Assert;
import org.junit.Test;

import javax.print.attribute.standard.MediaSize;
import java.io.IOException;
import java.net.URISyntaxException;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BreakingPad {
    @Test
    public void getNmaes() throws URISyntaxException, IOException {
        HttpClient httpClient = HttpClientBuilder.create().build();
        URIBuilder uri = new URIBuilder();
        uri.setScheme("https").setHost("breakingbadapi.com").setPath("api/characters");
        HttpGet httpGet = new HttpGet(uri.build());
        httpGet.addHeader("Accept", "application/json");
        HttpResponse response = httpClient.execute(httpGet);
        System.out.println(response.getStatusLine().getStatusCode());
        Assert.assertEquals(HttpStatus.SC_OK, response.getStatusLine().getStatusCode());
        ObjectMapper objectMapper = new ObjectMapper();
        List<Map<String, Object>> getObjects = objectMapper.readValue(
                response.getEntity().getContent(), new TypeReference<List<Map<String, Object>>>() {
                });

        int currentDay = 2020;
        for (int i=0;i<getObjects.size();i++){
            if (!getObjects.get(i).get("birthday").equals("Unknown")){
                String birthday = (String) getObjects.get(i).get("birthday");
                String birthYear = birthday.substring(birthday.length()-4);
                int age =currentDay-Integer.parseInt(birthYear);
                Map<String ,Object> nameAge = new HashMap<>();
                nameAge.put(getObjects.get(i).get("name").toString(),age);
                System.out.println(nameAge);
            }

           }
        }

    }

