package com.petstore.common;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.internal.mapping.Jackson2Mapper;
import io.restassured.mapper.factory.Jackson2ObjectMapperFactory;
import io.restassured.specification.RequestSpecification;

import java.lang.reflect.Type;

public class CommonUtils {

    RequestSpecification rspec;
    RequestSpecBuilder build;

    public Jackson2Mapper getMapper() {
        return new Jackson2Mapper((type, s) -> {
            ObjectMapper om = new ObjectMapper().findAndRegisterModules();
            om.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, false);
            return om;
        });
    }

    public void setSpecs() {
        build = new RequestSpecBuilder();
        build.setBaseUri("https://petstore3.swagger.io");
        build.setBasePath("/api/v3");
        build.setContentType("application/json");
        rspec = build.build();
    }

    public RequestSpecification getSpecs() {
        return rspec;
    }
}
