package com.stayready.assessment.week2.part03;

public class Dog extends Pet {
    /**
     * @param name name of this Dog
     * @param age age of this dog
     */
    public Dog(String name, Integer age)
    {
        super(name, age);
    }

    /**
     * @param age age of this dog
     */
    public Dog(Integer age)
    {
        this.age = age;
    }

    /**
     * @param name name of this dog
     */
    public Dog(String name)
    {
        this.name = name;
        
    }

    /**
     * nullary constructor
     * by default, a dog's
     * name is DogName
     * age is 0
     */
    public Dog()
    {
        name = "Dog name";
        age = 0;
    }

    /**
     * @return bark as a string
     */
    public String speak()
    {
        return "Bark";
    }
}
