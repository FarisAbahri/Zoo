package com.ing.zoo.models;

import com.ing.zoo.interfaces.Carnivore;
import com.ing.zoo.interfaces.Performer;

import java.util.Random;

/**
 * Class for dolphins
 *
 * @author Faris Abahri
 */
public class Dolphin extends Animal implements Carnivore, Performer {


    /**
     * Constructor assigns name to animal
     *
     * @param name
     */
    public Dolphin(String name) {
        super(name);
    }

    /**
     * Lets the dolphin say hello
     */
    @Override
    public void sayHello() {
        setHelloText("splashhhh dolph");
        System.out.println(getHelloText());
    }

    /**
     * Lets the dolphin eat meat
     */
    @Override
    public void eatMeat() {
        setEatText("eeeeeeeee tehehehehe eep");
        System.out.println(getEatText());
    }

    /**
     * Lets the dolphin perform a trick
     */
    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            setPerformText("dives up and backflips");
        }
        else
        {
            setPerformText("jumps through hoop");
        }
        System.out.println(getPerformText());
    }
}
