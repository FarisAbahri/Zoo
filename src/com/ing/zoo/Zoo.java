package com.ing.zoo;

import com.ing.zoo.interfaces.Carnivore;
import com.ing.zoo.interfaces.Herbivore;
import com.ing.zoo.interfaces.Performer;
import com.ing.zoo.models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args)
    {
        //List of commands for the scanner
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        //Creates list for storing animals
        List<Animal> animalList = new ArrayList<>();

        //All animals are created and stored into the list
        Lion henk = new Lion("henk");
        animalList.add(henk);
        Hippo elsa = new Hippo("elsa");
        animalList.add(elsa);
        Pig dora = new Pig("dora");
        animalList.add(dora);
        Tiger wally = new Tiger("wally");
        animalList.add(wally);
        Zebra marty = new Zebra("marty");
        animalList.add(marty);
        Dolphin azula = new Dolphin("azula");
        animalList.add(azula);
        Cow bart = new Cow("bart");
        animalList.add(bart);

        //Creates scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        //Creates variable for scanner input
        String input = scanner.nextLine();

        //If the command is "hello", all animals will say hello
        if(input.equals(commands[0])) {
            for (Animal animal : animalList) {
                animal.sayHello();
            }
        }
        //If the command is "hello" with a name behind it
        else if (input.substring(0, 5).equals(commands[0]) && input.length() > 5) {
            String name = input.substring(6);
            for (Animal animal : animalList) {
                if (animal.getName().equals(name)) {
                    animal.sayHello();
                }
            }
        }
        //If the command is "give leaves"
        else if (input.equals(commands[1])) {
            for (Animal animal : animalList) {
                if (animal instanceof Herbivore) {
                    ((Herbivore) animal).eatLeaves();
                }
            }
        }
        //If the command is "give meat"
        else if (input.equals(commands[2])) {
            for (Animal animal : animalList) {
                if (animal instanceof Carnivore) {
                    ((Carnivore) animal).eatMeat();
                }
            }
        }
        //If the command is "perform trick"
        else if (input.equals(commands[3])) {
            for (Animal animal : animalList) {
                if (animal instanceof Performer) {
                    ((Performer) animal).performTrick();
                }
            }
        }
        else
        {
            System.out.println("Unknown command: " + input);
        }
    }
}
