package com.stayready.assessment.week2.part03;

import java.util.ArrayList;
import java.util.Arrays;

public class PetOwner {
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    private Pet[] pets;
    private String name;
    public PetOwner(String name, Pet... pets)
    {
        this.name = name;
        this.pets = pets;
        if (pets != null) {
            for (Pet aPet : pets) {
                aPet.setOwner(this);
            }
        }
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet)
    {
        ArrayList<Pet> tempPets = new ArrayList<Pet>();
        if(pets != null)
        {
            tempPets = new ArrayList<Pet>(Arrays.asList(pets));
        }
        tempPets.add(pet);
        pets = tempPets.toArray(new Pet[0]);
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet)
    {
        if(pets == null || pets.length == 0)
        {
        }
        else
        {
            for(int i = 0; i < pets.length; i++)
            {
                if(pets[i].equals(pet))
                {
                    pets[i] = null;
                }
            }
        }

    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        for(Pet p : pets)
        {
            if(p == pet)
            {
                return true;
            }
        }
        return false;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge()
    {
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < pets.length; i++)
        {
            if(pets[i].getAge() < min)
            {
                min = pets[i].getAge();
            }
        }

        return min;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < pets.length; i++)
        {
            if(pets[i].getAge() > max)
            {
                max = pets[i].getAge();
            }
        }

        return max;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge()
    {
        float sum = 0;

        for(int i = 0; i < pets.length; i++)
        {
            sum += pets[i].getAge();
        }

        return (Float) sum / pets.length;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets()
    {
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
