package herokuAppPractice;

public class insideOfAll {
    private String _id;
    private String text;
    private String type;
    private int upvotes;
    private String userUpvoted;
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }



    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getUpvotes() {
        return upvotes;
    }

    public void setUpvotes(int upvotes) {
        this.upvotes = upvotes;
    }

    public String getUserUpvoted() {
        return userUpvoted;
    }

    public void setUserUpvoted(String userUpvoted) {
        this.userUpvoted = userUpvoted;
    }
}
