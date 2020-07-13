package com.stayready.assessment.week2.part03;

public class PetOwner {
    private String name;
    private Pet[] pets;

    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets)
    {
        this.name = name;
        this.pets = pets;
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet)
    {
        
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {

    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        return null;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge()
    {
        /*Integer youngest = pets.ages[0];
        for (int i = 0; i < pets.length; i++)
        {
            if(youngest >= pets[i])
            {
                youngest = pet[i];
            }
        }
        return youngest;*/
        return null;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge()
    {
        /*Integer oldest = pets.ages[0];
        for (int i = 0; i < pets.length; i++)
        {
            if(oldest >= pets[i])
            {
                oldest = pet[i];
            }
        }
        return oldest;*/
        return null;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge()
    {  
        float sum = 0;
        for( int i = 0; i < pets.length; i++)
        {
            //sum = sum + pets[age]; 
        }
        return null;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets(){
        return null;
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
    public Pet[] getPets() {
        return this.pets;
    }
}
