package com.stayready.assessment.week2.part03;

import java.util.ArrayList;

public class PetOwner {


    private String name;
    ArrayList<Pet> petList;
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        setName(name);
        petList = new ArrayList<>();

        if(pets != null ){
            for(int i = 0; i < pets.length; i++){
                addPet(pets[i]);
            }
        }



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

        if(petList != null) {
            petList.remove(pet);
        }
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
    public Integer getYoungetPetAge() {

        int youngest = petList.get(0).getAge();
        for(int i = 0; i < petList.size(); i++) {
            if (youngest > petList.get(i).getAge() ) {
                youngest = petList.get(i).getAge();
            }

        }
        return youngest;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {

        int oldest = petList.get(0).getAge();
        for(int i = 0; i < petList.size(); i++) {
            if (oldest < petList.get(i).getAge() ) {
                oldest = petList.get(i).getAge();
            }

        }
        return oldest;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {

        Float avg = 0f;
        for(int i = 0; i < petList.size(); i++) {

                avg += petList.get(i).getAge();


        }
        return avg /= petList.size();
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


        if (petList.size() == 0) {
            return petList.toArray(new Pet[0]);
        } else {
            addPet(null);
            return petList.toArray(new Pet[0]);
        }

    }

    public void setName(String name){

        this.name = name;
    }
}