package com.bibox.example.websocket;

import com.bibox.futures.BiboxFuturesUSDTClient;
import com.bibox.futures.model.enums.TimeInterval;

public class SubCandlestickEvent {

    public static void main(String[] args) {
        BiboxFuturesUSDTClient client = new BiboxFuturesUSDTClient();
        String symbol = "BTC_USDT";
        client.subscribeCandlestick(symbol, TimeInterval.ONE_MINUTE, (x) -> {
            x.forEach(System.out::println);
            // ...
        });
        // client.unSubscribeCandlestickEvent(symbol,CandlestickInterval.ONE_MINUTE);
    }

}
