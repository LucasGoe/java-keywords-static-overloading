package nl.novi.javaprogrammeren.two;

import java.io.PrintStream;

public class MainTwo {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Benji");
        dog.setAmountOfLegs(4);
        PrintStream var10000 = System.out;
        String var10001 = dog.getName();
        var10000.println("Dog " + var10001 + " has " + dog.getAmountOfLegs() + " legs");
    }

}
