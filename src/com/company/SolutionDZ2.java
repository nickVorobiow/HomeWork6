package com.company;

public class SolutionDZ2 {
    public void task1() {
        for (int i = 1904; i <= 2096; i+=4) {
            System.out.println(i + " год является високосным");
        }
    }

    public void task2() {
        for (int i = 1; i <= 14; i++) {
            System.out.print(7 * i + " ");
        }
    }

    public void task3() {
        System.out.print(1 + " ");
        for (int i = 2; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }
    }

}
