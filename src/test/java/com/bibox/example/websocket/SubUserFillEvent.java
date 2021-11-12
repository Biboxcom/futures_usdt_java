package com.bibox.example.websocket;

import com.bibox.futures.BiboxFuturesUSDTClient;

public class SubUserFillEvent {

    public static void main(String[] args) {
        String apiKey = "your apiKey";
        String secretKey = "your secretKey";
        BiboxFuturesUSDTClient client = new BiboxFuturesUSDTClient(apiKey, secretKey);
        client.subscribeFill(x -> {
            x.forEach(System.out::println);
            // ...
        });
    }

}
