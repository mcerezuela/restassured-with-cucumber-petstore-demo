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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        Assert.assertNotNull(commonUtils.getRequest(Object.class,"/openapi.json"));
    }

    @Test
    public void compareOpenAPIFromServiceWithBaseLine() {
        Petstore petstore = (Petstore) commonUtils.getRequest(Petstore.class,"/openapi.json");
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
        Assert.assertEquals(commonUtils.postRequest(newPet,PetResponseEntity.class ,"pet"),newPet);
    }

    @Test
    public void putPet() {
        requestAllPetsAvailability();
        PetResponseEntity randomPet = allPetsList.modifyRandomPet();
        Assert.assertEquals(randomPet,commonUtils.putRequest(randomPet,PetResponseEntity.class ,"pet"));
    }

    @Test
    public void getPetsById() {
        requestAllPetsAvailability();
        PetResponseEntity randomPet = allPetsList.getRandomPet();
        Assert.assertEquals(randomPet,commonUtils.sendGetPetRequestPathParams("petId",
                randomPet.getId().toString(),endPointsWrapper.getEndpointValue("petPetId")));
    }

    @Test
    public void postPetsById() {
        requestAllPetsAvailability();
        PetResponseEntity randomPet = allPetsList.getRandomPet();
        Map<String, String> pathParamsMap = allPetsList.getNameAndStatusFromPet(randomPet);
    }

    private void sendRequestsForPetsByTags(ArrayList<PetResponseEntity> allPetsWithTags) {
        String parameterName = getPetPetFindByTags().get(0).getName();
        String latestTag ="";
        for(PetResponseEntity petResponseEntity :allPetsWithTags){
            if(!isRepeatedTagName(latestTag,petResponseEntity)){
                latestTag = petResponseEntity.getTags().get(0).getName();
                Assert.assertNotNull(
                        commonUtils.sendGetPetRequestQueryParam(parameterName,
                                latestTag,
                                endPointsWrapper.getEndpointValue("petFindByTags")));
            }
        }

    }

    private boolean isRepeatedTagName(String latestTag, PetResponseEntity petResponseEntity) {
        return latestTag.equals(petResponseEntity.getTags().get(0).getName());
    }

    private PetResponseEntity[] getPetsBystatus(int statusIndex) {
        String parameterName = getPetFindByStatusParameters().get(0).getName();
        String parameterValue = getPetFindByStatusParameters().get(0).getSchema().getEnum()
                .get(statusIndex);
        return getRequestPetsBystatus(parameterName,parameterValue);
    }

    private PetResponseEntity[] getRequestPetsBystatus(String parameterName, String parameterValue) {
        return commonUtils.sendGetPetRequestQueryParam(parameterName, parameterValue,endPointsWrapper.getEndpointValue("PetFindByStatus"));
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