package com.bluebatray.predictitcommon.model;

import com.bluebatray.predictitcommon.model.MarketData;

import java.util.HashMap;
public record MarketList (HashMap<String, MarketData> markets) {}