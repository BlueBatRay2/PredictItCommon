package com.bluebatray.predictitcommon.model.converter;

import com.bluebatray.predictitcommon.model.MarketList;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MarketListToJsonNode implements Converter<MarketList, JsonNode> {
    @Override
    public JsonNode convert(MarketList source) {
        ObjectMapper jsonMapper = new ObjectMapper();

        try{
            String stringJson = jsonMapper.writeValueAsString(source);
            return jsonMapper.readTree(stringJson);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
