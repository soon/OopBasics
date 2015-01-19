package com.soon.ducks;


public class DuckDecoy implements DuckBehaviour {
    @Override
    public void swim() {
        System.out.println("I was dropped!");
    }

    @Override
    public void quack() {
        System.out.println("Sqwack!");
    }
}