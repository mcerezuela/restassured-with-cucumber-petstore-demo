package com.petstore.common;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.petstore.components.schemas.pet.PetResponseEntity;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.internal.mapping.Jackson2Mapper;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;


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

    public void setSpecs(String url) {
        build = new RequestSpecBuilder();
        build.setBaseUri("https://petstore3.swagger.io");
        build.setBasePath(url);
        build.setContentType("application/json");
        rspec = build.build();
    }

    public RequestSpecification getSpecs() {
        return rspec;
    }

    public PetResponseEntity[] sendGetPetRequestQueryParam(String parameterName, String parameterValue,
                                                           String operationId) {
        return given().
                spec(this.getSpecs()).
                queryParam(parameterName, parameterValue).
                when().
                get(operationId).
                then().
                statusCode(200).
                extract().
                as(PetResponseEntity[].class);
    }
    public PetResponseEntity sendGetPetRequestPathParams(String parameterName, String parameterValue,
                                                   String operationId) {
        return given().
                spec(this.getSpecs()).
                pathParam(parameterName,parameterValue).
                when().
                get(operationId).
                then().
                statusCode(200).
                extract().
                as(PetResponseEntity.class);
    }

    public Object getRequest(Class<?> tClass, String operationId){
        return given().
                spec(this.getSpecs()).
                when().
                get(operationId).
                then().
                statusCode(200).
                extract().
                as(tClass);
    }

    public Object postRequest(Object entity, Class<PetResponseEntity> tClass, String operationId) {
        return given().
                spec(this.getSpecs()).
                body(entity).
                when().
                post(operationId).
                then().
                statusCode(200).
                extract().
                as(tClass);
    }

    public Object putRequest(Object entity, Class<?> tClass, String operationId) {
        return given().
                spec(this.getSpecs()).
                body(entity).
                when().
                put(operationId).
                then().
                statusCode(200).
                extract().
                as(tClass);
    }
}
