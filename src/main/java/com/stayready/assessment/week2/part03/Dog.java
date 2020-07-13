package com.stayready.assessment.week2.part03;

public class Dog extends Pet {
    /**
     * @param name name of this Dog
     * @param age age of this dog
     */
    public Dog(String name, Integer age) {

        setName(name);
        setAge(age);

    }

    /**
     * @param age age of this dog
     */
    public Dog(Integer age) {

        setAge(age);
    }

    /**
     * @param name name of this dog
     */
    public Dog(String name) {

        setName(name);
    }

    /**
     * nullary constructor
     * by default, a dog's
     * name is DogName
     * age is 0
     */
    public Dog() {

        setName("Dog name");
        setAge(0);
    }

    /**
     * @return bark as a string
     */
    public String speak() {
        return "Bark";
    }
}
