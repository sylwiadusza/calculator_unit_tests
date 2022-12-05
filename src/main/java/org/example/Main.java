package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        run();
    }
    static void run() {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("Menu: \n1 - Dodawanie, \n2 - Odejmowanie, \n3 - Mnożenie, \n4 - Dzielenie");
        System.out.println("Wybierz działanie:");
        int choice = scanner.nextInt();
        double result = 0;
        if (choice < 5) {
            System.out.println("Podaj wartość");
            double number_1 = scanner.nextDouble();
            System.out.println("Podaj wartość");
            double number_2 = scanner.nextDouble();
            switch (choice) {
                case 1:
                    result = calculator.sum(number_1, number_2);
                    break;
                case 2:
                    result = calculator.subtraction(number_1, number_2);
                    break;
                case 3:
                    result = calculator.multiplication(number_1, number_2);
                    break;
                case 4:
                    result = calculator.division(number_1, number_2);
                    break;
            }
            System.out.println("Wynik =" + result);
        } else {
            System.out.println("Niepoprawna opcja");
            run();
        }
    }
}