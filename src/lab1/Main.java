package lab1;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Лабораторная 1, задание 1.\n");
        isKnowJava isKnow = new isKnowJava();
        isKnow.print();

        System.out.println("Лабораторная 1, задание 2.\n");
        Calc1 calc1 = new Calc1();
        calc1.print();

        System.out.println("Лабораторная 1, задание 3.\n");
        Calc10500 calc10500 = new Calc10500();
        calc10500.print();

        System.out.println("Лабораторная 1, задание 4.\n");
        ThreeNumbrs tnum = new ThreeNumbrs();
        tnum.print();

        System.out.println("Лабораторная 1, задание 5.\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int first = scanner.nextInt();
        System.out.println("Введите второе число");
        int second = scanner.nextInt();
        System.out.println("Введите третье число");
        int third = scanner.nextInt();
        System.out.println("\n" + "Введены числа: \n" + first + "\n" + second + "\n" + third);

        System.out.println("Лабораторная 1, задание 6.\n");
        System.out.println("Введите число");
        int b = scanner.nextInt();
        if (b % 2 != 0) {
            System.out.println("\nНечётное");
        } else if (b % 2 == 0 && b <= 100) {
            System.out.println("\nЧётное");
        } else if (b % 2 == 0 && b > 100) {
            System.out.println("\nВыход за пределы диапазона");
        }
    }
}