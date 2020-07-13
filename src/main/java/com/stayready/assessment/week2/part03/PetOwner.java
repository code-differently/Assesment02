package com.stayready.assessment.week2.part03;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class PetOwner {
    String name;
    Pet[] pets;
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.name = name;
        this.pets = pets;
        if(pets != null) {
            assignPetOwner();
        }
    }

    private void assignPetOwner() {
        for(Pet pet: pets) {
            pet.setOwner(this);
        }
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        if(pets == null) {
            pets = new Pet[1];
        }
        else {
            pets = Arrays.copyOf(pets, pets.length + 1);
        }
        pets[pets.length - 1] = pet;
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        int index = 0;
        for(Pet individualPet: pets) {
            if(individualPet == pet) {
                break;
            }
            index++;
        }
        if(index != 0) {
            //swap
            Pet temp = pets[pets.length - 1];
            pets[pets.length - 1] = pets[index];
            pets[index] = temp;
            pets = Arrays.copyOf(pets, pets.length - 1);
        }
        else {
            pets[0] = null;
        }
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        for(Pet myPets: this.pets) {
            if(myPets.equals(pet)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        Integer youngestAge = this.pets[0].getAge();
        for(Pet pet: this.pets) {
            Integer petAge = pet.getAge();
            if(petAge < youngestAge) {
                youngestAge = petAge;
            }
        }
        return youngestAge;
    }

    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Integer oldestPetAge = this.pets[0].getAge();
        for(Pet pet: this.pets) {
            Integer petAge = pet.getAge();
            if(petAge > oldestPetAge) {
                oldestPetAge = petAge;
            }
        }
        return oldestPetAge;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        Float numberOfPets = Float.valueOf(pets.length);
        Float sumOfAges = 0.0f;
        for(Pet pet: this.pets) {
            Float petAge = Float.valueOf(pet.getAge());
            sumOfAges += petAge;
        }
        return sumOfAges / numberOfPets;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return pets.length;
    }

    /**
     * @return the name property of the Owner
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return pets;
    }
}
