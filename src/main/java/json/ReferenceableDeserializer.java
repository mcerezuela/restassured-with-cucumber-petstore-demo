package json;

import com.google.gson.*;
import model.*;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class ReferenceableDeserializer<T extends ReferenceableObject<T>> implements JsonDeserializer<IReferenceable<T>> {

    public IReferenceable<T> deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject referenceableJsonObject = jsonElement.getAsJsonObject();

        IReferenceable<T> referenceable;

        if (referenceableJsonObject.has("$ref")) {
            String ref = referenceableJsonObject.get("$ref").getAsString();

            referenceable = new Reference<T>();
            ((Reference<T>) referenceable).setRef(ref);
        } else {
            Type genericType = ((ParameterizedType) type).getActualTypeArguments()[0];
            referenceable = jsonDeserializationContext.deserialize(referenceableJsonObject, genericType);
        }

        return referenceable;
    }
}
