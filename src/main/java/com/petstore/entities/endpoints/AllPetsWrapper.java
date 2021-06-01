package com.petstore.entities.endpoints;

import com.petstore.components.schemas.pet.PetResponseEntity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class AllPetsWrapper {
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

}
