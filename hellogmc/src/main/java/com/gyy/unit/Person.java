package com.gyy.unit;

import lombok.Data;

@Data
public class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public static boolean isPerson(Person person){
        if("人".equals(person.getName())){
            return true;
        }
        return false;
    }
}
