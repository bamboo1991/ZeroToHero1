package petCreate1;

import java.util.List;

public class petCreate {
    private int id;
    private String name;
    private List<PetCategory> lists;
    private String status;
    private String tags;
    private String photoUrls;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String type;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    private String code;

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }
    public String getPhotoUrls() {
        return photoUrls;
    }

    public void setPhotoUrls(String photoUrls) {
        this.photoUrls = photoUrls;
    }


public petCreate(){

}
    public petCreate(int id, String name, List<PetCategory> lists, String status) {
        this.id = id;
        this.name = name;
        this.lists = lists;
        this.status = status;
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

    public List<PetCategory> getLists() {
        return lists;
    }

    public void setLists(List<PetCategory> lists) {
        this.lists = lists;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



}
