package com.stayready.assessment.week2.part03;

import org.junit.Assert;
import org.junit.Test;

public class PetTest {
    @Test
    public void testInheritance() {
        Pet p = new Dog();
        Assert.assertTrue(p instanceof Pet);
    }

    @Test
    public void testImplementation() {
        Pet p = new Dog();
        Assert.assertTrue(p instanceof Animal);
    }

    @Test
    public void setOwnerTest() {
        // Given
        Pet p = new Dog();
        PetOwner expected = new PetOwner(null, null);

        // When
        p.setOwner(expected);
        PetOwner actual = p.getOwner();

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void getOwnerTest() {
        // Given
        Pet p = new Dog();
        PetOwner expected = new PetOwner(null, p);

        // When
        p.setOwner(expected);
        PetOwner actual = p.getOwner();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
