package com.ing.zoo.models;

import com.ing.zoo.interfaces.Herbivore;

import java.util.Random;

/**
 * Class for zebra's
 *
 * @author Faris Abahri
 */
public class Zebra extends Animal implements Herbivore {

    public String trick;

    /**
     * Constructor assigns name to animal
     *
     * @param name
     */
    public Zebra(String name) {
        super(name);
    }

    /**
     * Lets the zebra say hello
     */
    @Override
    public void sayHello()
    {
        setHelloText("zebra zebra");
        System.out.println(getHelloText());
    }

    /**
     * Lets the zebra eat leaves
     */
    @Override
    public void eatLeaves()
    {
        setEatText("munch munch zank yee bra");
        System.out.println(getEatText());
    }
}
