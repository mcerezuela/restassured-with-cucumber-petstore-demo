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
            assertOpenapiSpecificationIsCorrect(oas, sourceJson);
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

    private void assertOpenapiSpecificationIsCorrect(OpenAPISpecification oas, JsonObject sourceJson) {
        Assert.assertEquals(oas.getOpenapi(), getStringValue(sourceJson, "openapi"));

        assertInfoIsCorrect(oas.getInfo(), sourceJson.getAsJsonObject("info"));
        assertServersIsCorrect(oas.getServers(), sourceJson.getAsJsonArray("servers"));
        assertPathsIsCorrect(oas.getPaths(), sourceJson.getAsJsonObject("paths"));
        assertComponentsIsCorrect(oas.getComponents(), sourceJson.getAsJsonObject("components"));
        assertSecurityIsCorrect(oas.getSecurity(), sourceJson.getAsJsonObject("security"));
        assertTagsIsCorrect(oas.getTags(), sourceJson.getAsJsonObject("tags"));
        assertExternalDocsIsCorrect(oas.getExternalDocs(), sourceJson.getAsJsonObject("externalDocs"));
    }

    private void assertInfoIsCorrect(Info info, JsonObject expectedInfo) {
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

    private void assertServersIsCorrect(Server[] servers, JsonArray expectedServers) {
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

    private void assertPathsIsCorrect(Paths paths, JsonObject expectedPaths) {
        Assert.fail("Not implemented");
    }

    private void assertComponentsIsCorrect(Components components, JsonObject expectedComponents) {
        Assert.fail("Not implemented");
    }

    private void assertSecurityIsCorrect(SecurityRequirement[] securityRequirements, JsonObject expectedSecurityRequirements) {
        Assert.fail("Not implemented");
    }

    private void assertTagsIsCorrect(Tag[] tags, JsonObject expectedTags) {
        Assert.fail("Not implemented");
    }

    private void assertExternalDocsIsCorrect(ExternalDocumentation externalDocumentation, JsonObject expectedExternalDocumentation) {
        Assert.fail("Not implemented");
    }
}
