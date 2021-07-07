package com.petstore.entities.endpoints;

import com.petstore.PetStoreUtils;
import com.petstore.components.schemas.pet.PetResponseEntity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;


public class AllPetsWrapper {
    boolean debug = false;
    private List<PetResponseEntity> petList;

    public AllPetsWrapper() {
        petList = new ArrayList<>();
    }

    public void add(PetResponseEntity[] petsBystatus) {
        petList.addAll(Arrays.asList(petsBystatus));
    }

    public ArrayList<PetResponseEntity> getListOfPetsWithNonCeroTags() {
        ArrayList<PetResponseEntity> petsWithAtLeastOneTags = new ArrayList<>();
        for (PetResponseEntity petResponseEntity : petList) {
            if (isAValidTag(petResponseEntity)) {
                petsWithAtLeastOneTags.add(petResponseEntity);
            }
        }
        return petsWithAtLeastOneTags;
    }


    public PetResponseEntity createNewPet() {
        PetResponseEntity newPet = new PetResponseEntity();
        newPet.setId(generateRandomNumber(100000,0));
        newPet.setCategory(petList.get(generateRandomNumber(petList.size(),0)).getCategory());
        newPet.setName(petList.get(generateRandomNumber(petList.size(),0)).getName());
        newPet.setPhotoUrls(petList.get(generateRandomNumber(petList.size(),0)).getPhotoUrls());
        newPet.setTags(petList.get(generateRandomNumber(petList.size(),0)).getTags());
        newPet.setStatus(petList.get(generateRandomNumber(petList.size(),0)).getStatus());
        if(debug)System.out.println("Pet Candidate: "+newPet);
        return newPet;
    }

    public PetResponseEntity modifyRandomPet() {
        PetResponseEntity randomPet = getRandomPet();
        if(debug)System.out.println("Pet To Modify: "+randomPet);
        randomPet.setCategory(petList.get(generateRandomNumber(petList.size(),0)).getCategory());
        randomPet.setName(petList.get(generateRandomNumber(petList.size(),0)).getName());
        randomPet.setPhotoUrls(petList.get(generateRandomNumber(petList.size(),0)).getPhotoUrls());
        randomPet.setTags(petList.get(generateRandomNumber(petList.size(),0)).getTags());
        randomPet.setStatus(petList.get(generateRandomNumber(petList.size(),0)).getStatus());
        if(debug)System.out.println("Pet Modified: "+randomPet);
        return randomPet;
    }

    public PetResponseEntity getRandomPet() {
        return petList.get(generateRandomNumber(petList.size(),0));
    }

    private int generateRandomNumber(int max,int min){
        Random random = new Random();
        int num = random.nextInt((max - min));
        if(debug)System.out.println("NUMBER: "+num);
        return num;
    }

    public boolean isAValidTag(PetResponseEntity petResponseEntity) {
        return (petResponseEntity.getTags().size() > 0) &&
                (!(petResponseEntity.getTags().get(0).getName() ==null));
    }

    public Map<String, String> getNameAndStatusFromPet(PetResponseEntity randomPet) {
        Map<String, String> fieldsNamesMap = PetStoreUtils.getFieldNamesJsonProperties(randomPet);
        return new HashMap<>();
    }
}
