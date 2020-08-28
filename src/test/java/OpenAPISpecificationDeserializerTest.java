import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import jdk.nashorn.internal.objects.annotations.Function;
import main.OpenAPISpecificationDeserializer;
import model.*;
import org.testng.Assert;
import org.testng.annotations.*;
import utils.Constants;
import utils.Utils;

import java.io.IOException;
import java.util.Map;
import java.util.function.BiConsumer;

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

    private Boolean getBooleanValue(JsonElement jsonElement, String key) {
        JsonElement value = jsonElement.getAsJsonObject().get(key);
        if (value != null) {
            return value.getAsBoolean();
        } else {
            return null;
        }
    }
    
    private void assertStringArraysAreEqual(String[] array, JsonArray expectedArray) {
        if (expectedArray != null) {
            Assert.assertEquals(array.length, expectedArray.size());
            for (int i = 0; i < expectedArray.size(); i++) {
                Assert.assertEquals(array[i], expectedArray.get(i).getAsString());
            }
        } else {
            Assert.assertNull(array);
        }
    }

    private <T> void assertArraysAreEqual(T[] array, JsonArray expectedArray, BiConsumer<T, JsonObject> consumer) {
        if (expectedArray != null) {
            Assert.assertEquals(array.length, expectedArray.size());
            for (int i = 0; i < expectedArray.size(); i++) {
                consumer.accept(array[i], expectedArray.get(i).getAsJsonObject());
            }
        } else {
            Assert.assertNull(array);
        }
    }

    private <T> void assertMapsAreEqual(Map<String, T> map, JsonObject expectedMap, BiConsumer<T, JsonObject> consumer) {
        if (expectedMap != null) {
            Assert.assertEquals(map.size(), expectedMap.size());
            Assert.assertEquals(map.keySet(), expectedMap.keySet());
            for (Map.Entry<String, JsonElement> entry : expectedMap.entrySet()) {
                String key = entry.getKey();
                consumer.accept(map.get(key), expectedMap.getAsJsonObject(key));
            }
        } else {
            Assert.assertNull(map);
        }
    }

    private void assertOpenapiSpecificationIsCorrect(OpenAPISpecification oas, JsonObject sourceJson) {
        Assert.assertEquals(oas.getOpenapi(), getStringValue(sourceJson, "openapi"));

        assertInfoIsCorrect(oas.getInfo(), sourceJson.getAsJsonObject("info"));
        assertServersIsCorrect(oas.getServers(), sourceJson.getAsJsonArray("servers"));
        assertPathsIsCorrect(oas.getPaths(), sourceJson.getAsJsonObject("paths"));
        assertComponentsIsCorrect(oas.getComponents(), sourceJson.getAsJsonObject("components"));
        assertSecurityIsCorrect(oas.getSecurity(), sourceJson.getAsJsonArray("security"));
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
        assertArraysAreEqual(servers, expectedServers, this::assertServerIsCorrect);
    }

    private void assertServerIsCorrect(Server server, JsonObject expectedServer) {
        Assert.assertEquals(server.getUrl(), getStringValue(expectedServer, "url"));
        Assert.assertEquals(server.getDescription(), getStringValue(expectedServer, "description"));

        assertVariablesIsCorrect(server.getVariables(), expectedServer.getAsJsonObject("variables"));
    }

    private void assertVariablesIsCorrect(Map<String, ServerVariable> variables, JsonObject expectedVariables) {
        assertMapsAreEqual(variables, expectedVariables, this::assertServerVariableIsCorrect);
    }

    private void assertServerVariableIsCorrect(ServerVariable serverVariable, JsonObject expectedServerVariable) {
        assertStringArraysAreEqual(serverVariable.getEnum(), expectedServerVariable.getAsJsonArray("enum"));
        Assert.assertEquals(serverVariable.getDefault(), getStringValue(expectedServerVariable, "default"));
        Assert.assertEquals(serverVariable.getDescription(), getStringValue(expectedServerVariable, "description"));
    }

    private void assertPathsIsCorrect(Paths paths, JsonObject expectedPaths) {
        assertMapsAreEqual(paths.getPathMap(), expectedPaths, this::assertPathItemIsCorrect);
    }

    private void assertPathItemIsCorrect(PathItem pathItem, JsonObject expectedPathItem) {
        Assert.assertEquals(pathItem.getRef(), getStringValue(expectedPathItem, "$ref"));
        Assert.assertEquals(pathItem.getSummary(), getStringValue(expectedPathItem, "summary"));
        Assert.assertEquals(pathItem.getDescription(), getStringValue(expectedPathItem, "description"));

        assertOperationIsCorrect(pathItem.getGet(), expectedPathItem.getAsJsonObject("get"));
        assertOperationIsCorrect(pathItem.getPut(), expectedPathItem.getAsJsonObject("put"));
        assertOperationIsCorrect(pathItem.getPost(), expectedPathItem.getAsJsonObject("post"));
        assertOperationIsCorrect(pathItem.getDelete(), expectedPathItem.getAsJsonObject("delete"));
        assertOperationIsCorrect(pathItem.getOptions(), expectedPathItem.getAsJsonObject("options"));
        assertOperationIsCorrect(pathItem.getHead(), expectedPathItem.getAsJsonObject("head"));
        assertOperationIsCorrect(pathItem.getPatch(), expectedPathItem.getAsJsonObject("patch"));
        assertOperationIsCorrect(pathItem.getTrace(), expectedPathItem.getAsJsonObject("trace"));

        assertServersIsCorrect(pathItem.getServers(), expectedPathItem.getAsJsonArray("servers"));

        assertParametersIsCorrect(pathItem.getParameters(), expectedPathItem.getAsJsonArray("parameters"));
    }

    private void assertOperationIsCorrect(Operation operation, JsonObject expectedOperation) {
        if (expectedOperation != null) {
            assertStringArraysAreEqual(operation.getTags(), expectedOperation.getAsJsonArray("tags"));
            Assert.assertEquals(operation.getSummary(), getStringValue(expectedOperation, "summary"));
            Assert.assertEquals(operation.getDescription(), getStringValue(expectedOperation, "description"));
            Assert.assertEquals(operation.getOperationId(), getStringValue(expectedOperation, "operationId"));
            Assert.assertEquals(operation.isDeprecated(), getBooleanValue(expectedOperation, "deprecated"));

            assertExternalDocsIsCorrect(operation.getExternalDocs(), expectedOperation.getAsJsonObject("externalDocs"));
            assertParametersIsCorrect(operation.getParameters(), expectedOperation.getAsJsonArray("parameters"));
            assertRequestBodyIsCorrect(operation.getRequestBody(), expectedOperation.getAsJsonObject("requestBody"));
            assertResponsesIsCorrect(operation.getResponses(), expectedOperation.getAsJsonObject("responses"));
            assertCallbacksIsCorrect(operation.getCallbacks(), expectedOperation.getAsJsonObject("callbacks"));
            assertSecurityIsCorrect(operation.getSecurity(), expectedOperation.getAsJsonArray("security"));
            assertServersIsCorrect(operation.getServers(), expectedOperation.getAsJsonArray("servers"));
        } else {
            Assert.assertNull(operation);
        }
    }

    private void assertParametersIsCorrect(IReferenceable<Parameter>[] parameters, JsonArray expectedParameters) {
        assertArraysAreEqual(parameters, expectedParameters, this::assertReferenceableIsCorrect);
    }

    private <T extends ReferenceableObject<T>> void assertReferenceableIsCorrect(
            IReferenceable<T> referenceable, JsonObject expectedReferenceable
    ) {
        if (expectedReferenceable != null) {
            if (expectedReferenceable.has("$ref")) {
                Assert.assertTrue(referenceable instanceof Reference);
                assertReferenceIsCorrect(((Reference<T>) referenceable), expectedReferenceable);
            } else {
                Assert.assertTrue(referenceable instanceof ReferenceableObject);
                assertReferenceableObjectIsCorrect(((ReferenceableObject<T>) referenceable), expectedReferenceable);
            }
        } else {
            Assert.assertNull(referenceable);
        }
    }

    private <T extends ReferenceableObject<T>> void assertReferenceIsCorrect(
            Reference<T> reference, JsonObject expectedReference
    ) {
        Assert.assertEquals(reference.getRef(), getStringValue(expectedReference, "$ref"));
    }

    private <T extends ReferenceableObject<T>> void assertReferenceableObjectIsCorrect(
            ReferenceableObject<T> referenceable, JsonObject expectedReferenceable
    ) {
        if (referenceable instanceof Parameter) {
            assertParameterIsCorrect((Parameter) referenceable, expectedReferenceable);
        } else if (referenceable instanceof Schema) {
            assertSchemaIsCorrect((Schema) referenceable, expectedReferenceable);
        }
    }

    private void assertParameterIsCorrect(Parameter parameter, JsonObject expectedParameter) {
        Assert.assertEquals(parameter.getName(), getStringValue(expectedParameter, "name"));
        Assert.assertEquals(parameter.getIn(), getStringValue(expectedParameter, "in"));
        Assert.assertEquals(parameter.getDescription(), getStringValue(expectedParameter, "description"));
        Assert.assertEquals(parameter.isRequired(), getBooleanValue(expectedParameter, "required"));
        Assert.assertEquals(parameter.isDeprecated(), getBooleanValue(expectedParameter, "deprecated"));
        Assert.assertEquals(parameter.isAllowEmptyValue(), getBooleanValue(expectedParameter, "allowEmptyValue"));
        Assert.assertEquals(parameter.getStyle(), getStringValue(expectedParameter, "style"));
        Assert.assertEquals(parameter.isExplode(), getBooleanValue(expectedParameter, "explode"));
        Assert.assertEquals(parameter.isAllowReserved(), getBooleanValue(expectedParameter, "allowReserved"));

        assertReferenceableIsCorrect(parameter.getSchema(), expectedParameter.getAsJsonObject("schema"));
        // TODO example and examples
    }

    private void assertRequestBodyIsCorrect(IReferenceable<RequestBody> requestBody, JsonObject expectedRequestBody) {
        Assert.fail("Not implemented");
    }

    private void assertResponsesIsCorrect(Responses responses, JsonObject expectedResponses) {
        Assert.fail("Not implemented");
    }

    private void assertCallbacksIsCorrect(Map<String, IReferenceable<Callback>> callbacks, JsonObject expectedCallbacks) {
        Assert.fail("Not implemented");
    }

    private void assertComponentsIsCorrect(Components components, JsonObject expectedComponents) {
        Assert.fail("Not implemented");
    }

    private void assertSchemaIsCorrect(Schema schema, JsonObject expectedSchema) {
        Assert.fail("Not implemented");
    }

    private void assertSecurityIsCorrect(SecurityRequirement[] securityRequirements, JsonArray expectedSecurityRequirements) {
        Assert.fail("Not implemented");
    }

    private void assertTagsIsCorrect(Tag[] tags, JsonObject expectedTags) {
        Assert.fail("Not implemented");
    }

    private void assertExternalDocsIsCorrect(ExternalDocumentation externalDocumentation, JsonObject expectedExternalDocumentation) {
        Assert.fail("Not implemented");
    }
}
