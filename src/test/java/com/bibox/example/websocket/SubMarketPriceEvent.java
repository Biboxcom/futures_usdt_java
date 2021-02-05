package com.bibox.example.websocket;

import com.bibox.futures.BiboxFuturesUSDTClient;

public class SubMarketPriceEvent {

    public static void main(String[] args) {
        BiboxFuturesUSDTClient client = new BiboxFuturesUSDTClient();
        String symbol = "BTC_USDT";
        client.subscribeMarketPrice(symbol, x -> {
            x.forEach(System.out::println);
            // ...
        });
        // client.unSubscribeMarketPriceEvent(symbol);
    }

}
