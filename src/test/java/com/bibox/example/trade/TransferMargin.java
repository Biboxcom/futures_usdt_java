package com.bibox.example.trade;

import com.bibox.futures.BiboxFuturesUSDTClient;
import com.bibox.futures.model.enums.TradeSide;

import java.math.BigDecimal;

public class TransferMargin {

    public static void main(String[] args) throws Throwable {
        String apiKey = "834542863b26007e21025sadasd112312155d0b6";
        String secretKey = "1f7e7b9a7b45c45cca768c9198d97e0252fd64ab";
        BiboxFuturesUSDTClient client = new BiboxFuturesUSDTClient(apiKey, secretKey);
        client.transferMargin("ETH_USDT", TradeSide.LONG, BigDecimal.valueOf(1));
        System.out.println("TransferMargin succ");
    }

}
