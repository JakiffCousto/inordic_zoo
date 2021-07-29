package com.zoo.animal;

public abstract class Animal implements Actionable, Info{

    public void walk(){
    }

    @Override
    public void showInfo() {
        System.out.println("Show Name: "+getClass().getName());
    }
}
