package com.stayready.assessment.week2.part03;


public class PetOwner {
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */

     private String name;
     private Pet[] pets;

    public PetOwner(String name, Pet... pets) {
        this.name=name;
        if(pets!=null){
            Pet[] temp=new Pet[pets.length];
            for (int i = 0; i < pets.length; i++) {
                temp[i]=pets[i];
            }
            this.pets=temp;
        }
        else
            this.pets=new Pet[0];
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        Pet[] added= new Pet[this.pets.length+1];
        for (int i = 0; i < this.pets.length; i++) {
            added[i]=this.pets[i];
        }
        added[added.length-1]=pet;
        this.pets=added;

    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        if(this.pets.length!=0){
            if(this.pets.length==1){
                Pet[] empty={null};
                this.pets=empty;
            }
            else{
                Pet[] removed= new Pet[this.pets.length-1];
                for (int i = 0; i < this.pets.length; i++) {
                    if(this.pets[i]!=pet)
                        removed[i]=this.pets[i];
                }
                this.pets=removed;
            }
        }
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        boolean isOwner=false;
        for (int i = 0; i < this.pets.length; i++) {
            if(this.pets[i]==pet)
                isOwner=true;
        }
        return isOwner;

    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        Integer youngest=Integer.MAX_VALUE;
        for (int i = 0; i < this.pets.length; i++) {
            if(this.pets[i].getAge()<youngest)
                youngest=this.pets[i].getAge();
        }
        return youngest;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Integer oldest=Integer.MIN_VALUE;
        for (int i = 0; i < this.pets.length; i++) {
            if(this.pets[i].getAge()>oldest)
                oldest=this.pets[i].getAge();
        }
        return oldest;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        Float avg= 0.0f;
        for (int i = 0; i < this.pets.length; i++) {
            avg+=this.pets[i].getAge();
        }
        return avg/this.pets.length;
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
