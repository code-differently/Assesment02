package com.stayready.assessment.week2.part03;

public class Cat extends Pet {
    /**
     * @param name name of this Cat
     * @param age age of this Cat
     */
    public Cat(String name, Integer age) {
       // this.name = name;
        //this.age = age;

        super(name, age);
    }

    /**
     * @param age age of this Cat
     */
    public Cat(Integer age) {
        age = 0;
    }

    /**
     * @param name name of this Cat
     */
    public Cat(String name) {
        name = "Garfield";
    }

    /**
     * nullary constructor
     * by default, a Cat's
     * name is CatName
     * age is 0
     */
    public Cat() {
        name = "CatName";
        age = 0;
    }

    /**
     * @return meow as a string
     */
    public String speak() {
        return "meow!";
    }
}
