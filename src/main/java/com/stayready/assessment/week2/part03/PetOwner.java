package com.stayready.assessment.week2.part03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PetOwner {
    private String name;
    private Pet[] pets;

    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.name = name;
        this.pets = pets;
        if(pets == null)
            this.pets = new Pet[0];
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        Pet[] ret = new Pet[pets.length + 1];

        if(pets.length > 0) {
            for (int i = 0; i < pets.length; i++) {
                ret[i] = pets[i];
            }
            ret[pets.length-1] = pet;
        }
        ret[0] = pet;

        pets = ret;
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {

        for(int i = 0; i < pets.length; i++) {
            if(pets[i].equals(pet)) {
                pets[i] = null;
            }
        }
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        for(int i = 0; i < pets.length; i++) {
            if(pets[i].equals(pet))
                return true;
        }
        return false;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        int youngest = Integer.MAX_VALUE;

        for(int i = 0; i < pets.length; i++) {
            if(pets[i].getAge() < youngest) {
                youngest = pets[i].getAge();
            }
        }

        return youngest;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        int oldest = 0;

        for(int i = 0; i < pets.length; i++) {
            if(pets[i].getAge() > oldest) {
                oldest = pets[i].getAge();
            }
        }

        return oldest;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        float ageSum = 0;

        for(int i = 0; i < pets.length; i++) {
            ageSum += pets[i].getAge();
        }

        return ageSum/pets.length;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return pets.length;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return pets;
    }
}
