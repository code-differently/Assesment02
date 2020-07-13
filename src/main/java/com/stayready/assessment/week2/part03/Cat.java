package com.stayready.assessment.week2.part03;

public class Cat extends Pet 
{
   public String name = "Cat name";
   public Integer age = 0;
    /**
     * @param name name of this Cat
     * @param age age of this Cat
     */
    public Cat(String name, Integer age) 
    {
        this.name = name;
        this.age = age;
    }

    /**
     * @param age age of this Cat
     */
    public Cat(Integer age) 
    {
        this.age = age;
    }

    /**
     * @param name name of this Cat
     */
    public Cat(String name) 
    {
        this.name = name;
    }

    /**
     * nullary constructor
     * by default, a Cat's
     * name is Cat Name
     * age is 0
     */
    public Cat() 
    {
        this.name = "Cat name";
        this.age = 0;
    }

    /**
     * @return meow as a string
     */
    public String speak() 
    {
        return "Meow";
    }

    public String getName()
    {
        return this.name;
    }

    public Integer getAge()
    {
        return this.age;
    }

    
}
