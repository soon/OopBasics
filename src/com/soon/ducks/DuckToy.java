package com.soon.ducks;


public class DuckToy implements DuckBehaviour {
    @Override
    public void swim() {
        System.out.println("I can swim!");
    }

    @Override
    public void quack() {
        System.out.println("Squeak!");
    }
}
