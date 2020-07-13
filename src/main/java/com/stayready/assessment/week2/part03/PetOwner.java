package com.stayready.assessment.week2.part03;

import java.util.ArrayList;

import org.w3c.dom.NameList;

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
        for(Pet p : pets){
            p.setOwner(this);
        }
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        ArrayList<Pet> newArray = new ArrayList<Pet>();
        Pet[] n = {pet};
        /*
        for(Pet p: pets){
            newArray.add(p);
        }
        */
        newArray.add(pet);
        pets = newArray.toArray(n);
        
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        ArrayList<Pet> newArray = new ArrayList<Pet>();
        Pet[] n = {pet};
        for(Pet p: pets){
            newArray.add(p);
        }
        newArray.remove(pet);
        pets = newArray.toArray(n);
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
        int youngestFlexer = pets[0].getAge();
        for(Pet p : pets){
            if(p.getAge() < youngestFlexer){
                youngestFlexer = p.getAge();
            } 
        }
        return youngestFlexer;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        int oldestVetter = pets[0].getAge();
        for(Pet p : pets){
            if(p.getAge() > oldestVetter){
                oldestVetter = p.getAge();
            } 
        }
        return oldestVetter;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        Float avg = 0.0f;
        Float count = 0.0f;
        for(Pet p : pets){
            avg += p.getAge();
            count++;
        }
        return avg/count;
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
