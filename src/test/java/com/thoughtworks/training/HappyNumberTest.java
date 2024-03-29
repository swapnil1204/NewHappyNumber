package com.thoughtworks.training;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HappyNumberTest {

    @Test
    void givenNumberIsZero_WhenCheck_ThenShouldReturnFalse() {
        HappyNumber Zero = new HappyNumber(0);

        Assertions.assertFalse(Zero.check());
    }

    @Test
    void givenNumberIsOne_WhenCheck_ThenShouldReturnTrue() {
        HappyNumber one = new HappyNumber(1);

        Assertions.assertTrue(one.check());
    }

    @Test
    void givenNumberIsTen_WhenCheck_ThenShouldReturnTrue() {
        HappyNumber ten = new HappyNumber(10);

        Assertions.assertTrue(ten.check());
    }

    @Test
    void givenNumberIsHundreds_WhenCheck_ThenShouldReturnTrue() {
        HappyNumber hundreds = new HappyNumber(100);

        Assertions.assertTrue(hundreds.check());
    }

    @Test
    void givenNumberIsEightySix_WhenCheck_ThenShouldReturnTrue() {
        HappyNumber eightySix = new HappyNumber(86);

        Assertions.assertTrue(eightySix.check());
    }

    @Test
    void givenNumberIsEightyTwo_WhenCheck_ThenShouldReturnTrue() {
        HappyNumber eightyTwo = new HappyNumber(82);

        Assertions.assertTrue(eightyTwo.check());
    }

    @Test
    void givenNumberIsSeven_WhenCheck_ThenShouldReturnTrue() {
        HappyNumber seven = new HappyNumber(7);

        Assertions.assertTrue(seven.check());
    }

    @Test
    void givenNumberIsOneThirtyNine_WhenCheck_ThenShouldReturnTrue() {
        HappyNumber oneThirtyNine = new HappyNumber(139);

        Assertions.assertTrue(oneThirtyNine.check());
    }

}
