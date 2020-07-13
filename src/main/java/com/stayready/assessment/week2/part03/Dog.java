package com.stayready.assessment.week2.part03;

public class Dog extends Pet {
    /**
     * @param name name of this Dog
     * @param age age of this dog
     */
    private String name;
    private int age;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    public Dog(String name, Integer age) {
        this.age = age;
        this.name = name;
    }

    /**
     * @param age age of this dog
     */
    public Dog(Integer age) {
        this.age = age;
        this.name = "DogName";
    }

    /**
     * @param name name of this dog
     */
    public Dog(String name) {
        this.age = 0;
        this.name = name;
    }

    /**
     * nullary constructor
     * by default, a dog's
     * name is DogName
     * age is 0
     */
    public Dog() {
        this.age = 0;
        this.name = "Dog name";
    }

    /**
     * @return bark as a string
     */
    public String speak() {
        return "Bark";
    }
}
