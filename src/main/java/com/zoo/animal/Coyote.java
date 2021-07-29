package com.zoo.animal;

public class Coyote extends Wolf{

    public Coyote(String name, int age, char gender, float weight) {
        super(name, age, gender, weight);
    }

    public String toString() {

        return "Coyote{" +
                "name='" + getName()+ '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", weight=" + getWeight() +
                '}';
    }
    public void say() {
        System.out.println("CAF-CAF");
    }

}
