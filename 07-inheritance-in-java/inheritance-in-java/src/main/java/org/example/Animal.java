package org.example;

/**
 * Abstract class representing an animal.
 */
public abstract class Animal {
    /**
     * The name of the animal.
     */
    protected String name = "Animal";

    /**
     * Constructor for the Animal class.
     *
     * @param name The name of the animal.
     */
    public Animal(String name) {
        this.name = name;
    }

    /**
     * Method to simulate the animal eating.
     *
     * @return A string representing the animal eating.
     */
    public String eat() {
        return name + " is eating.";
    }

    /**
     * Abstract method to simulate the animal speaking.
     *
     * @return A string representing the animal speaking.
     */
    public abstract String speak();

    /**
     * Method to simulate the animal sleeping.
     *
     * @return A string representing the animal sleeping.
     */
    public String sleep() {
        return name + " is sleeping.";
    }
}
