package com.soon.ducks;


public abstract class Duck implements DuckBehaviour {
    @Override
    public void swim() {
        System.out.println("I'm swimming!");
    }

    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}
