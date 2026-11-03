package com.screenmatch.screenmatch.mapper;

public interface DataConverter {

  <T> T getData(String json, Class<T> clazz);
}