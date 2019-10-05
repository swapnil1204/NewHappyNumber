package com.thoughtworks.training;

import java.util.ArrayList;
import java.util.List;

public class HappyNumber {

    private int number;
    private int square = 0;

    public HappyNumber(int number) {
        this.number = number;
    }

    public boolean check() {
        if (number == 1 || number == 10)
            return true;
        List<Integer> digit = new ArrayList<>();
        while (number > 0) {
            int lastDigit = number % 10;
            number = number / 10;
            digit.add(lastDigit);
        }
        for (int i = 0; i < digit.size(); i++) {
            square = square + digit.get(i) * digit.get(i);
        }
        if(square == 1){
            return true;
        }
        return false;
    }
}
