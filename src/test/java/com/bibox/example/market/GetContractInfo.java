package com.bibox.example.market;

import com.bibox.futures.BiboxFuturesUSDTClient;

public class GetContractInfo {
    public static void main(String[] args) throws Throwable {
        BiboxFuturesUSDTClient client = new BiboxFuturesUSDTClient();
        System.out.println(client.getContractInfos());
        // System.out.println(client.getContractInfo("BTC_USDT"));
    }
}
