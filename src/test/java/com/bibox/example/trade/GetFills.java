package com.bibox.example.trade;

import com.bibox.futures.BiboxFuturesUSDTClient;
import com.bibox.futures.Pager;
import com.bibox.futures.model.Fill;

public class GetFills {

    public static void main(String[] args) throws Throwable {
        String apiKey = "834542863b26007e21025sadasd112312155d0b6";
        String secretKey = "1f7e7b9a7b45c45cca768c9198d97e0252fd64ab";
        BiboxFuturesUSDTClient client = new BiboxFuturesUSDTClient(apiKey, secretKey);
        Pager<Fill> fs = client.getFills("24189263983888", 1, 10);
        System.out.println(fs);
    }
}
