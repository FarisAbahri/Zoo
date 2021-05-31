package com.ing.zoo.models;

import com.ing.zoo.interfaces.Carnivore;

/**
 * Class for lions
 *
 * @author Faris Abahri
 */
public class Lion extends Animal implements Carnivore {

    /**
     * Constructor assigns name to animal
     *
     * @param name
     */
    public Lion(String name) {
        super(name);
    }

    /**
     * Lets the lion say hello
     */
    @Override
    public void sayHello()
    {
        setHelloText("roooaoaaaaar");;
        System.out.println(getHelloText());
    }

    /**
     * Lets the lion eat meat
     */
    @Override
    public void eatMeat()
    {
        setEatText("nomnomnom thx mate");;
        System.out.println(getEatText());
    }
}
