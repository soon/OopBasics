package com.soon.company;

import com.soon.ducks.*;

public class Main {

    public static DuckBehaviour[] CreateDucks() {
        return new DuckBehaviour[]{
                new MallardDuck(),
                new MuscovyDuck(),
                new DuckDecoy(),
                new DuckToy()
        };
    }

    public static void main(String[] args) {
        DuckBehaviour[] ducks = CreateDucks();

        for (DuckBehaviour d : ducks) {
            System.out.println(d.getClass().getName());
            d.swim();
            d.quack();
            System.out.println("---------------------------");
        }
    }
}
