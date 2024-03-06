package com.bluebatray.predictitcommon.model;

import java.util.Map;

public record MarketData(
        String id,
        String name,
        String shortName,
        String image,
        String url,
        Map<String, MarketContract> contracts,
        String status) {}