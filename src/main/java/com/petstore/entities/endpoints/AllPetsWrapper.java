package com.petstore.entities.endpoints;

import com.petstore.components.schemas.pet.PetResponseEntity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
        List<PetResponseEntity> petsWithAtLeastOneTags = new ArrayList<>();
        for (PetResponseEntity petResponseEntity : petList) {
            if (petResponseEntity.getTags().size() > 0) petsWithAtLeastOneTags.add(petResponseEntity);
        }
        return (ArrayList<PetResponseEntity>) petsWithAtLeastOneTags;
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

    private int generateRandomNumber(int max,int min){
        Random random = new Random();
        int num = random.nextInt((max - min));
        if(debug)System.out.println("NUMBER: "+num);
        return num;
    }

}
