package com.thoughtworks.training;

import java.util.ArrayList;
import java.util.List;

public class HappyNumber {

    private int number;

    public HappyNumber(int number) {
        this.number = number;
    }

    public boolean check() {
        if (number == 1 || number == 10)
            return true;
        List<Integer> digit = getdigitsList(number);
        int sumOfSquare = getSumOfSquare(digit);
        if (sumOfSquare == 1) {
            return true;
        }
        this.number = sumOfSquare;
        digit = getdigitsList(number);
        sumOfSquare = getSumOfSquare(digit);
        if (sumOfSquare == 1) {
            return true;
        }
        this.number = sumOfSquare;
        digit = getdigitsList(number);
        sumOfSquare = getSumOfSquare(digit);
        if (sumOfSquare == 1) {
            return true;
        }
        return false;
    }

    private List<Integer> getdigitsList(int number) {
        List<Integer> digit = new ArrayList<>();
        while (number > 0) {
            int lastDigit = number % 10;
            number = number / 10;
            digit.add(lastDigit);
        }
        return digit;
    }

    private int getSumOfSquare(List<Integer> digit) {
        int sumOfSquare = 0;
        for (int i = 0; i < digit.size(); i++) {
            sumOfSquare = sumOfSquare + digit.get(i) * digit.get(i);
        }
        return sumOfSquare;
    }

    public static void main(String[] args) {
    }
}
