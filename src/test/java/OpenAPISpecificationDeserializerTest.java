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

    private void assertStringMapsAreEqual(Map<String, String> map, JsonObject expectedMap) {
        if (expectedMap != null) {
            Assert.assertEquals(map.size(), expectedMap.size());
            Assert.assertEquals(map.keySet(), expectedMap.keySet());
            for (Map.Entry<String, JsonElement> entry : expectedMap.entrySet()) {
                String key = entry.getKey();
                Assert.assertEquals(map.get(key), expectedMap.get(key).getAsString());
            }
        } else {
            Assert.assertNull(map);
        }
    }

    private void assertStringArrayMapsAreEqual(Map<String, String[]> map, JsonObject expectedMap) {
        if (expectedMap != null) {
            Assert.assertEquals(map.size(), expectedMap.size());
            Assert.assertEquals(map.keySet(), expectedMap.keySet());
            for (Map.Entry<String, JsonElement> entry : expectedMap.entrySet()) {
                String key = entry.getKey();
                assertStringArraysAreEqual(map.get(key), expectedMap.getAsJsonArray(key));
            }
        } else {
            Assert.assertNull(map);
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
        } else if (referenceable instanceof Header) {
            assertHeaderIsCorrect((Header) referenceable, expectedReferenceable);
        } else if (referenceable instanceof Schema) {
            assertSchemaIsCorrect((Schema) referenceable, expectedReferenceable);
        } else if (referenceable instanceof RequestBody) {
            assertRequestBodyIsCorrect((RequestBody) referenceable, expectedReferenceable);
        } else if (referenceable instanceof Response) {
            assertResponseIsCorrect((Response) referenceable, expectedReferenceable);
        } else if (referenceable instanceof Link) {
            assertLinkIsCorrect((Link) referenceable, expectedReferenceable);
        } else if (referenceable instanceof Callback) {
            assertCallbackIsCorrect((Callback) referenceable, expectedReferenceable);
        } else if (referenceable instanceof SecurityScheme) {
            assertSecuritySchemeIsCorrect((SecurityScheme) referenceable, expectedReferenceable);
        } else if (referenceable instanceof Example) {
            assertExampleIsCorrect((Example) referenceable, expectedReferenceable);
        }
    }

    private void assertExampleIsCorrect(Example example, JsonObject expectedExcample) {
        Assert.fail("Not implemented");
    }

    private void assertOpenapiSpecificationIsCorrect(OpenAPISpecification oas, JsonObject sourceJson) {
        Assert.assertEquals(oas.getOpenapi(), getStringValue(sourceJson, "openapi"));

        assertInfoIsCorrect(oas.getInfo(), sourceJson.getAsJsonObject("info"));
        assertServersIsCorrect(oas.getServers(), sourceJson.getAsJsonArray("servers"));
        assertPathsIsCorrect(oas.getPaths(), sourceJson.getAsJsonObject("paths"));
        assertComponentsIsCorrect(oas.getComponents(), sourceJson.getAsJsonObject("components"));
        assertSecurityIsCorrect(oas.getSecurity(), sourceJson.getAsJsonArray("security"));
        assertTagsIsCorrect(oas.getTags(), sourceJson.getAsJsonArray("tags"));
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
            assertRequestBodyReferenceableIsCorrect(operation.getRequestBody(), expectedOperation.getAsJsonObject("requestBody"));
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

    private void assertParametersIsCorrect(Map<String, IReferenceable<Parameter>> parametersMap, JsonObject expectedParametersMap) {
        assertMapsAreEqual(parametersMap, expectedParametersMap, this::assertReferenceableIsCorrect);
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

        assertSchemaReferenceableIsCorrect(parameter.getSchema(), expectedParameter.getAsJsonObject("schema"));
        // TODO example and examples
    }

    private void assertRequestBodyReferenceableIsCorrect(IReferenceable<RequestBody> requestBody, JsonObject expectedRequestBody) {
        assertReferenceableIsCorrect(requestBody, expectedRequestBody);
    }

    private void assertRequestBodyIsCorrect(RequestBody requestBody, JsonObject expectedRequestBody) {
        Assert.assertEquals(requestBody.getDescription(), getStringValue(expectedRequestBody, "description"));
        Assert.assertEquals(requestBody.isRequired(), getBooleanValue(expectedRequestBody, "required"));

        assertContentIsCorrect(requestBody.getContent(), expectedRequestBody.getAsJsonObject("content"));
    }

    private void assertRequestBodiesIsCorrect(Map<String, IReferenceable<RequestBody>> requestBodiesMap, JsonObject expectedRequestBodiesMap) {
        assertMapsAreEqual(requestBodiesMap, expectedRequestBodiesMap, this::assertReferenceableIsCorrect);
    }

    private void assertContentIsCorrect(Map<String, MediaType> mediaType, JsonObject expectedMediaType) {
        assertMapsAreEqual(mediaType, expectedMediaType, this::assertMediaTypeIsCorrect);
    }

    private void assertMediaTypeIsCorrect(MediaType mediaType, JsonObject expectedMediaType) {
        assertSchemaReferenceableIsCorrect(mediaType.getSchema(), expectedMediaType.getAsJsonObject("schema"));
        // TODO example and examples
        assertEncondingsIsCorrect(mediaType.getEncoding(), expectedMediaType.getAsJsonObject("enconding"));
    }

    private void assertEncondingsIsCorrect(Map<String, Encoding> encodingMap, JsonObject expectedEncodingMap) {
        assertMapsAreEqual(encodingMap, expectedEncodingMap, this::assertEncondingIsCorrect);
    }

    private void assertEncondingIsCorrect(Encoding encoding, JsonObject expectedEncoding) {
        Assert.assertEquals(encoding.getContentType(), getStringValue(expectedEncoding, "contentType"));
        Assert.assertEquals(encoding.getStyle(), getStringValue(expectedEncoding, "style"));
        Assert.assertEquals(encoding.isExplode(), getBooleanValue(expectedEncoding, "explode"));
        Assert.assertEquals(encoding.isAllowReserved(), getBooleanValue(expectedEncoding, "allowReserved"));

        assertHeadersIsCorrect(encoding.getHeaders(), expectedEncoding.getAsJsonObject("headers"));
    }

    private void assertHeadersIsCorrect(Map<String, IReferenceable<Header>> headersMap, JsonObject expectedHeadersMap) {
        assertMapsAreEqual(headersMap, expectedHeadersMap, this::assertReferenceableIsCorrect);
    }

    private void assertHeaderIsCorrect(Header header, JsonObject expectedHeader) {
        Assert.assertEquals(header.getDescription(), getStringValue(expectedHeader, "description"));
        Assert.assertEquals(header.isRequired(), getBooleanValue(expectedHeader, "required"));
        Assert.assertEquals(header.isDeprecated(), getBooleanValue(expectedHeader, "deprecated"));
        Assert.assertEquals(header.isAllowEmptyValue(), getBooleanValue(expectedHeader, "allowEmptyValue"));
        Assert.assertEquals(header.getStyle(), getStringValue(expectedHeader, "style"));
        Assert.assertEquals(header.isExplode(), getBooleanValue(expectedHeader, "explode"));
        Assert.assertEquals(header.isAllowReserved(), getBooleanValue(expectedHeader, "allowReserved"));

        assertSchemaReferenceableIsCorrect(header.getSchema(), expectedHeader.getAsJsonObject("schema"));
        // TODO example and examples
    }

    private void assertResponsesIsCorrect(Responses responses, JsonObject expectedResponses) {
        assertReferenceableIsCorrect(responses.getDefault(), expectedResponses.getAsJsonObject("default"));
        JsonObject expectedResponsesCopy = expectedResponses.deepCopy();
        expectedResponsesCopy.remove("default");
        assertMapsAreEqual(responses.getResponseMap(), expectedResponsesCopy, this::assertReferenceableIsCorrect);
    }

    private void assertResponsesIsCorrect(Map<String, IReferenceable<Response>> responsesMap, JsonObject expectedResponsesMap) {
        assertMapsAreEqual(responsesMap, expectedResponsesMap, this::assertReferenceableIsCorrect);
    }

    private void assertResponseIsCorrect(Response response, JsonObject expectedResponse) {
        if (expectedResponse != null) {
            Assert.assertEquals(response.getDescription(), getStringValue(expectedResponse, "description"));

            assertHeadersIsCorrect(response.getHeaders(), expectedResponse.getAsJsonObject("headers"));
            assertContentIsCorrect(response.getContent(), expectedResponse.getAsJsonObject("content"));
            assertLinksIsCorrect(response.getLinks(), expectedResponse.getAsJsonObject("link"));
        } else {
            Assert.assertNull(response);
        }
    }

    private void assertLinksIsCorrect(Map<String, IReferenceable<Link>> linksMap, JsonObject expectedLinksMap) {
        assertMapsAreEqual(linksMap, expectedLinksMap, this::assertReferenceableIsCorrect);
    }

    private void assertLinkIsCorrect(Link link, JsonObject expectedLink) {
        Assert.assertEquals(link.getOperationRef(), getStringValue(expectedLink, "operationRef"));
        Assert.assertEquals(link.getOperationId(), getStringValue(expectedLink, "operationId"));
        Assert.assertEquals(link.getDescription(), getStringValue(expectedLink, "description"));

        assertServerIsCorrect(link.getServer(), expectedLink.getAsJsonObject("server"));

        // TODO parameters and requestBody
    }

    private void assertCallbacksIsCorrect(Map<String, IReferenceable<Callback>> callbacksMap, JsonObject expectedCallbacksMap) {
        assertMapsAreEqual(callbacksMap, expectedCallbacksMap, this::assertReferenceableIsCorrect);
    }

    private void assertCallbackIsCorrect(Callback callback, JsonObject expectedCallback) {
        assertMapsAreEqual(callback.getPathMap(), expectedCallback, this::assertPathItemIsCorrect);
    }

    private void assertComponentsIsCorrect(Components components, JsonObject expectedComponents) {
        if (expectedComponents != null) {
            assertSchemasIsCorrect(components.getSchemas(), expectedComponents.getAsJsonObject("schemas"));
            assertResponsesIsCorrect(components.getResponses(), expectedComponents.getAsJsonObject("responses"));
            assertParametersIsCorrect(components.getParameters(), expectedComponents.getAsJsonObject("parameters"));
            assertRequestBodiesIsCorrect(components.getRequestBodies(), expectedComponents.getAsJsonObject("requestBodies"));
            assertHeadersIsCorrect(components.getHeaders(), expectedComponents.getAsJsonObject("headers"));
            assertSecuritySchemesIsCorrect(components.getSecuritySchemes(), expectedComponents.getAsJsonObject("securitySchemes"));
            assertLinksIsCorrect(components.getLinks(), expectedComponents.getAsJsonObject("links"));
            assertCallbacksIsCorrect(components.getCallbacks(), expectedComponents.getAsJsonObject("callbacks"));

            // TODO examples
        } else {
            Assert.assertNull(components);
        }
    }

    private void assertSecuritySchemesIsCorrect(Map<String, IReferenceable<SecurityScheme>> securitySchemesMap, JsonObject expectedSecuritySchemesMap) {
        assertMapsAreEqual(securitySchemesMap, expectedSecuritySchemesMap, this::assertReferenceableIsCorrect);
    }

    private void assertSecuritySchemeIsCorrect(SecurityScheme securityScheme, JsonObject expectedSecurityScheme) {
        Assert.assertEquals(securityScheme.getType(), getStringValue(expectedSecurityScheme, "type"));
        Assert.assertEquals(securityScheme.getDescription(), getStringValue(expectedSecurityScheme, "description"));
        Assert.assertEquals(securityScheme.getName(), getStringValue(expectedSecurityScheme, "name"));
        Assert.assertEquals(securityScheme.getIn(), getStringValue(expectedSecurityScheme, "in"));
        Assert.assertEquals(securityScheme.getScheme(), getStringValue(expectedSecurityScheme, "scheme"));
        Assert.assertEquals(securityScheme.getBearerFormat(), getStringValue(expectedSecurityScheme, "bearerFormat"));
        Assert.assertEquals(securityScheme.getOpenIdConnectUrl(), getStringValue(expectedSecurityScheme, "openIdConnectUrl"));

        assertOAuthFlowsIsCorrect(securityScheme.getFlows(), expectedSecurityScheme.getAsJsonObject("flows"));
    }

    private void assertOAuthFlowsIsCorrect(OAuthFlows flows, JsonObject expectedFlows) {
        assertOAuthFlowIsCorrect(flows.getImplicit(), expectedFlows.getAsJsonObject("implicit"));
        assertOAuthFlowIsCorrect(flows.getPassword(), expectedFlows.getAsJsonObject("password"));
        assertOAuthFlowIsCorrect(flows.getClientCredentials(), expectedFlows.getAsJsonObject("clientCredentials"));
        assertOAuthFlowIsCorrect(flows.getAuthorizationCode(), expectedFlows.getAsJsonObject("authorizationCode"));
    }

    private void assertOAuthFlowIsCorrect(OAuthFlow flow, JsonObject expectedFlow) {
        if (expectedFlow != null) {
            Assert.assertEquals(flow.getAuthorizationUrl(), getStringValue(expectedFlow, "authorizationUrl"));
            Assert.assertEquals(flow.getTokenUrl(), getStringValue(expectedFlow, "tokenUrl"));
            Assert.assertEquals(flow.getRefreshUrl(), getStringValue(expectedFlow, "tokenUrl"));
            assertStringMapsAreEqual(flow.getScopes(), expectedFlow.getAsJsonObject("scopes"));
        } else {
            Assert.assertNull(flow);
        }
    }

    private void assertSchemasIsCorrect(Map<String, IReferenceable<Schema>> schemasMap, JsonObject expectedSchemasMap) {
        assertMapsAreEqual(schemasMap, expectedSchemasMap, this::assertReferenceableIsCorrect);
    }

    private void assertSchemaReferenceableIsCorrect(IReferenceable<Schema> schema, JsonObject expectedSchema) {
        assertReferenceableIsCorrect(schema, expectedSchema);
    }

    private void assertSchemaIsCorrect(Schema schema, JsonObject expectedSchema) {
        Assert.fail("Not implemented");
    }

    private void assertSecurityIsCorrect(SecurityRequirement[] securityRequirements, JsonArray expectedSecurityRequirements) {
        assertArraysAreEqual(securityRequirements, expectedSecurityRequirements, this::assertSecurityRequirementIsCorrect);
    }

    private void assertSecurityRequirementIsCorrect(SecurityRequirement securityRequirements, JsonObject expectedSecurityRequirements) {
        assertStringArrayMapsAreEqual(securityRequirements.getRequirements(), expectedSecurityRequirements);
    }

    private void assertTagsIsCorrect(Tag[] tags, JsonArray expectedTags) {
        assertArraysAreEqual(tags, expectedTags, this::assertTagIsCorrect);
    }

    private void assertTagIsCorrect(Tag tag, JsonObject expectedTag) {
        Assert.assertEquals(tag.getName(), getStringValue(expectedTag, "name"));
        Assert.assertEquals(tag.getDescription(), getStringValue(expectedTag, "description"));

        assertExternalDocsIsCorrect(tag.getExternalDocs(), expectedTag.getAsJsonObject("externalDocs"));
    }

    private void assertExternalDocsIsCorrect(ExternalDocumentation externalDocumentation, JsonObject expectedExternalDocumentation) {
        if (expectedExternalDocumentation != null) {
            Assert.assertEquals(externalDocumentation.getDescription(), getStringValue(expectedExternalDocumentation, "description"));
            Assert.assertEquals(externalDocumentation.getUrl(), getStringValue(expectedExternalDocumentation, "url"));
        } else {
            Assert.assertNull(externalDocumentation);
        }
    }
}
