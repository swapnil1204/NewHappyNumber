package com.thoughtworks.training;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HappyNumberTest {

    @Test
    void givenNumberIsZero_WhenCheck_ThenShouldReturnFalse() {
        HappyNumber Zero = new HappyNumber(0);

        Assertions.assertFalse(Zero.check());
    }

}
