package com.petstore.root;



import com.petstore.common.CommonUtils;
import com.petstore.entities.endpoints.EndPointsWrapper;
import com.petstore.PetStoreUtils;
import com.petstore.components.schemas.pet.PetResponseEntity;

import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;


import static io.restassured.RestAssured.given;

public class TestPetstoreService {
    Petstore referencePetStore;
    EndPointsWrapper endPointsWrapper;
    CommonUtils commonUtils;
    List<Parameter> parameters;

    public TestPetstoreService() {
        try {
            referencePetStore = PetStoreUtils.getReferencePetStore();
        } catch (IOException e) {
            e.printStackTrace();
        }
        commonUtils = new CommonUtils();
    }

    @BeforeClass
    public void requestSpec() {
        commonUtils.setSpecs(referencePetStore.getServers().get(0).getUrl());
    }

    @BeforeClass
    public void getEndpoints(){
        endPointsWrapper = PetStoreUtils.extractEndPoints(referencePetStore.getPaths());
    }

    @Test
    public void requestOpenAPIFromService() {
        given().
                spec(commonUtils.getSpecs()).
                when().
                get("/openapi.json").
                then().
                assertThat().
                statusCode(200);
    }

    @Test
    public void compareOpenAPIFromServiceWithBaseLine() {
        Petstore petstore =
                given().
                        spec(commonUtils.getSpecs()).
                        when().
                        get("/openapi.json").
                        as(Petstore.class);
        Assert.assertEquals(petstore, referencePetStore);

    }

    @Test
    public void getPetsByStatusDefault() {
        String parameterName = getPetFindByStatusParameters().get(0).getName();
        String parameterValue = getPetFindByStatusParameters().get(0).getSchema().getDefault();
        PetResponseEntity[] petReceived = getPetsBystatus(parameterName,parameterValue);
        Assert.assertNotNull(petReceived);
    }

    @Test
    public void getPetsByStatusPending() {
        String parameterName = getPetFindByStatusParameters().get(0).getName();
        String parameterValue = getPetFindByStatusParameters().get(0).getSchema().getEnum().get(1);
        PetResponseEntity[] petReceived = getPetsBystatus(parameterName,parameterValue);
        Assert.assertNotNull(petReceived);
    }

    @Test
    public void getPetsByStatusAvailable() {
        String parameterName = getPetFindByStatusParameters().get(0).getName();
        String parameterValue = getPetFindByStatusParameters().get(0).getSchema().getEnum().get(0);
        PetResponseEntity[] petReceived = getPetsBystatus(parameterName,parameterValue);
        Assert.assertNotNull(petReceived);
    }

    @Test
    public void getPetsByStatusSold() {
        String parameterName = getPetFindByStatusParameters().get(0).getName();
        String parameterValue = getPetFindByStatusParameters().get(0).getSchema().getEnum().get(2);
        PetResponseEntity[] petReceived = getPetsBystatus(parameterName,parameterValue);
        Assert.assertNotNull(petReceived);
    }

    private PetResponseEntity[] getPetsBystatus(String parameterName, String parameterValue) {
        String PetFindByStatusEndpoint = endPointsWrapper.getEndpointValue("PetFindByStatus");
        return given().
                spec(commonUtils.getSpecs()).
                queryParam(parameterName, parameterValue).
                when().
                get(PetFindByStatusEndpoint).
                then().
                statusCode(200).
                extract().
                as(PetResponseEntity[].class);
    }

    private List<Parameter> getPetFindByStatusParameters() {
        if(null==parameters){
            parameters = referencePetStore.getPaths().getPetFindByStatus().getGet().getParameters();
        }
        return parameters;
    }

}