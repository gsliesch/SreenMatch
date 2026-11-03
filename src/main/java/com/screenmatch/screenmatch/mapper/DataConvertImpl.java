package com.screenmatch.screenmatch.mapper;

import tools.jackson.databind.ObjectMapper;

public class DataConvertImpl implements DataConverter {

    ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T getData(String json, Class<T> clazz) {
        return mapper.readValue(json, clazz);
    }
}
