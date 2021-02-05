package com.bibox.example.websocket;

import com.bibox.futures.BiboxFuturesUSDTClient;

public class SubTickerEvent {

    public static void main(String[] args) {
        BiboxFuturesUSDTClient client = new BiboxFuturesUSDTClient();
        // 处理业务逻辑
        String symbol = "BTC_USDT";
        client.subscribeTicker(symbol, x -> {
            System.out.println(x);
            // ...
        });
        // client.unSubscribeTickerEvent(symbol);
    }

}
