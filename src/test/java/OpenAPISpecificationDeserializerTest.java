import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import main.OpenAPISpecificationDeserializer;
import model.*;
import org.testng.Assert;
import org.testng.annotations.*;
import utils.Constants;
import utils.Utils;

import java.io.IOException;
import java.util.Map;

@Test()
public class OpenAPISpecificationDeserializerTest {

    @Test
    public void deserializeTest() {
        try {
            String json = Utils.readFile(Constants.PET_STORE_JSON);
            OpenAPISpecification oas = OpenAPISpecificationDeserializer.deserialize(json);
            JsonObject sourceJson = JsonParser.parseString(json).getAsJsonObject();
            Assert.assertNotNull(oas);
            assertOpenapiIsCorrect(oas, sourceJson);
            assertInfoIsCorrect(oas, sourceJson);
            assertServersIsCorrect(oas, sourceJson);
            assertPathsIsCorrect(oas, sourceJson);
            assertComponentsIsCorrect(oas, sourceJson);
            assertSecurityIsCorrect(oas, sourceJson);
            assertTagsIsCorrect(oas, sourceJson);
            assertExternalDocsIsCorrect(oas, sourceJson);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getStringValue(JsonElement jsonElement, String key) {
        JsonElement value = jsonElement.getAsJsonObject().get(key);
        if (value != null) {
            return value.getAsString();
        } else {
            return null;
        }
    }

    private void assertOpenapiIsCorrect(OpenAPISpecification oas, JsonObject sourceJson) {
        String expectedValue = getStringValue(sourceJson, "openapi");
        String value = oas.getOpenapi();

        Assert.assertEquals(value, expectedValue);
    }

    private void assertInfoIsCorrect(OpenAPISpecification oas, JsonObject sourceJson) {
        JsonObject expectedInfo = sourceJson.getAsJsonObject("info");
        Info info = oas.getInfo();

        Assert.assertEquals(info.getTitle(), getStringValue(expectedInfo, "title"));
        Assert.assertEquals(info.getDescription(), getStringValue(expectedInfo, "description"));
        Assert.assertEquals(info.getTermsOfService(), getStringValue(expectedInfo, "termsOfService"));
        Assert.assertEquals(info.getVersion(), getStringValue(expectedInfo, "version"));

        assertContactIsCorrect(info.getContact(), expectedInfo.getAsJsonObject("contact"));
        assertLicenseIsCorrect(info.getLicense(), expectedInfo.getAsJsonObject("license"));
    }

    private void assertContactIsCorrect(Contact contact, JsonObject expectedContact) {
        if (expectedContact != null) {
            Assert.assertEquals(contact.getName(), getStringValue(expectedContact, "name"));
            Assert.assertEquals(contact.getUrl(), getStringValue(expectedContact, "url"));
            Assert.assertEquals(contact.getEmail(), getStringValue(expectedContact, "email"));
        } else {
            Assert.assertNull(contact);
        }
    }

    private void assertLicenseIsCorrect(License license, JsonObject expectedLicense) {
        if (expectedLicense != null) {
            Assert.assertEquals(license.getName(), getStringValue(expectedLicense, "name"));
            Assert.assertEquals(license.getUrl(), getStringValue(expectedLicense, "url"));
        } else {
            Assert.assertNull(license);
        }
    }

    private void assertServersIsCorrect(OpenAPISpecification oas, JsonObject sourceJson) {
        JsonArray expectedServers = sourceJson.getAsJsonArray("servers");
        Server[] servers = oas.getServers();

        if (expectedServers != null) {
            Assert.assertEquals(servers.length, expectedServers.size());
            for (int i = 0; i < expectedServers.size(); i++) {
                assertServerIsCorrect(servers[i], expectedServers.get(i).getAsJsonObject());
            }
        } else {
            Assert.assertNull(servers);
        }
    }

    private void assertServerIsCorrect(Server server, JsonObject expectedServer) {
        Assert.assertEquals(server.getUrl(), getStringValue(expectedServer, "url"));
        Assert.assertEquals(server.getDescription(), getStringValue(expectedServer, "description"));

        assertVariablesIsCorrect(server.getVariables(), expectedServer.getAsJsonObject("variables"));
    }

    private void assertVariablesIsCorrect(Map<String, ServerVariable> variables, JsonObject expectedVariables) {
        if (expectedVariables != null) {
            Assert.assertEquals(variables.size(), expectedVariables.size());
            Assert.assertEquals(variables.keySet(), expectedVariables.keySet());
            for (Map.Entry<String, JsonElement> entry : expectedVariables.entrySet()) {
                String key = entry.getKey();
                assertServerVariableIsCorrect(variables.get(key), expectedVariables.getAsJsonObject(key));
            }
        } else {
            Assert.assertNull(variables);
        }
    }

    private void assertServerVariableIsCorrect(ServerVariable serverVariable, JsonObject expectedServerVariable) {
        JsonArray expectedEnum = expectedServerVariable.getAsJsonArray("enum");
        String[] _enum = serverVariable.getEnum();

        if (expectedEnum != null) {
            Assert.assertEquals(_enum.length, expectedEnum.size());
            for (int i = 0; i < expectedEnum.size(); i++) {
                Assert.assertEquals(_enum[i], expectedEnum.get(i).getAsString());
            }
        } else {
            Assert.assertNull(_enum);
        }

        Assert.assertEquals(serverVariable.getDefault(), getStringValue(expectedServerVariable, "default"));
        Assert.assertEquals(serverVariable.getDescription(), getStringValue(expectedServerVariable, "description"));
    }

    private void assertPathsIsCorrect(OpenAPISpecification oas, JsonObject sourceJson) {
        Assert.fail("Not implemented");
    }

    private void assertComponentsIsCorrect(OpenAPISpecification oas, JsonObject sourceJson) {
        Assert.fail("Not implemented");
    }

    private void assertSecurityIsCorrect(OpenAPISpecification oas, JsonObject sourceJson) {
        Assert.fail("Not implemented");
    }

    private void assertTagsIsCorrect(OpenAPISpecification oas, JsonObject sourceJson) {
        Assert.fail("Not implemented");
    }

    private void assertExternalDocsIsCorrect(OpenAPISpecification oas, JsonObject sourceJson) {
        Assert.fail("Not implemented");
    }
}
