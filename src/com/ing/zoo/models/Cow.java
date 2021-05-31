package com.ing.zoo.models;

import com.ing.zoo.interfaces.Herbivore;


/**
 * Class for cows
 *
 * @author Faris Abahri
 */
public class Cow extends Animal implements Herbivore {


    /**
     * Constructor assigns name to animal
     *
     * @param name
     */
    public Cow(String name) {
        super(name);
    }

    /**
     * Lets the cow say hello
     */
    @Override
    public void sayHello() {
        setHelloText("moooOOoooOoo");
        System.out.println(getHelloText());
    }

    /**
     * Lets the cow eat leaves
     */
    @Override
    public void eatLeaves() {
        setEatText("munch munch mooOOo");
        System.out.println(getEatText());
    }
}
