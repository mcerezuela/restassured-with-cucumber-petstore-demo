package json;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;

public class JsonUtils {

    // https://stackoverflow.com/a/49043900
    public static  <K,V> HashMap<K,V> fromJsonToMap(JsonElement json, Class<K> keyType, Class<V> valueType,
                                                    JsonDeserializationContext jsonDeserializationContext){
        return jsonDeserializationContext.deserialize(json, getMapType(keyType,valueType));
    }

    public static Type getMapType(Class keyType, Class valueType){
        return TypeToken.getParameterized(HashMap.class, keyType, valueType).getType();
    }
}
