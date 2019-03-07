package com.gyy.unit;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    private Person person1;
    private Person person2;

    @Before
    public void before(){
        person1 = new Person("不是人",200);
        person2 = new Person("人",50);
    }

    @Test
    public void isPerson1() {
        assert Person.isPerson(person1) == true;
    }

    @Test
    public void isPerson2(){
        assert Person.isPerson(person2) == true;
    }
}