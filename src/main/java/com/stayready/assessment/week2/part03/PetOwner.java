package com.stayready.assessment.week2.part03;

import java.util.ArrayList;

public class PetOwner{
    String name;
    Integer age;
    PetOwner owner;
    Pet[] pets;
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    private volatile ArrayList<Pet> petOwner = new ArrayList<>();

    public PetOwner(String name, Pet... pets) {
        this.name = name;
        this.pets = pets;
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        petOwner.add(pet);
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        petOwner.remove(pet);
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        for(Pet p : pets){
            if(p.equals(pet))
            return true;
        }
        return false;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        int youngest = pets[0].getAge();
        for(Pet p : pets){
            if(p.getAge() < youngest)
            youngest = p.getAge();
        }
        return youngest;
    }


    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        int oldest = pets[0].getAge();
        for(Pet p : pets){
            if(p.getAge() > oldest)
            oldest = p.getAge();
        }
        return oldest;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        return this.getAveragePetAge();
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return this.getNumberOfPets();
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
