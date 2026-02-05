package lab4;

import lab4.part2.*;

import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Часть 1, задание 1");
        OneToNine i = new OneToNine();
        i.oneToNine();


        System.out.println("\n" + "Часть 1, задание 2");
        ThreeNFive t = new ThreeNFive();
        t.threeNFive();


        System.out.println("\n" + "Часть 1, задание 3");
        Scanner scanner = new Scanner(System.in);
        SumNum checker = new SumNum();
        System.out.println("Введите 1 число : ");
        int first = scanner.nextInt();
        System.out.println("Введите 2 число : ");
        int second = scanner.nextInt();
        System.out.println("Введите 3 число : ");
        int third = scanner.nextInt();
        System.out.println("Результат: " + checker.checkNums(checker.getNums(first, second, third)));


        System.out.println("\n" + "Часть 1, задание 4");
        System.out.println("\n");
        System.out.println("Введите 1 число : ");
        int firstSort = scanner.nextInt();
        System.out.println("Введите 2 число : ");
        int secondSort = scanner.nextInt();
        System.out.println("Введите 3 число : ");
        int thirdSort = scanner.nextInt();
        System.out.println("Результат: " + checker.sortArr(checker.getNums(firstSort, secondSort, thirdSort)));



        System.out.println("\n" + "Часть 1, задание 5");
        System.out.println("\n");
        System.out.println("Введите длину массива (>= 2): ");
        FirstLastTrhee fLT = new FirstLastTrhee();
        int[] retArr = fLT.getArr(scanner.nextInt());
        System.out.println("Array = " + Arrays.toString(retArr));
        System.out.println(fLT.checkThree(retArr));


        System.out.println("\n" + "Часть 1, задание 6");
        System.out.println("\n");
        System.out.println("Введите длину массива: ");
        FirstLastTrhee fLTree = new FirstLastTrhee();
        int[] retArray = fLTree.getArr(scanner.nextInt());
        System.out.println(fLT.checkOneThree(retArray));




        System.out.println("\n" + "Задания 2 части" + "\n");

        System.out.println("\n" + "Часть 2, задание 1");
        System.out.println("\n");
        System.out.println("Введите длину массива: ");
        FirstLastTrhee chArr = new FirstLastTrhee();
        int[] chArray = chArr.getArr(scanner.nextInt());
        IsSortArr isSortArr = new IsSortArr();
        isSortArr.isSort(chArray);


        System.out.println("\n" + "Часть 2, задание 2");
        System.out.println("\n");
        System.out.println("Введите длину массива: ");
        FirstLastTrhee lengArr = new FirstLastTrhee();
        int[] lengArray = lengArr.getArr(scanner.nextInt());
        PrintArr prArr = new PrintArr();
        prArr.printArr(lengArray);


        System.out.println("\n" + "Часть 2, задание 3");
        System.out.println("\n");
        System.out.println("Введите длину массива: ");
        FirstLastTrhee swapArr = new FirstLastTrhee();
        int[] swapAr = swapArr.getArr(scanner.nextInt());
        SwapNums swn = new SwapNums();
        swn.swapArrayNums(swapAr);


        System.out.println("\n" + "Часть 2, задание 4");
        System.out.println("\n");
        System.out.println("Введите длину массива: ");
        FirstLastTrhee unicNum = new FirstLastTrhee();
        int[] fUnic = unicNum.getArr(scanner.nextInt());
        UniqueNum fUN = new UniqueNum();
        fUN.findUnique(fUnic);


        System.out.println("\n" + "Часть 2, задание 5");
        System.out.println("\n");
        System.out.println("Введите длину массива: ");
        FirstLastTrhee mrgSrtArr = new FirstLastTrhee();
        int[] mRSA = mrgSrtArr.getArr(scanner.nextInt());
        MergeSort mSA = new MergeSort();
        mSA.mergeSort(mRSA);
        System.out.println("Отсортированный массив: " + Arrays.toString(mRSA));
    }
}