package com.stayready.assessment.week2.part03;

public class Dog extends Pet {

    /**
     * @param name name of this Dog
     * @param age age of this dog
     */
    public Dog(String name, Integer age) {
        //this.name = name;
        //this.age = age;

        super(name, age);
    }

    /**
     * @param age age of this dog
     */
    public Dog(Integer age) {
        age = 0;
    }

    /**
     * @param name name of this dog
     */
    public Dog(String name) {
        //name = "Keith";
        super(name);
    }

    /**
     * nullary constructor
     * by default, a dog's
     * name is DogName
     * age is 0
     */
    public Dog() {
        //name = "DogName";
        //age = 0;

        super();
    }

    /**
     * @return bark as a string
     */
    public String speak() {
        return "bark!";
    }
}
