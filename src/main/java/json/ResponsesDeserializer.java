package json;

import com.google.gson.*;
import model.IReferenceable;
import model.Response;
import model.Responses;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class ResponsesDeserializer implements JsonDeserializer<Responses> {
    public Responses deserialize(JsonElement jsonElement, Type type,
                                 JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject responsesJsonObject = jsonElement.getAsJsonObject();

        Responses responses = new Responses();

        String httpCode;
        Response response;
        Map<String, IReferenceable<Response>> responseMap = new HashMap<String, IReferenceable<Response>>();

        for(Map.Entry<String,JsonElement> entry : responsesJsonObject.entrySet()){
            httpCode = entry.getKey();
            response = jsonDeserializationContext.deserialize(entry.getValue(), Response.class);
            if (httpCode.equals("default")) {
                responses.setDefault(response);
            } else {
                responseMap.put(httpCode, response);
            }
        }

        responses.setResponseMap(responseMap);

        return responses;
    }
}
