package com.stayready.assessment.week2.part03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PetOwner {
    private String name;
    Pet[] petArray ; 

    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet ...pets) { //... means takes in any amount of arguments;
        this.name = name; 
        this.petArray = pets;
        for(Pet pet : petArray){
            pet.setOwner(this); //making sure each pet is assigned to an owner
        }
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        List<Pet> petList;
        Pet[] temp = {pet};
        
        if(petArray == null){
            petList = new ArrayList<Pet>();
        } else {
            petList = new ArrayList<Pet>(Arrays.asList(pet));
        }

        petList.add(pet); 
        petArray = petList.toArray(new Pet[0]);

    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        List<Pet> petList = new ArrayList<Pet>(); 
        Pet[] temp = {pet}; 
        for(Pet thisPet : petArray){
            petList.add(thisPet);
        }
        petList.remove(pet);
        petArray = petList.toArray(temp);
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {

        for(Pet thisPet : petArray){
            if(thisPet == pet){ // every pet is unique so we check if objects equal each other
                return true;
            }
        }

        return false; //otherwise if the pets don't equal each other we know they don't have the same owner
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        int min = Integer.MAX_VALUE; //stores min age
        for(Pet thisPet : petArray){
            if(thisPet.getAge() < min){
                min = thisPet.getAge();
            }
        }

        return min;
    }

    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        int max = Integer.MIN_VALUE; //stores max age
        for(Pet thisPet : petArray){
            if(thisPet.getAge() > max){
                max = thisPet.getAge();
            }
        }

        return max;

        
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        Float sumOfPetAges = 0.0f;
        Float numOfPets = (float) petArray.length;

        for(Pet thisPet : petArray){
            sumOfPetAges += (float) thisPet.getAge();
        }
        return sumOfPetAges/numOfPets; 
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return petArray.length;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return petArray;
    }
}
