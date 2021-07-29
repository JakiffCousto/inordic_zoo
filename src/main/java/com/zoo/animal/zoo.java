package com.zoo.animal;
import org.w3c.dom.ls.LSOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class zoo {


    public static void main(String[] args) throws ExceptionFullAviary {

        Animal[] cell = new Animal[3];

        try {

            cell[0] = new Bird("dd");
            cell[1] = new Bird("ed");
            cell[2] = new Bird("dfdf");
            cell[3] = new Bird("qqqqq");
       }
       catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("Aviary is Full");
       }

            for (int i = 0; i < cell.length; i++) {
                System.out.println(cell[i]);
            }
            Bird bird1=new Bird("Boca");
            Aviary.listAviary = new ArrayList<>(4);
            try {
                Aviary.listAviary.add(new Wolf("Jose", 5, 'm', 70));
                Aviary.listAviary.add(new Dingo("Koki", 3, 'f', 34));
                Aviary.listAviary.add(new Bird("Boca"));
                Aviary.listAviary.add(new Shepherd("Bobik", 1, 'm', 27));
                Aviary.listAviary.add(new Coyote("Ramos", 3, 'f', 45));
                Aviary.listAviary.add(bird1);

                if (Aviary.listAviary.contains(bird1)) throw new ExceptionContainAnimal();


            } catch (ExceptionContainAnimal e) {
                System.out.println("The same animal");
            }
            System.out.println(Aviary.listAviary);
            System.out.println(Aviary.listAviary.size());

    }

}


