package com.bibox.example.market;

import com.bibox.futures.BiboxFuturesUSDTClient;

public class GetContract {
    public static void main(String[] args) throws Throwable {
        BiboxFuturesUSDTClient client = new BiboxFuturesUSDTClient();
        System.out.println(client.getContract("BTC_USDT"));
        System.out.println(client.getContracts());
    }
}
