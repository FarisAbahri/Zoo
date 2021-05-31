package com.ing.zoo.models;

import com.ing.zoo.interfaces.Carnivore;
import com.ing.zoo.interfaces.Performer;

import java.util.Random;

/**
 * Class for tigers
 *
 * @author Faris Abahri
 */
public class Tiger extends Animal implements Carnivore, Performer {
    public String trick;

    /**
     * Constructor assigns name to animal
     *
     * @param name
     */
    public Tiger(String name) {
        super(name);
    }

    /**
     * Lets the tiger say hello
     */
    @Override
    public void sayHello()
    {
        setHelloText("rraaarww");
        System.out.println(getHelloText());
    }

    /**
     * Lets the tiger eat meat
     */
    @Override
    public void eatMeat()
    {
        setEatText("nomnomnom oink wubalubadubdub");
        System.out.println(getEatText());
    }

    /**
     * Lets the tiger perform a trick
     */
    @Override
    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            setPerformText("jumps in tree");
        }
        else
        {
            setPerformText("scratches ears");
        }
        System.out.println(getPerformText());
    }
}
