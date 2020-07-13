package com.stayready.assessment.week2.part03;

import java.util.ArrayList;
import java.util.Arrays;

public class PetOwner {
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    private String name;
    private Pet[] pets;

    public PetOwner(String name, Pet... pets) {
        this.name = name;
        this.pets = pets;
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        ArrayList<Pet> sumPets = new ArrayList<>();
        for (int index = 0; index < this.getPets().length; index++)
        {
            sumPets.add(this.getPets()[index]);
        }
        sumPets.add(pet);
        this.setPets(sumPets.toArray(new Pet[0]));
    }




    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        ArrayList<Pet> sumPets = new ArrayList<>();
        for (int index = 0; index < this.getPets().length; index++)
        {
            if (!(this.getPets()[index].equals(pet)))
            {
                sumPets.add(this.getPets()[index]);
            }
        }
        this.setPets(sumPets.toArray(new Pet[0]));
    }

    public void setPets(Pet[] newArray) {
        this.pets = newArray;
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        return Arrays.asList(this.getPets()).contains(pet.getOwner());
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        int youngest = 0;
        for (int index = 0; index < this.getPets().length; index++)
        {
            if (this.getPets()[index].getAge() < youngest)
                youngest = this.getPets()[index].getAge();
        }
        return youngest;
    }

    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        int oldest = 0;
        for (int index = 0; index < this.getPets().length; index++)
        {
            if (this.getPets()[index].getAge() > oldest)
                oldest = this.getPets()[index].getAge();
        }
        return oldest;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        int ages = 0;

        for (int index = 0; index < this.getPets().length; index++ )
        {
            ages = ages + this.getPets()[index].getAge();
        }

        float avg = ages / this.getPets().length;

        return avg;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return this.pets.length;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return this.pets;
    }
}
