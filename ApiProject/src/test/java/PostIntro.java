import Utils.PayloadUtils;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class PostIntro {
    @Test
    public void createPet() throws URISyntaxException, IOException {
        HttpClient httpClient = HttpClientBuilder.create().build();
        URIBuilder uri = new URIBuilder();
        uri.setScheme("https").setHost("petstore.swagger.io").setPath("v2/pet");
        HttpPost httpPost = new HttpPost(uri.build());
        Properties properties = new Properties();
        File file = new File("config.properties");
        FileInputStream fileInputStream = new FileInputStream(file);
        properties.load(fileInputStream);
        String appJson = properties.getProperty("applicationJson");
        httpPost.setHeader("Accept",appJson);
        httpPost.setHeader("Content-Type",appJson);
        int petId=44;
        String request = PayloadUtils.getPetPayLoad(petId);
        HttpEntity entity = new StringEntity(request);
        httpPost.setEntity(entity);
        HttpResponse httpResponse = httpClient.execute(httpPost);


        ObjectMapper objectMapper = new ObjectMapper();
        Map<String,Object> getObject = objectMapper.readValue(httpResponse.getEntity().getContent(),new TypeReference<Map<String , Object>>(){});
        Assert.assertEquals(petId, getObject.get("id"));
        Assert.assertEquals("Black Star",getObject.get("name"));



}
}
