package com.stayready.assessment.week2.part03;

public class Dog extends Pet {
    private String dogName;
    private int dogAge;
    /**
     * @param name name of this Dog
     * @param age age of this dog
     */
    public Dog(String name, Integer age) {
        dogName = name;
        dogAge = age;

    }

    /**
     * @param age age of this dog
     */
    public Dog(Integer age) {
        dogAge = age;
    }

    /**
     * @param name name of this dog
     */
    public Dog(String name) {
        dogName = name;

    }

    /**
     * nullary constructor
     * by default, a dog's
     * name is DogName
     * age is 0
     */
    public Dog() {
        dogName = "DogName";
        dogAge = 0;
    }

    /**
     * @return bark as a string
     */
    public String speak() {
        return "Bark";
    }
}
