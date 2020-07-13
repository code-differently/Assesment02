package com.stayready.assessment.week2.part03;

public class PetOwner 
{
    String name = "";
    Pet [] pets;
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) 
    {
        this.name = name;
        this.pets = pets;
        setOwnership();
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) 
    {
        
        Pet [] newPetArray = new Pet[pets.length+1];
        for (int i = 0; i < pets.length;i++)
        {
            newPetArray[i] = pets[i];
        }
        newPetArray[newPetArray.length-1] = pet;
        pets = new Pet[newPetArray.length];
        pets = newPetArray;
        setOwnership();
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) 
    {
        Pet [] newPetArray = new Pet[pets.length-1];
        for (int i = 0; i < newPetArray.length;i++)
        {
            newPetArray[i] = pets[i];
        }
        pets = newPetArray;
        setOwnership();
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) 
    {
        for (int i = 0; i < pets.length;i++)
        {
            if (pets[i].equals(pet))
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
        
        Integer youngest = 999;
        for (int i = 0; i < pets.length;i++)
        {
            if (pets[i].getAge() < youngest)
            {
                youngest = pets[i].getAge();
            }
        }
        
        return youngest;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() 
    {
        Integer oldest = 0;
        for (int i = 0; i < pets.length;i++)
        {
            if (pets[i].getAge() > oldest)
            {
                oldest = pets[i].getAge();
            }
        }
        
        return oldest;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() 
    {
        Float sum = 0.0f;
        for (int i = 0; i < pets.length;i++)
        {
             sum += pets[i].getAge();
        }
        
        return sum/pets.length;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() 
    {
        return this.pets.length;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() 
    {
        return this.name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() 
    {
        return this.pets;
    }
    /* Method to set all pets added to owner as being their owner*/
    public void setOwnership()
    {
        for (int i = 0;i < pets.length;i++)
        {
            pets[i].setOwner(this);
        }
    }
}
