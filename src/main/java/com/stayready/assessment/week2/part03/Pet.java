package com.stayready.assessment.week2.part03;

public abstract class Pet implements Animal {
    /**
     * nullary constructor
     * by default, pet has age of 0; name of "";
     */
    private int age;
    private String name;
    private PetOwner owner;
    public Pet() {

        age = 0;
        name = "";
    }

    /**
     * @param name name of this pet
     */
    public Pet(String name) {

        this.name = name;
    }


    /**
     * @param age age of this pet
     */
    public Pet(int age) {

        this.age = age;
    }

    /**
     * @param name name of this pet
     * @param age age of this pet
     */
    public Pet(String name, int age) {

        this.age = age;
        this.name = name;
    }

    /**
     * @return name of this pet
     */
    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    /**
     * @return age of this pet
     */
    public Integer getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
