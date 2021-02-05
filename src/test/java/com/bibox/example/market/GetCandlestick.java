package com.bibox.example.market;

import com.bibox.futures.BiboxFuturesUSDTClient;
import com.bibox.futures.model.Candlestick;
import com.bibox.futures.model.enums.TimeInterval;

import java.util.List;

public class GetCandlestick {
    public static void main(String[] args) throws Throwable {
        BiboxFuturesUSDTClient client = new BiboxFuturesUSDTClient();
        List<Candlestick> haveLimit = client.getCandlestick("BTC_USDT",
                TimeInterval.WEEKLY, 10);
        List<Candlestick> noLimit = client.getCandlestick("BTC_USDT", TimeInterval.DAILY);
        System.out.println(haveLimit);
        System.out.println(noLimit);
    }
}
