package com.stayready.assessment.week2.part03;

public class Cat extends Pet {
    /**
     * @param name name of this Cat
     * @param age age of this Cat
     */
    private String name;
    private int age;
    public Cat(String name, Integer age) {
        this.age = age;
        this.name = name;
    }

    /**
     * @param age age of this Cat
     */
    public Cat(Integer age) {
        this.age = age;
        this.name = "CatName";
    }

    /**
     * @param name name of this Cat
     */
    public Cat(String name) {
        this.age = 0;
        this.name = name;
    }

    /**
     * nullary constructor
     * by default, a Cat's
     * name is CatName
     * age is 0
     */
    public Cat() {
        this.age = 0;
        this.name = "Cat name";
    }

    /**
     * @return meow as a string
     */
    public String speak() {
        return "Meow";
    }
}
