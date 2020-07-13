package com.stayready.assessment.week2.part03;

import java.util.ArrayList;
import java.util.Arrays;

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
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        Pet[] result = new Pet[pets.length + 1];
        for (int idx = 0; idx < pets.length; idx++){
            result[idx] = pets[idx];
        }
        result[pets.length] = pet;
        pets = result;
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        Pet[] result = new Pet[pets.length - 1];
        for (int idx = 0; idx < pets.length; idx++){
            if (!pets[idx].equals(pet)){
                result[idx] = pets[idx];
            }
        }
        pets = result;
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        return pet.getOwner().equals(this);
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungestPetAge() {
        Integer youngest = pets[0].age;
        for (int idx = 0; idx < pets.length; idx++){
            if (pets[idx].age < youngest){
                youngest = pets[idx].age;
            }
        }
        return youngest;
    }


    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        return null;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        Integer totalAge = 0;
        for (Pet p : pets) {
            totalAge += p.age;
        }
        return (float) (totalAge / pets.length);
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
