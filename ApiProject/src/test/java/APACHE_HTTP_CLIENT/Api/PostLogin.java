package APACHE_HTTP_CLIENT.Api;

import Utils.PayloadConvertUtil;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Map;

public class PostLogin {
    @Test
    public void getTokenAuth() throws URISyntaxException, IOException {
        HttpClient client = HttpClientBuilder.create().build();
        URIBuilder uri = new URIBuilder();
        uri.setScheme("https").setHost("reqres.in").setPath("api/login");
        HttpPost httpPost = new HttpPost(uri.build());
        httpPost.setHeader("Accept", "application/json");
        String reqbody = PayloadConvertUtil.generateStringFromSource("src\\test\\java\\Utils\\auth.json");
        HttpEntity entity = new StringEntity(reqbody, ContentType.APPLICATION_JSON);
        httpPost.setEntity(entity);
        HttpResponse response;
        try {
            response = client.execute(httpPost);
            client.execute(httpPost);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
        Assert.assertEquals(HttpStatus.SC_OK, response.getStatusLine().getStatusCode());
        Assert.assertTrue(response.getEntity().getContentType().getValue().startsWith("application/json"));
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, String> token = objectMapper.readValue(response.getEntity().getContent(), new TypeReference<Map<String, String>>() {
        });
        Assert.assertTrue(token.containsKey("token"));
    }
}
