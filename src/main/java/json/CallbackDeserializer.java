package json;

import com.google.gson.*;
import model.Callback;
import model.PathItem;

import java.lang.reflect.Type;
import java.util.Map;

public class CallbackDeserializer implements JsonDeserializer<Callback> {
    public Callback deserialize(JsonElement jsonElement, Type type,
                                JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject callbackJsonObject = jsonElement.getAsJsonObject();

        Callback callback = new Callback();
        Map<String, PathItem> pathMap = JsonUtils.fromJsonToMap(callbackJsonObject, String.class, PathItem.class,
                jsonDeserializationContext);
        callback.setPathMap(pathMap);


        return callback;
    }
}
