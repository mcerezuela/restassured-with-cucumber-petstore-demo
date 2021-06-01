package com.petstore.root;



import com.petstore.common.CommonUtils;
import com.petstore.entities.endpoints.AllPetsWrapper;
import com.petstore.entities.endpoints.EndPointsWrapper;
import com.petstore.PetStoreUtils;
import com.petstore.components.schemas.pet.PetResponseEntity;

import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import static io.restassured.RestAssured.given;

public class TestPetstoreService {
    Petstore referencePetStore;
    EndPointsWrapper endPointsWrapper;
    CommonUtils commonUtils;
    List<Parameter> byStatusParameters;
    List<Parameter__1> byTagParameters;
    AllPetsWrapper allPetsList;

    public TestPetstoreService() {
        try {
            referencePetStore = PetStoreUtils.getReferencePetStore();
            allPetsList = new AllPetsWrapper();
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
        PetResponseEntity[] petReceived = getRequestPetsBystatus(parameterName,parameterValue);
        Assert.assertNotNull(petReceived);
    }

    @Test
    public void getPetsByStatusAvailable() {
        PetResponseEntity[] petReceived = getPetsBystatus(0);
        Assert.assertNotNull(petReceived);
    }

    @Test
    public void getPetsByStatusPending() {
        PetResponseEntity[] petReceived = getPetsBystatus(1);
        Assert.assertNotNull(petReceived);
    }

    @Test
    public void getPetsByStatusSold() {
        PetResponseEntity[] petReceived = getPetsBystatus(2);
        Assert.assertNotNull(petReceived);
    }

    @Test
    public void getPetsByTags() {
        requestAllPetsAvailability();
        sendRequestsForPetsByTags(allPetsList.getListOfPetsWithNonCeroTags());
    }

    @Test
    public void postNewPets() {
        requestAllPetsAvailability();
        PetResponseEntity newPet = allPetsList.createNewPet();
        Assert.assertTrue(postRequestCreatePet(newPet,"pet").equals(newPet));
    }

    private void sendRequestsForPetsByTags(ArrayList<PetResponseEntity> allPetsWithTags) {
        String parameterName = getPetPetFindByTags().get(0).getName();
        for(PetResponseEntity petResponseEntity :allPetsWithTags){
            Assert.assertNotNull(senGetRequestQuery(parameterName,petResponseEntity.getTags()
            .get(0).getName(),"petFindByTags"));
        }

    }

    private PetResponseEntity[] getPetsBystatus(int statusIndex) {
        String parameterName = getPetFindByStatusParameters().get(0).getName();
        String parameterValue = getPetFindByStatusParameters().get(0).getSchema().getEnum()
                .get(statusIndex);
        return getRequestPetsBystatus(parameterName,parameterValue);
    }

    private PetResponseEntity[] getRequestPetsBystatus(String parameterName, String parameterValue) {
        return senGetRequestQuery(parameterName, parameterValue,"PetFindByStatus");
    }

    private PetResponseEntity[] senGetRequestQuery(String parameterName, String parameterValue,
                                                   String operationId) {
        String endpoint = endPointsWrapper.getEndpointValue(operationId);
        return given().
                spec(commonUtils.getSpecs()).
                queryParam(parameterName, parameterValue).
                when().
                get(endpoint).
                then().
                statusCode(200).
                extract().
                as(PetResponseEntity[].class);
    }

    private PetResponseEntity postRequestCreatePet(PetResponseEntity petResponseEntity,String operationId) {
        String endpoint = endPointsWrapper.getEndpointValue(operationId);
        return given().
                spec(commonUtils.getSpecs()).
                body(petResponseEntity).
                when().
                post(endpoint).
                then().
                statusCode(200).
                extract().
                as(PetResponseEntity.class);
    }

    private List<Parameter> getPetFindByStatusParameters() {
        if(null== byStatusParameters){
            byStatusParameters = referencePetStore.getPaths().getPetFindByStatus().getGet().getParameters();
        }
        return byStatusParameters;
    }

    private List<Parameter__1> getPetPetFindByTags() {
        if(null== byTagParameters){
            byTagParameters = referencePetStore.getPaths().getPetFindByTags().getGet().getParameters();
        }
        return byTagParameters;
    }

    private void requestAllPetsAvailability() {
        allPetsList.add(getPetsBystatus(0));
        allPetsList.add(getPetsBystatus(1));
        allPetsList.add(getPetsBystatus(2));
    }

}