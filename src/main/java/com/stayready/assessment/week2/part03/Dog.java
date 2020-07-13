package com.stayready.assessment.week2.part03;

public class Dog extends Pet {

    String dogName;  
    Integer dogAge;
    /**
     * @param name name of this Dog
     * @param age age of this dog
     */
    public Dog(String name, Integer age) {
            this.dogName = name; 
            this.dogAge = age;
    }

    /**
     * @param age age of this dog
     */
    public Dog(Integer age) {
        this.dogName = "Dog name";
        this.dogAge = age;
    }

    /**
     * @param name name of this dog
     */
    public Dog(String name) {
            this.dogName = name;
            this.dogAge = 0;
    }

    /**
     * nullary constructor
     * by default, a dog's
     * name is DogName
     * age is 0
     */
    public Dog() {
        this.dogAge = 0;
        this.dogName = "Dog name";
    }

        public Integer getAge()
        {
            return dogAge;
        }
        public String getName()
        {
            return dogName;
        }

    /**
     * @return bark as a string
     */
    public String speak() {
        return "Bark";
    }
}
