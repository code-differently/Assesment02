package com.stayready.assessment.week2.part03;

import java.util.ArrayList;

public class PetOwner {
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    private String name;
    private Pet [] pets;

    public PetOwner(String name, Pet... pets) {
        this.name = name;
        this.pets = pets;

    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        ArrayList<Pet> temp = new ArrayList<>();
        if(pets != null) {
            for (int index = 0; index < pets.length; index++) {
                pets[index].setOwner(this);
                temp.add(pets[index]);
            }
            temp.add(pet);
            pets = temp.toArray(new Pet[0]);
        }
        else{
            temp.add(pet);
            temp.get(0).setOwner(this);
            pets = temp.toArray(new Pet[0]);
        }
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {

        ArrayList<Pet> temp = new ArrayList<>();
        if(!(getNumberOfPets() < 2)) {
            for (int index = 0; index < pets.length; index++) {
                if (pet != pets[index]) {
                    temp.add(pets[index]);
                }
            }
            pets = temp.toArray(new Pet[0]);
        }
        else{
            pets = temp.toArray(new Pet[1]);
        }
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        return pet.getOwner() == this;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        int min = 999;
        for(Pet p : pets){
            if(p.getAge() < min){
                min = p.getAge();
            }
        }
        return min;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        int max = 0;
        for(Pet p : pets){
            if(p.getAge() > max){
                max = p.getAge();
            }
        }
        return max;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        float avg = 0;
        for(Pet p : pets){
            avg += p.getAge();
        }
        return avg/getNumberOfPets();
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
