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
        List<Integer> digit = getdigitsList(number); //82 --> [2,8]
        int sumOfSquare = getSumOfSquare(digit);  // [2,8] --> 68
        if (sumOfSquare == 1) {
            return true;
        }
        this.number = sumOfSquare; //68
        List<Integer> secondIterationList = getdigitsList(number); //68 -->[8,6]
        int sumOfSquare1 = getSumOfSquare(secondIterationList); //[8,6] --> 100
        if (sumOfSquare1 == 1) {
            return true;
        }
        return false;
    }

    private List<Integer> getdigitsList(int number) { //86
        List<Integer> digit = new ArrayList<>();
        while (number > 0) {    //86  8
            int lastDigit = number % 10; //6  8
            number = number / 10;  //8   0
            digit.add(lastDigit);  //6  8
        }
        return digit;
    }

    private int getSumOfSquare(List<Integer> digit) {
        int sumOfSquare = 0;
        for (int i = 0; i < digit.size(); i++) {
            sumOfSquare = sumOfSquare + digit.get(i) * digit.get(i); //36 + 64
        }
        return sumOfSquare; //100
    }

    public static void main(String[] args) {
    }
}
