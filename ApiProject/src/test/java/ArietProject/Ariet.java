package ArietProject;

import java.util.List;
import java.util.Map;

public class Ariet {
    private int id;
    private String name;
    private List<Map<String,Object>> info;
    private String familyStatus;
    public Ariet(int id,String name, List<Map<String, Object>> info, String familyStatus) {
        this.id=id;
        this.name = name;
        this.info = info;
        this.familyStatus = familyStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Map<String, Object>> getInfo() {
        return info;
    }

    public void setInfo(List<Map<String, Object>> info) {
        this.info = info;
    }

    public String getFamilyStatus() {
        return familyStatus;
    }

    public void setFamilyStatus(String familyStatus) {
        this.familyStatus = familyStatus;
    }
}
