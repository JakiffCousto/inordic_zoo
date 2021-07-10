package com.zoo.animal;

public class Shepherd extends Wolf{
    private String play;
    public Shepherd(String name, int age, char gender, float weight) {
        super(name, age, gender, weight);
       // this.play=play;

    }
    public void say() {
        System.out.println("GAV-GAV");
    }
    public void toPlay(Wolf wolf) {
        System.out.println(getName() +" play with "+wolf.getName());
    }




}
