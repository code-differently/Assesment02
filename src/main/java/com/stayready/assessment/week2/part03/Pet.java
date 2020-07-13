package com.stayready.assessment.week2.part03;

public abstract class Pet implements Animal {
    private String petName;
    private int petAge;
    private PetOwner petOwner;
    /**
     * nullary constructor
     * by default, pet has age of 0; name of "";
     */
    public Pet() {
        petAge = 0;
        petName = "";

    }

    /**
     * @param name name of this pet
     */
    public Pet(String name) {
        petName = name;

    }
    /**
     * @param age age of this pet
     */
    public Pet(int age) {
        petAge = age;

    }

    /**
     * @param name name of this pet
     * @param age age of this pet
     */
    public Pet(String name, int age) {
        petName = name;
        petAge = age;

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
        petOwner = newPetOwner;

    }

    /**
     * @return PetOwner object whose composite `pets` collection contains this Pet instance
     */
    public PetOwner getOwner() {
        return petOwner;

    }
}
