package com.bibox.example.market;

import com.bibox.futures.BiboxFuturesUSDTClient;

public class GetTime {
    public static void main(String[] args) throws Throwable {
        BiboxFuturesUSDTClient client = new BiboxFuturesUSDTClient();
        System.out.println(client.getTime());
    }
}
