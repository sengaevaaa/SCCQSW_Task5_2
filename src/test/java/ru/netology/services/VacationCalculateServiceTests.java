package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VacationCalculateServiceTests {

    @Test
    void calculationTest1() {
        VacationCalculateService service = new VacationCalculateService();

        // подготавливаем данные:
        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;

        int expected = 3;
        // вызываем целевой метод:
        int actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void calculationTest2() {
        VacationCalculateService service = new VacationCalculateService();

        // подготавливаем данные:
        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;

        int expected = 2;
        // вызываем целевой метод:
        int actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

}
