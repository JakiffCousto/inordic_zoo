package com.zoo.animal;

public class Dingo extends Wolf{
    public Dingo( String name, int age, char gender, float weight) {

        super (name, age, gender, weight);
    }
    public void say() {
        System.out.println("Din-Din");
    }
}
