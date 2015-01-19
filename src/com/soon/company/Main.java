package com.soon.company;

import com.soon.ducks.DuckBehaviour;
import com.soon.ducks.DuckDecoy;
import com.soon.ducks.MallardDuck;
import com.soon.ducks.MuscovyDuck;

public class Main {

    public static DuckBehaviour[] CreateDucks() {
        return new DuckBehaviour[] {
                new MallardDuck(),
                new MuscovyDuck(),
                new DuckDecoy()
        };
    }

    public static void main(String[] args) {
	    DuckBehaviour[] ducks = CreateDucks();

        for(DuckBehaviour d: ducks) {
            d.swim();
            d.quack();
            System.out.println("---------------------------");
        }
    }
}
