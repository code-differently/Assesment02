package com.stayready.assessment.week2.part03;

public abstract class Pet implements Animal
{
    private String name;
    private Integer age;
    private PetOwner owner;
    /**
     * nullary constructor
     * by default, pet has age of 0; name of "";
     */
    public Pet()
    {
        this.age = 0;
        this.name = "";
    }

    /**
     * @param name name of this pet
     */
    public Pet(String name)
    {
        this.name = name;
    }


    /**
     * @param age age of this pet
     */
    public Pet(int age)
    {
        this.age = age;
    }

    /**
     * @param name name of this pet
     * @param age age of this pet
     */
    public Pet(String name, int age)
    {
        this.age = age;
        this.name = name;
    }

    /**
     * @return name of this pet
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return age of this pet
     */
    public Integer getAge() {
        return this.age;
    }

    /**
     * @param newPetOwner the new owner of this pet
     * ensure this instance of `Pet` is added to the owner's composite `pets` list
     */
    public void setOwner(PetOwner newPetOwner)
    {
//        owner = new PetOwner(this.getName(), newPetOwner.getPets());
//        owner = newPetOwner;
//        newPetOwner = new PetOwner(this.getName(), null);
//        newPetOwner = owner;
        owner = newPetOwner;
    }

    /**
     * @return PetOwner object whose composite `pets` collection contains this Pet instance
     */
    public PetOwner getOwner() {
        return owner;
    }
}
