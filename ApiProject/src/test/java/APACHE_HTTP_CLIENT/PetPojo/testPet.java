package APACHE_HTTP_CLIENT.PetPojo;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class testPet {
    @Test
    public void createPet() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Category category = new Category();
        Id_Category id_category = new Id_Category();
        insideTags insideTags = new insideTags();
        Tags tags = new Tags();
        category.setId(01);
        category.setName("Garic Buldog");
        id_category.setCategory(category);
        id_category.setId(0212);
        id_category.setAvailable("sold");
        List<insideTags> list = new ArrayList<>();

       insideTags.setId(221);
        insideTags.setName("Buldog");
        list.add(insideTags);
        tags.setTags(list);
        File file = new File("src\\test\\java\\APACHE_HTTP_CLIENT.PetPojo\\pet.json");
        objectMapper.writeValue(file,id_category);

        String petJson = objectMapper.writeValueAsString(id_category);
        System.out.println(petJson);
    }
}
