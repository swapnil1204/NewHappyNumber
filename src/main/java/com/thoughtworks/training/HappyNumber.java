package com.thoughtworks.training;

public class HappyNumber {

    private final int number;

    public HappyNumber(int number) {
        this.number = number;
    }

    public boolean check() {
        if (number == 1)
            return true;
        return false;
    }
}
