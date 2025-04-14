package ru.netology.services;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VacationServiceTest {

    VacationService vacationService = new VacationService();

    // Тестирование расчета месяцев отпуска при положительном доходе
    @Test
    public void shouldCalculateVacationMonthsWithPositiveIncome() {
        int income = 30000;  // Например, доход 30000
        int expectedMonths = 3;  // Ожидаем 3 месяца отпуска (30000 / 10000)

        int actualMonths = vacationService.calculateVacationMonths(income);

        assertEquals(expectedMonths, actualMonths);
    }

    // Тестирование исключения при отрицательном доходе
    @Test
    public void shouldThrowExceptionForNegativeIncome() {
        int negativeIncome = -10000;

        // Ожидаем, что будет выброшено исключение IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> vacationService.calculateVacationMonths(negativeIncome));
    }

    // Тестирование исключения при нулевом доходе
    @Test
    public void shouldThrowExceptionForZeroIncome() {
        int zeroIncome = 0;

        // Ожидаем, что будет выброшено исключение IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> vacationService.calculateVacationMonths(zeroIncome));
    }
}