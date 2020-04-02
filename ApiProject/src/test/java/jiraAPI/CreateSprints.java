package jiraAPI;

import Utils.PayloadUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;

public class CreateSprints {
    private HttpClient client;
    private URIBuilder uri;
    private HttpPost post;
    private HttpResponse response;
    private HttpEntity entity;


    @Test
    public void CreateSprint() throws URISyntaxException, IOException {
        client = HttpClientBuilder.create().build();
        uri = new URIBuilder();
        uri.setScheme("http").setHost("localhost:8080").setPath("rest/agile/1.0/sprint");
        post = new HttpPost(uri.build());
        post.setHeader("Cookie", "JSESSIONID=330B3FCCC25579041D497993E03A0204");
        post.setHeader("Accept", "application/json");
        post.setHeader("Content-Type","application/json");
        String body = PayloadUtils.getSprintBody("JC Sprint 5","Be able to create Sprints faster on with Java code");
        entity = new StringEntity(body);
        post.setEntity(entity);
        response = client.execute(post);
        Assert.assertEquals(HttpStatus.SC_CREATED,response.getStatusLine().getStatusCode());
    }


}
