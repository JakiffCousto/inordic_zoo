package com.zoo.animal;

import org.w3c.dom.ls.LSOutput;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class zoo {
    public static void main(String[] args) {

        Wolf wolf1 = new Wolf("Akela", 10, 'm', 120);
        wolf1.getClassName(); //we get name of class
        System.out.println("MY FUNC:"+wolf1.togetClass());
        toName(wolf1.getName());
        wolf1.eat();
        wolf1.say();
        System.out.println("===========================");


        Shepherd shepherd1 = new Shepherd("Bobik", 3, 'm', 50);
        shepherd1.getClassName(); // we get name of class
        toName(shepherd1.getName());
        shepherd1.say();
        shepherd1.toPlay(wolf1);
        System.out.println("===========================");


        Coyote coyote1 = new Coyote("Zina", 5, 'f', 30);
        coyote1.getClassName();
        toName(coyote1.getName());
        coyote1.say();
        System.out.println("===========================");


        Dingo dingo1=new Dingo( "Rahim",3, 'm',20 );
        dingo1.getClassName();
        dingo1.say();


        toRun(wolf1.togetClass(), wolf1.getName(), shepherd1.togetClass(), shepherd1.getName()); //BIG RACE

    }

    public static void toName(String name) {
        System.out.println(name);


    }

    public static void toRun (String nameclass1, String name1, String name2, String nameclass2) {
        Scanner scan = new Scanner(System.in);
        System.out.println("In order to laucnh the BIG RACE to input the name of first animal:");
        String animal1 = scan.next();
        System.out.println("Ok, now to input the name of second animal:");
        String animal2 = scan.next();
        int koefSpeed1 = 0;
        int koefSpeed2 = 0;
        float timeToWait=0;

        if (animal1.equals(name1)) koefSpeed1 = 2;
        else if (animal1.equals(name2)) koefSpeed1 = 1;

        if (animal2.equals(name2)) koefSpeed2 = 1;
        else if (animal2.equals(name1)) koefSpeed2 = 2;

        if (koefSpeed1>koefSpeed2) {
            timeToWait=10/koefSpeed1;
            System.out.println("The Big Race begin:");
            try {
                for (int i=0; i<timeToWait*2;i++) {
                    Thread.sleep(500);
                    System.out.print("...");
                }
                System.out.println("The time of " + animal1 + " is: " + 10 / koefSpeed1 + " sec.");
                for (int i=0; i<timeToWait*2;i++) {
                    Thread.sleep(500);
                    System.out.print("...");
                }
                System.out.println("The time of " + animal2 + " is: " + 10 + " sec.");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        if (koefSpeed1<koefSpeed2) {
            timeToWait=10/koefSpeed2;
            System.out.println("The Big Race begin:");
            try {
                for (int i=0; i<timeToWait*2;i++) {
                    Thread.sleep(500);
                    System.out.print("...");
                }
                System.out.println("The time of " + animal2 + " is: " + 10 / koefSpeed2 + " sec.");
                for (int i=0; i<timeToWait*2;i++) {
                    Thread.sleep(500);
                    System.out.print("...");
                }
                System.out.println("The time of " + animal1 + " is: " + 10 + " sec.");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}


