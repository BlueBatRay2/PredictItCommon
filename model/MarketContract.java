package com.bluebatray.predictitcommon.model;


public record MarketContract(
        String id,
        String dateEnd,
        String image,
        String name,
        String shortName,
        String status,
        float lastTradePrice,
        float bestBuyYesCost,
        float bestBuyNoCost,
        float bestSellYesCost,
        float bestSellNoCost,
        float lastClosePrice,
        int displayOrder) {}