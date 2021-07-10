package com.zoo.animal;

public class Coyote extends Wolf{

    public Coyote(String name, int age, char gender, float weight) {
        super(name, age, gender, weight);
    }
    public void say() {
        System.out.println("CAF-CAF");
    }

}
