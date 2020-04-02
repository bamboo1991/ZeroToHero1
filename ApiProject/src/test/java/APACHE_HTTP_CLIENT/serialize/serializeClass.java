package APACHE_HTTP_CLIENT.serialize;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;
import java.io.File;
public class serializeClass {
    @Test
    public void serializeData() {
        ObjectMapper ariet = new ObjectMapper();

        try {
            Student student = new Student(28, "Ariet", "Stamov");
            String value = ariet.writeValueAsString(student);
            System.out.println(value);
            ariet.writeValue(new File("src\\test\\java\\APACHE_HTTP_CLIENT.serialize\\newFile.jason"), student);
         } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }

    }
}
