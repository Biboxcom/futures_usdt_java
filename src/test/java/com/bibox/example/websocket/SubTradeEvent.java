package com.bibox.example.websocket;

import com.bibox.futures.BiboxFuturesUSDTClient;

public class SubTradeEvent {

    public static void main(String[] args) {
        BiboxFuturesUSDTClient client = new BiboxFuturesUSDTClient();
        String symbol = "BTC_USDT";
        client.subscribeTrade(symbol, (x) -> {
            x.forEach(System.out::println);
            // ...
        });
        // client.unSubscribeTradeEvent(symbol);
    }

}
