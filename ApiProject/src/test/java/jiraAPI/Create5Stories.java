package jiraAPI;

import Utils.PayloadUtils;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.cookie.Cookie;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.cookie.BasicClientCookie;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;

public class Create5Stories {
    private HttpClient client;
    private URIBuilder uri;
    private HttpPost post;
    private HttpResponse response;
    private HttpEntity entity;

    @Test
    public void create1Story() throws URISyntaxException, IOException {
        client = HttpClientBuilder.create().build();

        uri = new URIBuilder();
        uri.setScheme("http").setHost("localhost:8080").setPath("rest/api/2/issue");
        post = new HttpPost(uri.build());
        post.setHeader("Cookie", "JSESSIONID=9F21B1A48D0A03D56C729921AF80AF3C");
        post.setHeader("Accept", "application/json");
        post.setHeader("Content-Type", "application/json");
        String body = PayloadUtils.getJiraStoryBody("Bug", "bamboo1991",
                "Learn how to work with Jira",
                "Working on the JIra", "High");
        HttpEntity entity = new StringEntity(body);
        post.setEntity(entity);
        response = client.execute(post);
        Assert.assertEquals(HttpStatus.SC_CREATED, response.getStatusLine().getStatusCode());
    }

    @Test
    public void create2Story() throws URISyntaxException, IOException {
        client = HttpClientBuilder.create().build();
        uri = new URIBuilder();
        uri.setScheme("http").setHost("localhost:8080").setPath("rest/api/2/issue");
        post = new HttpPost(uri.build());
        post.setHeader("Cookie", "JSESSIONID=330B3FCCC25579041D497993E03A0204");
        post.setHeader("Accept", "application/json");
        post.setHeader("Content-Type", "application/json");
        String strBody = PayloadUtils.getJiraStoryBody("Story", "bamboo1991","Creating My own Story from scratch","Using apache HttpClient " +
                "create","High");
        entity = new StringEntity(strBody);
        post.setEntity(entity);
        response = client.execute(post);
        Assert.assertEquals(HttpStatus.SC_CREATED, response.getStatusLine().getStatusCode());

    }

}
