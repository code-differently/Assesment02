package com.stayready.assessment.week2.part03;

public class Cat extends Pet {
     public String catname;
    public Integer catage; 
    /**
     * 
     * @param name name of this Cat
     * @param age age of this Cat
     */
    public Cat(String name, Integer age) {
        catname = name; 
        catage = age;
    }

    /**
     * @param age age of this Cat
     */
    public Cat(Integer age) {
        catname = "Cat name";
        catage = age; 
    }

    /**
     * @param name name of this Cat
     */
    public Cat(String name) {
        catname = name;
        catage = 0;
    }

    /**
     * nullary constructor
     * by default, a Cat's
     * name is CatName
     * age is 0
     */

    public Cat() {
        catname = "Cat name";
        catage = 0; 
    }

    public Integer getAge()
    {
        return catage;
    }
    public String getName()
    {
        return catname;
    }
    /**
     * @return meow as a string
     */
    public String speak() {
        return "Meow";
    }
}
