package com.bibox.example.websocket;

import com.bibox.futures.BiboxFuturesUSDTClient;

public class SubOrderBookEvent {

    public static void main(String[] args) {
        BiboxFuturesUSDTClient client = new BiboxFuturesUSDTClient();
        String symbol = "BTC_USDT";
        client.subscribeOrderBook(symbol, x -> {
            System.out.println(x.getAskBook().getPriceLevel(0));
            System.out.println(x.getBidBook().getPriceLevel(0));
            // ...
        });
        // client.unSubscribeOrderBookEvent(symbol);
    }

}
