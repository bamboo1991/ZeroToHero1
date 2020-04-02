package APACHE_HTTP_CLIENT.petCreate1;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class petCreateTest {
    @Test
    public void createPet() throws IOException, URISyntaxException {
        petCreate create = new petCreate();
        ObjectMapper objectMapper = new ObjectMapper();
        create.setId(1312);
        create.setName("Hatiko");
        List<PetCategory> list= new ArrayList<>();
        PetCategory petCategory = new PetCategory("Buldog",12,"Siberia" );
       list.add(petCategory);
       create.setLists(list);
       create.setPhotoUrls("www.google.com");
       create.setTags("HomeStyle");
        create.setStatus("available");

        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        objectMapper.writeValue(new File("src\\test\\" +
                "java\\APACHE_HTTP_CLIENT.petCreate1\\newPet.json"),create);
        HttpClient httpClient = HttpClientBuilder.create().build();
        URIBuilder uri = new URIBuilder();
        uri.setScheme("https").setHost("petstore.swagger.io").setPath("v2/pet");
        HttpPost httpPost = new HttpPost(uri.build());
        httpPost.addHeader("Content-Type","application/json");
        httpPost.addHeader("Accept", "application/json");
        String json = objectMapper.writeValueAsString(create);
        StringEntity entity = new StringEntity(json);
        httpPost.setEntity(entity);
        HttpResponse response = httpClient.execute(httpPost);
        petCreate petCreateTest = objectMapper.readValue(response.getEntity().getContent()
        , APACHE_HTTP_CLIENT.petCreate1.petCreate.class);
        Assert.assertEquals(create.getId(),petCreateTest.getId());
        Assert.assertEquals(create.getName(),petCreateTest.getName());



    }
}
