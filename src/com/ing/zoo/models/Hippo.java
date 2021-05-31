package com.ing.zoo.models;

import com.ing.zoo.interfaces.Herbivore;

/**
 * Class for Hippo's
 *
 * @author Faris Abahri
 */
public class Hippo extends Animal implements Herbivore {

    /**
     * Constructor assigns name to animal
     *
     * @param name
     */
    public Hippo(String name) {
        super(name);
    }

    /**
     * Lets the Hippo say hello
     */
    @Override
    public void sayHello()
    {
        setHelloText("splash");;
        System.out.println(getHelloText());
    }

    /**
     * Lets the Hippo eat leaves
     */
    @Override
    public void eatLeaves()
    {
        setEatText("munch munch lovely");;
        System.out.println(getEatText());
    }
}
