package lab4;

import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        OneToNine i = new OneToNine();
        i.oneToNine();

        ThreeNFive t = new ThreeNFive();
        t.threeNFive();


        Scanner scanner = new Scanner(System.in);
        SumNum checker = new SumNum();


        System.out.println("Введите 1 число : ");
        int first = scanner.nextInt();

        System.out.println("Введите 2 число : ");
        int second = scanner.nextInt();

        System.out.println("Введите 3 число : ");
        int third = scanner.nextInt();

        System.out.println("Результат: " + checker.checkNums(checker.getNums(first, second, third)));




        System.out.println("\n");
        System.out.println("Введите 1 число : ");
        int firstSort = scanner.nextInt();

        System.out.println("Введите 2 число : ");
        int secondSort = scanner.nextInt();

        System.out.println("Введите 3 число : ");
        int thirdSort = scanner.nextInt();

        System.out.println("Результат: " + checker.sortArr(checker.getNums(firstSort, secondSort, thirdSort)));



        System.out.println("\n");
        System.out.println("Введите длину массива (>= 2): ");

        FirstLastTrhee fLT = new FirstLastTrhee();
        int[] retArr = fLT.getArr(scanner.nextInt());

        System.out.println("Array = " + Arrays.toString(retArr));
        System.out.println(fLT.checkThree(retArr));


        System.out.println("\n");
        System.out.println("Введите длину массива: ");

        FirstLastTrhee fLTr = new FirstLastTrhee();
        int[] retArra = fLTr.getArr(scanner.nextInt());

        System.out.println("Array = " + Arrays.toString(retArra));
        System.out.println(fLTr.checkThree(retArra));
    }
}