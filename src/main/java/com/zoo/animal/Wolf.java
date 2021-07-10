package com.zoo.animal;

public class
Wolf {
    private String name;
    private int age;
    private char gender;
    private float weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Wolf(String name, int age, char gender, float weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;

    }
    public void eat() {
        System.out.println("I'm eating");
    }

    public void say() {
        System.out.println("AUF-AUF");
    }

    public void getClassName() {
        String className = this.getClass().getSimpleName();
        System.out.println("Name of Class:" + className);
    }
    public String togetClass() {return  getClass().getSimpleName();
    }



}
