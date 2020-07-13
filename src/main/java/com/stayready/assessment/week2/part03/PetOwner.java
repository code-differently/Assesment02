package com.stayready.assessment.week2.part03;

import java.util.ArrayList;
import java.util.Collections;

public class PetOwner {
    String name;
    ArrayList<Pet> pets;
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.name = name;
        Collections.addAll(this.pets, pets);
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        pets.add(pet);
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        pets.remove(pet);
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        return this.pets.contains(pet);
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        Integer youngestAge = this.pets.get(0).getAge();
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
        Integer oldestPetAge = this.pets.get(0).getAge();
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
        Float numberOfPets = 0.0f;
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
        return this.pets.size();
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
        Pet [] ans = new Pet [this.pets.size()];
        int index = 0;
        for(Pet pet: this.pets) {
            ans[index] = pet;
        }
        return ans;
    }
}
