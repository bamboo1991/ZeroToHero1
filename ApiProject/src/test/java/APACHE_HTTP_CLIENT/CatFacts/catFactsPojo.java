package APACHE_HTTP_CLIENT.CatFacts;

import java.util.List;

public class catFactsPojo {
    private boolean used;
    private String source;
    private String type;

    public void setAll(List<All> all) {
        this.all = all;
    }

    private List<All> all;
    public static List<All> getAll() {
        return null;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int get__v() {
        return __v;
    }

    public void set__v(int __v) {
        this.__v = __v;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    private boolean deleted;
    private String _id;
    private String user;
    private String text;
    private int __v;
    private String updatedAt;
    private String createdAt;
    private Status status;
}
