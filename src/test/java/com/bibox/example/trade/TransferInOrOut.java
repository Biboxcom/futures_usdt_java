package com.bibox.example.trade;

import com.bibox.futures.BiboxFuturesUSDTClient;

import java.math.BigDecimal;

public class TransferInOrOut {


    public static void main(String[] args) throws Throwable {
        String apiKey = "173af3dcc331e2f828e36f1f5042517a3b7e7b5d";
        String secretKey = "6503471cd22f7809a15a03255743d0591fc8dea0";
        BiboxFuturesUSDTClient client = new BiboxFuturesUSDTClient(apiKey, secretKey);
//        client.transferOut("USDT", BigDecimal.valueOf(1000));
        client.transferIn("USDT", BigDecimal.valueOf(1000));
        System.out.println("Transfer succ");
    }

}
