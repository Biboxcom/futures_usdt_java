package com.bibox.example.trade;

import com.bibox.futures.BiboxFuturesUSDTClient;
import com.bibox.futures.model.LimitOrder;
import com.bibox.futures.model.MarketOrder;
import com.bibox.futures.model.enums.TradeAction;
import com.bibox.futures.model.enums.TradeSide;

import java.math.BigDecimal;

public class PlaceOrder {

    public static void main(String[] args) throws Throwable {
        String apiKey = "834542863b26007e21025sadasd112312155d0b6";
        String secretKey = "1f7e7b9a7b45c45cca768c9198d97e0252fd64ab";
        BiboxFuturesUSDTClient client = new BiboxFuturesUSDTClient(apiKey, secretKey);
        placeLimitOrder(client);
//        placeMarketOrder(client);
    }

    private static void placeMarketOrder(BiboxFuturesUSDTClient client) throws Throwable {
        // market order
        MarketOrder marketOrder = new MarketOrder();
        marketOrder.setSymbol("BTC_USDT");
        marketOrder.setQuantity(BigDecimal.valueOf(1));
        marketOrder.setAction(TradeAction.ENTRY);
        marketOrder.setSide(TradeSide.LONG);
        String orderId = client.placeOrder(marketOrder);
        System.out.println("the market order_id: " + orderId);
    }

    private static void placeLimitOrder(BiboxFuturesUSDTClient client) throws Throwable {
        // limit order
        LimitOrder limitOrder = new LimitOrder();
        limitOrder.setSymbol("ETH_USDT");
        limitOrder.setQuantity(BigDecimal.valueOf(0.01));
        limitOrder.setAction(TradeAction.EXIT);
        limitOrder.setSide(TradeSide.LONG);
        limitOrder.setPrice(BigDecimal.valueOf(1648));
        String orderId = client.placeOrder(limitOrder);
        System.out.println("the limit order_id: " + orderId);
    }

}
