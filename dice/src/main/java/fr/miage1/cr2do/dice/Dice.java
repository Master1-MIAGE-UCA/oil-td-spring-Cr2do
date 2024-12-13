package fr.miage1.cr2do.dice;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class Dice {


    private final Random randomValue;

    public Dice() {
        this.randomValue = new Random();
    }

    public int roll() {
        return randomValue.nextInt(6) + 1;
    }

}
