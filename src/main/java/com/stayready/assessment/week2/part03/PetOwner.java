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
        ArrayList<Pet> tempPets;
        
        if (pets == null) {
            tempPets = new ArrayList<Pet>();
        } else {
            tempPets = new ArrayList<Pet>(Arrays.asList(pets));
        }
        tempPets.add(pet);
        pets = tempPets.toArray(new Pet[0]);
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        for(int i = 0; i < pets.length; i++){
            if(pets[i].equals(pet)){
                pets[i] = null;
            }
        }
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        for(Pet p: pets){
            if(p == pet){
                return true;
            }
        }
        return false;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        int lowestAge = pets[0].getAge();
        for (Pet aPet : pets) {
            if (aPet.getAge() < lowestAge) {
                lowestAge = aPet.getAge();
            }
        }
        return lowestAge;
    }

    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        int oldestAge = pets[0].getAge();
        for (Pet aPet : pets) {
            if (aPet.getAge() > oldestAge) {
                oldestAge = aPet.getAge();
            }
        }
        return oldestAge;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        int sum = 0;
        for (Pet aPet : pets) {
            sum += aPet.getAge();
        }
        return (float) sum / pets.length;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return this.pets.length;
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
        return this.pets;
    }
}
