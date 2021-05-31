package com.petstore.entities.endpoints;

import java.util.HashMap;
import java.util.Map;

public class EndPointsWrapper {

    private Map<String, String> endpoints;
    private String fieldName;
    private String endpointValue;

    public EndPointsWrapper() {
        endpoints = new HashMap<>();
    }

    public void setEndpoints(Map<String, String> endpoints) {
        this.endpoints = endpoints;
    }

    public String getEndpointValue(String methodName){
        for(Map.Entry<String,String> entry : endpoints.entrySet()){
            if(entry.getKey().equalsIgnoreCase(methodName)){
                return entry.getValue();
            }
        }
        return "";
    }

    @Override
    public String toString() {
        return "Endpoints{" +
                "endpoints=" + endpoints +
                '}';
    }
}
