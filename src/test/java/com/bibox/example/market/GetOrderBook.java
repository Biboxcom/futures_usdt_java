package com.bibox.example.market;

import com.bibox.futures.BiboxFuturesUSDTClient;
import com.bibox.futures.model.OrderBook;

public class GetOrderBook {
    public static void main(String[] args) throws Throwable {
        BiboxFuturesUSDTClient client = new BiboxFuturesUSDTClient();
        OrderBook orderBook = client.getOrderBook("BTC_USDT");

        // ask1->askN
        orderBook.getAskBook().iterator().forEachRemaining(priceLevel ->
                System.out.println("the ask: " + priceLevel)
        );
        // bid1->bidN
        orderBook.getBidBook().iterator().forEachRemaining(priceLevel ->
                System.out.println("the bid: " + priceLevel)
        );

        // ...
    }
}
