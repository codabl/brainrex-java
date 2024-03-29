/*
 * BrainRex API
 * The Brainrex API is a collection of analytics tools and data integrations made for blockchain developers. In particular we offer Natural Language Processing and Anomaly detection algorithms that have been fine tune to understand text data and time series in the domain speficic setting of cryptocurrency and blockchain technology. This technology is intended to be use as building blocks to bigger applications, we offer examples on how to use them for Trading Backtesting and Smart Contract anomaly monitoring.
 *
 * OpenAPI spec version: 1.0.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.model.CandleRequest;
import io.swagger.client.model.CandleResponse;
import io.swagger.client.model.Exchange;
import io.swagger.client.model.ExchangeAssetsResponse;
import io.swagger.client.model.OrderbookRequest;
import io.swagger.client.model.OrderbookResponse;
import io.swagger.client.model.SupportedExchanges;
import io.swagger.client.model.TickerResponse;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for IntegrationsApi
 */
@Ignore
public class IntegrationsApiTest {

    private final IntegrationsApi api = new IntegrationsApi();

    /**
     * Downloads candle format market data
     *
     * Returns a list of candle data from specified market and data range
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void cryptoGetCandleDataTest() throws Exception {
        CandleRequest body = null;
        CandleResponse response = api.cryptoGetCandleData(body);

        // TODO: test validations
    }
    /**
     * Gets all coin pairs traded in specified exchange
     *
     * This endpoint returns all the Available currency pairs
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void cryptoGetExchangeAssetsTest() throws Exception {
        Exchange body = null;
        ExchangeAssetsResponse response = api.cryptoGetExchangeAssets(body);

        // TODO: test validations
    }
    /**
     * Returns the current state of the orderbook.
     *
     * This endpoint returns the current state of the ordebook with a limit set by you. The maximun orderbook depth is 25.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void cryptoGetOrderbooksTest() throws Exception {
        OrderbookRequest body = null;
        OrderbookResponse response = api.cryptoGetOrderbooks(body);

        // TODO: test validations
    }
    /**
     * Gets all cryptocurrency exchanges supported by the Brainrex API
     *
     * Returns a list of candle data from specified market and data range
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void cryptoGetSupportedExchangesTest() throws Exception {
        SupportedExchanges response = api.cryptoGetSupportedExchanges();

        // TODO: test validations
    }
    /**
     * Downloads candle format market data
     *
     * Returns a list of candle data from specified market and data range
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void cryptoGetTickerTest() throws Exception {
        Exchange body = null;
        TickerResponse response = api.cryptoGetTicker(body);

        // TODO: test validations
    }
}
