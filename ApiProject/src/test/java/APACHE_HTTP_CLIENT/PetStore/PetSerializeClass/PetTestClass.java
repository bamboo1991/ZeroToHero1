package APACHE_HTTP_CLIENT.PetStore.PetSerializeClass;
import APACHE_HTTP_CLIENT.PetStore.Category;
import APACHE_HTTP_CLIENT.PetStore.Tags;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
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
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class PetTestClass {
    @Test
    public  void createPet() throws IOException, URISyntaxException {
        Category category = new Category(111, "jackson");
        List<String> photoUrl = new ArrayList<>();
        photoUrl.add("https://s3.amazonaws.com/uifaces/faces/twitter/calebogden/128.jpg");
        Tags tags = new Tags();
   tags.setName("Tags");
   tags.setId(1000);
   List<Tags> tagsList = new ArrayList<>();
   tagsList.add(tags);
   Pet pet = new Pet(001,category,"Vivek",photoUrl, tagsList,"sold");
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        objectMapper.writeValue(new File("src\\test\\java\\APACHE_HTTP_CLIENT.PetStore\\PetSerializeClass\\ariet.json"),pet);
        HttpClient httpClient = HttpClientBuilder.create().build();
        URIBuilder uri = new URIBuilder();
        uri.setScheme("https").setHost("petstore.swagger.io").setPath("v2/pet");
        HttpPost httpPost = new HttpPost(uri.build());
        httpPost.addHeader("Content-Type", "application/json");
        httpPost.addHeader("Accept", "application/json");
        String json = objectMapper.writeValueAsString(pet);
        StringEntity stringEntity = new StringEntity(json);
        httpPost.setEntity(stringEntity);
        HttpResponse response = httpClient.execute(httpPost);
        objectMapper.writeValue(new File("src\\test\\java\\APACHE_HTTP_CLIENT.ArietProject\\family.json"), pet);
        Assert.assertEquals(HttpStatus.SC_OK, response.getStatusLine().getStatusCode());
    }
    }
