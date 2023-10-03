package com.Fredrik.model;

public interface Animal {

//    metoder med obestämda funktioner
    void metodMedObestämdFunktion
    void eat();

//    metoder med bestämd funktion
    default void makeSound(){
        System.out.println("Make animal noise");
    }

}
