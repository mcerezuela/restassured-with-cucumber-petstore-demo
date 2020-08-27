package main;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import json.PathsDeserializer;
import json.ResponsesDeserializer;
import model.OpenAPISpecification;
import model.Paths;
import model.Responses;

public class Main {

    public static void main(String[] args) {
        String json = "{\n" +
                "    \"openapi\": \"3.0.0\",\n" +
                "    \"info\": {\n" +
                "      \"version\": \"1.0.0\",\n" +
                "      \"title\": \"Swagger Petstore\",\n" +
                "      \"description\": \"A sample API that uses a petstore as an example to demonstrate features in the OpenAPI 3.0 specification\",\n" +
                "      \"termsOfService\": \"http://swagger.io/terms/\",\n" +
                "      \"contact\": {\n" +
                "        \"name\": \"Swagger API Team\",\n" +
                "        \"email\": \"apiteam@swagger.io\",\n" +
                "        \"url\": \"http://swagger.io\"\n" +
                "      },\n" +
                "      \"license\": {\n" +
                "        \"name\": \"Apache 2.0\",\n" +
                "        \"url\": \"https://www.apache.org/licenses/LICENSE-2.0.html\"\n" +
                "      }\n" +
                "    },\n" +
                "    \"servers\": [\n" +
                "      {\n" +
                "        \"url\": \"http://petstore.swagger.io/api\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"paths\": {\n" +
                "      \"/pets\": {\n" +
                "        \"get\": {\n" +
                "          \"description\": \"Returns all pets from the system that the user has access to\\nNam sed condimentum est. Maecenas tempor sagittis sapien, nec rhoncus sem sagittis sit amet. Aenean at gravida augue, ac iaculis sem. Curabitur odio lorem, ornare eget elementum nec, cursus id lectus. Duis mi turpis, pulvinar ac eros ac, tincidunt varius justo. In hac habitasse platea dictumst. Integer at adipiscing ante, a sagittis ligula. Aenean pharetra tempor ante molestie imperdiet. Vivamus id aliquam diam. Cras quis velit non tortor eleifend sagittis. Praesent at enim pharetra urna volutpat venenatis eget eget mauris. In eleifend fermentum facilisis. Praesent enim enim, gravida ac sodales sed, placerat id erat. Suspendisse lacus dolor, consectetur non augue vel, vehicula interdum libero. Morbi euismod sagittis libero sed lacinia.\\n\\nSed tempus felis lobortis leo pulvinar rutrum. Nam mattis velit nisl, eu condimentum ligula luctus nec. Phasellus semper velit eget aliquet faucibus. In a mattis elit. Phasellus vel urna viverra, condimentum lorem id, rhoncus nibh. Ut pellentesque posuere elementum. Sed a varius odio. Morbi rhoncus ligula libero, vel eleifend nunc tristique vitae. Fusce et sem dui. Aenean nec scelerisque tortor. Fusce malesuada accumsan magna vel tempus. Quisque mollis felis eu dolor tristique, sit amet auctor felis gravida. Sed libero lorem, molestie sed nisl in, accumsan tempor nisi. Fusce sollicitudin massa ut lacinia mattis. Sed vel eleifend lorem. Pellentesque vitae felis pretium, pulvinar elit eu, euismod sapien.\\n\",\n" +
                "          \"operationId\": \"findPets\",\n" +
                "          \"parameters\": [\n" +
                "            {\n" +
                "              \"name\": \"tags\",\n" +
                "              \"in\": \"query\",\n" +
                "              \"description\": \"tags to filter by\",\n" +
                "              \"required\": false,\n" +
                "              \"style\": \"form\",\n" +
                "              \"schema\": {\n" +
                "                \"type\": \"array\",\n" +
                "                \"items\": {\n" +
                "                  \"type\": \"string\"\n" +
                "                }\n" +
                "              }\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"limit\",\n" +
                "              \"in\": \"query\",\n" +
                "              \"description\": \"maximum number of results to return\",\n" +
                "              \"required\": false,\n" +
                "              \"schema\": {\n" +
                "                \"type\": \"integer\",\n" +
                "                \"format\": \"int32\"\n" +
                "              }\n" +
                "            }\n" +
                "          ],\n" +
                "          \"responses\": {\n" +
                "            \"200\": {\n" +
                "              \"description\": \"pet response\",\n" +
                "              \"content\": {\n" +
                "                \"application/json\": {\n" +
                "                  \"schema\": {\n" +
                "                    \"type\": \"array\",\n" +
                "                    \"items\": {\n" +
                "                      \"$ref\": \"#/components/schemas/Pet\"\n" +
                "                    }\n" +
                "                  }\n" +
                "                }\n" +
                "              }\n" +
                "            },\n" +
                "            \"default\": {\n" +
                "              \"description\": \"unexpected error\",\n" +
                "              \"content\": {\n" +
                "                \"application/json\": {\n" +
                "                  \"schema\": {\n" +
                "                    \"$ref\": \"#/components/schemas/Error\"\n" +
                "                  }\n" +
                "                }\n" +
                "              }\n" +
                "            }\n" +
                "          }\n" +
                "        },\n" +
                "        \"post\": {\n" +
                "          \"description\": \"Creates a new pet in the store. Duplicates are allowed\",\n" +
                "          \"operationId\": \"addPet\",\n" +
                "          \"requestBody\": {\n" +
                "            \"description\": \"Pet to add to the store\",\n" +
                "            \"required\": true,\n" +
                "            \"content\": {\n" +
                "              \"application/json\": {\n" +
                "                \"schema\": {\n" +
                "                  \"$ref\": \"#/components/schemas/NewPet\"\n" +
                "                }\n" +
                "              }\n" +
                "            }\n" +
                "          },\n" +
                "          \"responses\": {\n" +
                "            \"200\": {\n" +
                "              \"description\": \"pet response\",\n" +
                "              \"content\": {\n" +
                "                \"application/json\": {\n" +
                "                  \"schema\": {\n" +
                "                    \"$ref\": \"#/components/schemas/Pet\"\n" +
                "                  }\n" +
                "                }\n" +
                "              }\n" +
                "            },\n" +
                "            \"default\": {\n" +
                "              \"description\": \"unexpected error\",\n" +
                "              \"content\": {\n" +
                "                \"application/json\": {\n" +
                "                  \"schema\": {\n" +
                "                    \"$ref\": \"#/components/schemas/Error\"\n" +
                "                  }\n" +
                "                }\n" +
                "              }\n" +
                "            }\n" +
                "          }\n" +
                "        }\n" +
                "      },\n" +
                "      \"/pets/{id}\": {\n" +
                "        \"get\": {\n" +
                "          \"description\": \"Returns a user based on a single ID, if the user does not have access to the pet\",\n" +
                "          \"operationId\": \"find pet by id\",\n" +
                "          \"parameters\": [\n" +
                "            {\n" +
                "              \"name\": \"id\",\n" +
                "              \"in\": \"path\",\n" +
                "              \"description\": \"ID of pet to fetch\",\n" +
                "              \"required\": true,\n" +
                "              \"schema\": {\n" +
                "                \"type\": \"integer\",\n" +
                "                \"format\": \"int64\"\n" +
                "              }\n" +
                "            }\n" +
                "          ],\n" +
                "          \"responses\": {\n" +
                "            \"200\": {\n" +
                "              \"description\": \"pet response\",\n" +
                "              \"content\": {\n" +
                "                \"application/json\": {\n" +
                "                  \"schema\": {\n" +
                "                    \"$ref\": \"#/components/schemas/Pet\"\n" +
                "                  }\n" +
                "                }\n" +
                "              }\n" +
                "            },\n" +
                "            \"default\": {\n" +
                "              \"description\": \"unexpected error\",\n" +
                "              \"content\": {\n" +
                "                \"application/json\": {\n" +
                "                  \"schema\": {\n" +
                "                    \"$ref\": \"#/components/schemas/Error\"\n" +
                "                  }\n" +
                "                }\n" +
                "              }\n" +
                "            }\n" +
                "          }\n" +
                "        },\n" +
                "        \"delete\": {\n" +
                "          \"description\": \"deletes a single pet based on the ID supplied\",\n" +
                "          \"operationId\": \"deletePet\",\n" +
                "          \"parameters\": [\n" +
                "            {\n" +
                "              \"name\": \"id\",\n" +
                "              \"in\": \"path\",\n" +
                "              \"description\": \"ID of pet to delete\",\n" +
                "              \"required\": true,\n" +
                "              \"schema\": {\n" +
                "                \"type\": \"integer\",\n" +
                "                \"format\": \"int64\"\n" +
                "              }\n" +
                "            }\n" +
                "          ],\n" +
                "          \"responses\": {\n" +
                "            \"204\": {\n" +
                "              \"description\": \"pet deleted\"\n" +
                "            },\n" +
                "            \"default\": {\n" +
                "              \"description\": \"unexpected error\",\n" +
                "              \"content\": {\n" +
                "                \"application/json\": {\n" +
                "                  \"schema\": {\n" +
                "                    \"$ref\": \"#/components/schemas/Error\"\n" +
                "                  }\n" +
                "                }\n" +
                "              }\n" +
                "            }\n" +
                "          }\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    \"components\": {\n" +
                "      \"schemas\": {\n" +
                "        \"Pet\": {\n" +
                "          \"allOf\": [\n" +
                "            {\n" +
                "              \"$ref\": \"#/components/schemas/NewPet\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"type\": \"object\",\n" +
                "              \"required\": [\n" +
                "                \"id\"\n" +
                "              ],\n" +
                "              \"properties\": {\n" +
                "                \"id\": {\n" +
                "                  \"type\": \"integer\",\n" +
                "                  \"format\": \"int64\"\n" +
                "                }\n" +
                "              }\n" +
                "            }\n" +
                "          ]\n" +
                "        },\n" +
                "        \"NewPet\": {\n" +
                "          \"type\": \"object\",\n" +
                "          \"required\": [\n" +
                "            \"name\"\n" +
                "          ],\n" +
                "          \"properties\": {\n" +
                "            \"name\": {\n" +
                "              \"type\": \"string\"\n" +
                "            },\n" +
                "            \"tag\": {\n" +
                "              \"type\": \"string\"\n" +
                "            }\n" +
                "          }\n" +
                "        },\n" +
                "        \"Error\": {\n" +
                "          \"type\": \"object\",\n" +
                "          \"required\": [\n" +
                "            \"code\",\n" +
                "            \"message\"\n" +
                "          ],\n" +
                "          \"properties\": {\n" +
                "            \"code\": {\n" +
                "              \"type\": \"integer\",\n" +
                "              \"format\": \"int32\"\n" +
                "            },\n" +
                "            \"message\": {\n" +
                "              \"type\": \"string\"\n" +
                "            }\n" +
                "          }\n" +
                "        }\n" +
                "      }\n" +
                "    }\n" +
                "  }";

        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Paths.class, new PathsDeserializer());
        gsonBuilder.registerTypeAdapter(Responses.class, new ResponsesDeserializer());

        Gson gson = gsonBuilder.create();

        OpenAPISpecification oas = gson.fromJson(json, OpenAPISpecification.class);
        System.out.println(oas);
    }
}
