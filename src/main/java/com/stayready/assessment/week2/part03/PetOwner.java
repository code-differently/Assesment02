package com.stayready.assessment.week2.part03;

import java.util.Collections;
import java.util.List;

public class PetOwner {
    protected List<Pet> petList;
    String name;
    //Pet pets;
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.name=name;
        Collections.addAll(petList, pets);
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        petList.add(pet);
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
    petList.remove(pet);
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        return petList.contains(pet);
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungestPetAge() {
        int min= Integer.MAX_VALUE;
        for (Pet p:petList) {
            if(p.getAge()<min){
                min=p.getAge();
            }
        }
        return min;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        int max= Integer.MIN_VALUE;
        for (Pet p:petList) {
            if(p.getAge()>max){
                max=p.getAge();
            }
        }
        return max;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        float sum=0;
        for (Pet p:petList) {
            sum+=p.getAge();
        }
        return sum/petList.size();
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return petList.size();
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
        return (Pet[]) petList.toArray();
    }
}
