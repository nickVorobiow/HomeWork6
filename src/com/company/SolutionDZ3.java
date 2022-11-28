package com.company;

public class SolutionDZ3 {
    public void task1() {
        for (int i = 1; i <= 12; i++) {
            System.out.println("Месяц " + i + ", сумма накоплений равна " +
                    29000 * i + " рублей");
        }
    }

    public void task2() {
        for (int i = 1; i <= 12; i++) {
            System.out.println("Месяц " + i + ", сумма накоплений равна " +
                    29000 * i * 1.01 + " рублей");
        }
    }
}
