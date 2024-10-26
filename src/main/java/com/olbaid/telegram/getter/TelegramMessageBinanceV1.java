/*
  Copyright (c) 2024, Oracle and/or its affiliates.

  This software is dual-licensed to you under the Universal Permissive License
  (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License
  2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose
  either license.

  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at

     https://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
*/

package com.olbaid.telegram.getter;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;
import com.binance.connector.client.impl.spot.Market;
import io.quarkus.arc.lookup.LookupIfProperty;
import jakarta.enterprise.context.ApplicationScoped;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedHashMap;
import java.util.Map;

@LookupIfProperty(name = "telegram.message.impl", stringValue = "binance_old")
@ApplicationScoped
public class TelegramMessageBinanceV1 implements TelegramMessageGetter {

	private static final Logger LOG = LoggerFactory.getLogger(TelegramMessageBinanceV1.class);

	public String getObject()  {
		StringBuilder queryResults = new StringBuilder();

		try {
			SpotClient client = new SpotClientImpl();
			Market market = client.createMarket();
			Map<String, Object> parameters = new LinkedHashMap<>();

			parameters.put("symbol", "ETHUSDT");
			String result = market.ticker24H(parameters);

			queryResults.append(result);
		} catch (Exception e) {
			LOG.error("Error getting ticker", e);
		}

		return queryResults.toString();
	}



//		SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
//
//		Map<String,Object> parameters = new LinkedHashMap<String,Object>();
//		parameters.put("symbol","BTCUSDT");
//		parameters.put("side", "SELL");
//		parameters.put("type", "LIMIT");
//		parameters.put("timeInForce", "GTC");
//		parameters.put("quantity", 0.01);
//		parameters.put("price", 9500);
//
//		String result = client.createTrade().testNewOrder(parameters);

}
