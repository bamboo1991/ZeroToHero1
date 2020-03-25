package studentProject;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class studentPojo {
    @Test
    public void generateStudent() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        ClassList classList= new ClassList();
        classList.setClassName("SDET batch 3");
        classList.setRoomNumber(002);
        SchoolLocations locations = new SchoolLocations();
        locations.setCity("Chicago");
        locations.setState("Illinois");
        List<ClassList> classLists = new ArrayList<>();
        classLists.add(classList);
        List<SchoolLocations> schoolLocations = new ArrayList<>();
        schoolLocations.add(locations);
        Student student = new Student(01,"Ariet",
                "Techtorial",schoolLocations,classLists,5000);
        objectMapper.writeValue(new File("src\\test\\java\\studentProject\\ariet.json"),student);
    }
}
