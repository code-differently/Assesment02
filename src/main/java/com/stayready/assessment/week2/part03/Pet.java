package com.stayready.assessment.week2.part03;

public abstract class Pet implements Animal {

        String petName;
        Integer petAge;
        PetOwner owner; 
    /**
     * nullary constructor
     * by default, pet has age of 0; name of "";
     */
    public Pet() {
        this.petAge = 0;
        this.petName = "";
    }

    /**
     * @param name name of this pet
     */
    public Pet(String name) {
        this.petName = name; 
    }


    /**
     * @param age age of this pet
     */
    public Pet(int age) {
        this.petAge = age; 
    }

    /**
     * @param name name of this pet
     * @param age age of this pet
     */
    public Pet(String name, int age) {
        this.petName = name; 
        this.petAge = age; 
    }

    /**
     * @return name of this pet
     */
    public String getName() {
        return petName;
    }

    /**
     * @return age of this pet
     */
    public Integer getAge() {
        return petAge;
    }

    /**
     * @param newPetOwner the new owner of this pet
     * ensure this instance of `Pet` is added to the owner's composite `pets` list
     */
    public void setOwner(PetOwner newPetOwner) {
        this.owner = newPetOwner;
    }

    /**
     * @return PetOwner object whose composite `pets` collection contains this Pet instance
     */
    public PetOwner getOwner() {
        return owner;
    }
}
