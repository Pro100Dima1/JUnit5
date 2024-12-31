package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalcTest {
    @BeforeAll
    public static void startOfTests() {
        System.out.println("Начало прогона тестов");
    }

    @ParameterizedTest(name = "№{index} - сложение {0} и {1}, ожидаемый результат {2}")
    @CsvSource({"2, 5, 7", "2, 5, 8", "3, 10, 13"})
    @DisplayName("Проверка работы сложения калькулятора")
    @Tag("summ")
    void testForSumm(int firstTerm, int secondTerm, int expected) {
        Calc calcSumm = new Calc();
        int ressultSum = calcSumm.summation(firstTerm, secondTerm);
        Assertions.assertEquals(expected, ressultSum, "Не работает");
    }

    @ParameterizedTest(name = "№{index} - вычитание {0} и {1}, ожидаемый результат {2}")
    @CsvSource({"7, 2, 5", "2, 5, 8", "13, 10, 3"})
    @DisplayName("Проверка работы вычитания калькулятора")
    @Tag("sub")
    void testForSubtraction(int firstTerm, int secondTerm, int expected) {
        Calc calcSub = new Calc();
        int ressultSub = calcSub.subtraction(firstTerm, secondTerm);
        Assertions.assertEquals(expected, ressultSub, "Не работает");
    }

    @AfterAll
    public static void endOfTests() {
        System.out.println("Конец прогона тестов");
    }

}