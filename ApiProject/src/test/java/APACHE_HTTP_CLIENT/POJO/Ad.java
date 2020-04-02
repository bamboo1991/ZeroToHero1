package APACHE_HTTP_CLIENT.POJO;

public class Ad {
    private String company;
    private String url;
    private String text;

    public void setCompany(String company) {
        this.company = company;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setText(String text) {
        this.text = text;
    }

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
