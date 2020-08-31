package main;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import json.*;
import model.*;

public class OpenAPISpecificationDeserializer {
    private static Gson gson;

    public static OpenAPISpecification deserialize(String jsonText) {
        Gson gson = getGson();
        return gson.fromJson(jsonText, OpenAPISpecification.class);
    }

    private static Gson getGson() {
        if (gson == null) {
            buildGson();
        }
        return gson;
    }

    private static void buildGson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Paths.class, new PathsDeserializer());
        gsonBuilder.registerTypeAdapter(Callback.class, new CallbackDeserializer());
        gsonBuilder.registerTypeAdapter(Responses.class, new ResponsesDeserializer());
        gsonBuilder.registerTypeAdapter(IReferenceable.class, new ReferenceableDeserializer());
        gsonBuilder.registerTypeAdapter(ServerVariable.class, new ServerVariableDeserializer());
//        gsonBuilder.registerTypeAdapter(Schema.class, new SchemaDeserializer());

        gson = gsonBuilder.create();
    }
}
