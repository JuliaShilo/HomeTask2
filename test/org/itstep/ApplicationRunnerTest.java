package org.itstep;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationRunnerTest {

    @org.junit.jupiter.api.Test
    void getResultByStrManipulatrion() {
        int number = 12345;
        Assertions.assertEquals(15, ApplicationRunner.getResultByStrManipulatrion(number));
    }

    @org.junit.jupiter.api.Test
    void getSumByDiv() {
        int number = 12345;
        Assertions.assertEquals(15, ApplicationRunner.getSumByDiv(number));

    }
}