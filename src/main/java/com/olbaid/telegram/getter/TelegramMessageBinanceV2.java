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

import com.olbaid.binance.service.api.MarketApi;
import com.olbaid.binance.service.invoker.ApiException;
import com.olbaid.binance.service.model.ApiV3Ticker24hrGet200Response;
import io.quarkus.arc.lookup.LookupIfProperty;
import jakarta.enterprise.context.ApplicationScoped;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@LookupIfProperty(name = "telegram.message.impl", stringValue = "binance")
@ApplicationScoped
public class TelegramMessageBinanceV2 implements TelegramMessageGetter {

	private static final Logger LOG = LoggerFactory.getLogger(TelegramMessageBinanceV2.class);

	public String getObject()  {
		StringBuilder queryResults = new StringBuilder();

		try {
			MarketApi marketApi = new MarketApi();
			ApiV3Ticker24hrGet200Response ticker = null;
			ticker = marketApi.apiV3Ticker24hrGet("ETHUSDT",null, "MINI");
//		parameters.put("type", "LIMIT");

			queryResults.append("highPrice: ").append(ticker.getHighPrice());
			queryResults.append("\nlowPrice: ").append(ticker.getLowPrice());
			queryResults.append("\nbidPrice: ").append(ticker.getBidPrice());

		} catch (ApiException e) {
			LOG.error("Error getting ticker", e);
		}

		return queryResults.toString();
	}

}
