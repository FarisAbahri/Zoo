package com.ing.zoo.models;

import com.ing.zoo.interfaces.Carnivore;
import com.ing.zoo.interfaces.Herbivore;
import com.ing.zoo.interfaces.Performer;

import java.util.Random;

/**
 * Class for pigs
 *
 * @author Faris Abahri
 */
public class Pig extends Animal implements Herbivore, Carnivore, Performer {

    public String trick;

    /**
     * Constructor assigns name to animal
     *
     * @param name
     */
    public Pig(String name) {
        super(name);
    }

    /**
     * Lets the pig say hello
     */
    @Override
    public void sayHello()
    {
        setHelloText("splash");
        System.out.println(getHelloText());
    }

    /**
     * Lets the pig eat leaves
     */
    @Override
    public void eatLeaves()
    {
        setEatText("munch munch oink");
        System.out.println(getEatText());
    }


    /**
     * Lets the pig eat meat
     */
    @Override
    public void eatMeat()
    {
        setEatText("nomnomnom oink thx");
        System.out.println(getEatText());
    }

    /**
     * Lets the pig perform a trick
     */
    @Override
    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            setPerformText("rolls in the mud");
        }
        else
        {
            setPerformText("runs in circles");
        }
        System.out.println(getPerformText());
    }
}
