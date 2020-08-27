package json;

import com.google.gson.*;
import model.PathItem;
import model.Paths;

import java.lang.reflect.Type;
import java.util.Map;

public class PathsDeserializer implements JsonDeserializer<Paths> {
    public Paths deserialize(JsonElement jsonElement, Type type,
                             JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject pathsJsonObject = jsonElement.getAsJsonObject();

        Paths paths = new Paths();
        Map<String, PathItem> pathMap = JsonUtils.fromJsonToMap(pathsJsonObject, String.class, PathItem.class,
                jsonDeserializationContext);
        paths.setPathMap(pathMap);

        return paths;
    }
}
