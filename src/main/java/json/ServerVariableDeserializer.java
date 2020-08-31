package json;

import com.google.gson.*;
import model.ServerVariable;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class ServerVariableDeserializer implements JsonDeserializer<ServerVariable> {
    @Override
    public ServerVariable deserialize(JsonElement jsonElement, Type type,
                                      JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject serverVariableJsonObject = jsonElement.getAsJsonObject();

        ServerVariable serverVariable = new ServerVariable();

        serverVariable.setDefault(serverVariableJsonObject.get("default").getAsString());
        serverVariable.setDescription(serverVariableJsonObject.get("description").getAsString());

        JsonArray enumJson = serverVariableJsonObject.getAsJsonArray("enum");
        ArrayList<String> enumList = new ArrayList<>();
        enumJson.forEach(stringJson -> enumList.add(stringJson.getAsString()));
        String[] enumArray = new String[enumList.size()];
        enumList.toArray(enumArray);
        serverVariable.setEnum(enumArray);

        return serverVariable;
    }
}
