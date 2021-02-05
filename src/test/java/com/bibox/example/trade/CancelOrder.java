package com.bibox.example.trade;

import com.bibox.futures.BiboxFuturesUSDTClient;
import com.bibox.futures.OrderIdSet;

public class CancelOrder {

    public static void main(String[] args) throws Throwable {
        String apiKey = "173af3dcc331e2f828e36f1f5042517a3b7e7b5d";
        String secretKey = "6503471cd22f7809a15a03255743d0591fc8dea0";
        BiboxFuturesUSDTClient client = new BiboxFuturesUSDTClient(apiKey, secretKey);
        cancelWithSymbol(client);
//        cancelWithOrderId(client);
//        cancelWithOrderIds(client);
    }

    private static void cancelWithOrderId(BiboxFuturesUSDTClient client) throws Throwable {
        client.cancelOrder("123134123124433");
        System.out.println("cancel succ");
    }

    private static void cancelWithOrderIds(BiboxFuturesUSDTClient client) throws Throwable {
        OrderIdSet orderIdSet = new OrderIdSet();
        orderIdSet.add("28587322968618");
        orderIdSet.add("35184377957292");
        client.cancelAllOrders(orderIdSet);
        System.out.println("cancel succ");
    }

    private static void cancelWithSymbol(BiboxFuturesUSDTClient client) throws Throwable {
        client.cancelAllOrders("BTC_USDT");
        System.out.println("cancel succ");
    }

}
