package ru.netology.services;

public class VacationService {

    // Метод для расчёта месяцев отпуска
    public int calculateVacationMonths(int income) {
        if (income <= 0) {
            throw new IllegalArgumentException("Доход не может быть отрицательным или нулевым");
        }

        // Логика расчёта месяцев отпуска
        return income / 10000;  // например, за каждые 10000 рублей дохода — 1 месяц отпуска
    }
}