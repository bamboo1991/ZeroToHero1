package POJO;

public class Ad {
    private String company;
    private String url;
    private String text;

    public void getCompany(String company) {
        this.company=company;
    }

    public void getUrl(String url) {
        this.url=url;
    }

    public void getText(String text) {
        this.text=text;
    }

    public String getCompany() {
        return company;
    }

    public String getUrl() {
        return url;
    }

    public String getText() {
        return text;
    }
}
