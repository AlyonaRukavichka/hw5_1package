package ru.netology.hw5_1.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import ru.netology.hw5_1.services.RestServices;

public class RestServicesTest {
    @Test
    public void CalculateRestMonthes1() {
        RestServices service = new RestServices();

        int expected = 3;
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CalculateRestMonthes2() {
        RestServices service = new RestServices();

        int expected = 2;
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

}
