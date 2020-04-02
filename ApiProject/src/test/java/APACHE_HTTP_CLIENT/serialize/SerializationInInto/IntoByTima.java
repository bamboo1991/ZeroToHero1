package APACHE_HTTP_CLIENT.serialize.SerializationInInto;

import APACHE_HTTP_CLIENT.CurrencyAppPractice.Rates;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class IntoByTima {
    @Test
    public void serialization() throws IOException {
        Rates rates = new Rates();
        rates.setBtc("10");
        rates.setUsd("25");
        rates.setRuble("5");
        rates.setEuro("15");
        rates.setTenge("2");

        System.out.println(rates.getEuro());
        System.out.println(rates.getBtc());
        System.out.println(rates.getRuble());

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        File file = new File("src\\test\\java\\APACHE_HTTP_CLIENT.serialize\\SerializationInInto\\rates.json");

        objectMapper.writeValue(file, rates);


    }
}
