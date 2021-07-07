package com.petstore;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.petstore.entities.endpoints.EndPointsWrapper;
import com.petstore.root.Petstore;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class PetStoreUtils {
    private static boolean debug = true;
    private static EndPointsWrapper endPointsWrapper;
    public static Petstore getReferencePetStore() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        TypeReference<Petstore> ref = new TypeReference<>() {
        };
        InputStream in = new FileInputStream("src/test/resources/swagger/petstore.json");
        return mapper.readValue(in, ref);
    }

    public static EndPointsWrapper extractEndPoints(Object elementToSearch) {
        endPointsWrapper = new EndPointsWrapper();
        endPointsWrapper.setEndpoints(getFieldNamesJsonProperties(elementToSearch));
        return endPointsWrapper;
    }

    public static Map<String, String> getFieldNamesJsonProperties(Object elementToSearch) {
        Map<String, String> mapOfFieldNamesJsonProperties = new HashMap<>();
        Class<?> objClass = elementToSearch.getClass();
        Field[] fields = objClass.getDeclaredFields();
        String currentFieldName = null;
        String propertyfield = null;
        int count = 0;
        for (Field field : fields) {
            if (field.isAnnotationPresent(JsonProperty.class)){
                propertyfield = getJsonPropertyValue(field);
                currentFieldName = field.getName();
                mapOfFieldNamesJsonProperties.put(currentFieldName,propertyfield);
            }
            if(debug)System.out.println("FIELD NAME: " + currentFieldName+
                    " FOR JSONPROPERTY FIELD "+ propertyfield+
                    " Count: "+count);
        }
        return mapOfFieldNamesJsonProperties;
    }

    private static String getJsonPropertyValue(Field field) {
        JsonProperty jsonProperty = field.getAnnotation(JsonProperty.class);
        if (null != jsonProperty) {
            return getIfEmptyFieldNameIfNotPropertyValue(jsonProperty, field);
        }
        return null;
    }

    private static String getIfEmptyFieldNameIfNotPropertyValue(JsonProperty jsonProperty, Field field) {
        return jsonProperty.value().isEmpty()
                ? field.getName() : jsonProperty.value();
    }

}
