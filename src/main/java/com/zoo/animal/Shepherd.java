package com.zoo.animal;
public class Shepherd extends Wolf{
    private String play;
    public Shepherd(String name, int age, char gender, float weight) {
        super(name, age, gender, weight);
    }

    @Override
    public String toString() {

        return "Shepherd{" +
                "name='" + getName()+ '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", weight=" + getWeight() +
                '}';
    }

    public void say() {
        System.out.println("GAV-GAV");
    }
    public void toPlay(Wolf wolf) {
        System.out.println(getName() +" play with "+wolf.getName());
    }




}
