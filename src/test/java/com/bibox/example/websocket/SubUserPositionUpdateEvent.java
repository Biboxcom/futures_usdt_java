package com.bibox.example.websocket;

import com.bibox.futures.BiboxFuturesUSDTClient;

public class SubUserPositionUpdateEvent {

    public static void main(String[] args) {
        String apiKey = "834542863b26007e21025sadasd112312155d0b6";
        String secretKey = "1f7e7b9a7b45c45cca768c9198d97e0252fd64ab";
        BiboxFuturesUSDTClient client = new BiboxFuturesUSDTClient(apiKey, secretKey);
        client.subscribePositionUpdate(x -> {
            x.forEach(System.out::println);
            // ...
        });
    }

}
