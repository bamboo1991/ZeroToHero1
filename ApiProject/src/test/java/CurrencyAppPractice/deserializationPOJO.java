package CurrencyAppPractice;

import POJO.UserPojo;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.sl.In;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Map;

public class deserializationPOJO {
    public double CurrencyConverter(double yourMoney, double localCurrency) {
        double youWillGet = yourMoney * localCurrency;
        return youWillGet;
    }



    @Test
    public void getUser() throws URISyntaxException, IOException {
        double current$, currentEuro, currentBTC, currentRuble;
        HttpClient client = HttpClientBuilder.create().build();
        URIBuilder uri = new URIBuilder();
        uri.setScheme("http").setHost("rates.akchabar.kg/").setPath("get.json");
        HttpGet get = new HttpGet(uri.build());
        get.addHeader("Accept", "application/json");
        get.addHeader("Content-Type", "application/json");
        HttpResponse response = client.execute(get);
        ObjectMapper objectMapper = new ObjectMapper();
        AkchaBarPojo userDetails = objectMapper.readValue(response.getEntity().getContent(), AkchaBarPojo.class);
        current$ = Double.parseDouble(userDetails.getRates().getUsd());
        currentEuro = Double.parseDouble(userDetails.getRates().getEuro());
        currentBTC = Double.parseDouble(userDetails.getRates().getBtc());
        currentRuble = Double.parseDouble(userDetails.getRates().getRuble());
        System.out.println("Your 100 US dollars will be " + CurrencyConverter(100, current$) + " soms");
        System.out.println("Your 245 Euros will be " + CurrencyConverter(245, currentEuro) + " soms");
        System.out.println("Your 67 Bitcoins will be " + CurrencyConverter(67, currentBTC) + " soms");
        System.out.println("Your million rubles will be " + CurrencyConverter(1000000, currentRuble) + " soms");

    }
}