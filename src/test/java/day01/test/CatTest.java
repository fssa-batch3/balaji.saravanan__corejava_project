package day01.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import day01.practice.Cat;

public class CatTest {
	
    private Cat cat;


    @Test
    public void testGetAge() {
        Cat cat = new Cat(5, "Brown");
        int age = cat.hasDots();
        Assertions.assertEquals(5, age);
    }

    @Test
    public void testSetAge() {
        Cat cat = new Cat(3, "Gray");
        cat.setHasDots(4);
        int age = cat.hasDots();
        Assertions.assertEquals(4, age);
    }

}
