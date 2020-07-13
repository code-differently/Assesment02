package com.stayready.assessment.week2.part03;

public class PetOwner {
    private String name;
    private Pet[] pets;
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.name = name;
        this.pets = pets;
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        if(this.pets != null){
            Pet[] newPets = new Pet[this.pets.length + 1];
            for(int i = 0; i < this.pets.length; i++){
                newPets[i] = this.pets[i];
         }
         newPets[this.pets.length] = pet;
         this.pets = newPets; 
        }else{
            Pet[] newPets = new Pet[1];
            newPets[0] = pet;
            this.pets = newPets; 
     }
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        for(int i = 0; i < pets.length; i++){
            if(pets[i] == pet){
                pets[i] = null;
            }
        }

    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        boolean isPetHere = false;
        for(int i = 0; i < pets.length; i++){
            if(pets[i] == pet){
                isPetHere = true;
            }
        }
        return isPetHere;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        Integer youngest = this.pets[0].getAge();
        for(int i = 1; i < pets.length; i++){
            if(pets[i].getAge() < youngest){
                youngest = pets[i].getAge();
            }
        }
        return youngest;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Integer largest = this.pets[0].getAge();
        for(int i = 1; i < pets.length; i++){
            if(pets[i].getAge() > largest){
                largest = pets[i].getAge();
            }
        }
        return largest;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        float numOfPets = 0.0f;
        float sum = 0.0f;
        for(int i = 0; i < pets.length; i++){
            sum += (float) pets[i].getAge();
            numOfPets++;
        }
        return sum / numOfPets;
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
