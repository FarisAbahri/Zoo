package com.ing.zoo.models;

/**
 * Abstract class for all animals
 *
 * @author Faris Abahri
 */
public abstract class Animal {

    private String name;
    private String helloText;
    private String eatText;
    private String performText;

    /**
     * Constructor assigns name to animal
     *
     * @param name
     */
    public Animal(String name) {
        this.name = name;
    }

    /**
     * Abstract method for saying hello
     */
    public abstract void sayHello();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHelloText() {
        return helloText;
    }

    public void setHelloText(String helloText) {
        this.helloText = helloText;
    }

    public String getEatText() {
        return eatText;
    }

    public void setEatText(String eatText) {
        this.eatText = eatText;
    }

    public String getPerformText() {
        return performText;
    }

    public void setPerformText(String performText) {
        this.performText = performText;
    }
}
