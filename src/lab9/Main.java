package lab9;

import java.util.*;

import static lab9.DelDublicat.dellDuplicates;
import static lab9.MillionElems.*;
import static lab9.MillionElems.linkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> testList = new ArrayList<>();
        testList.add("папа");
        testList.add("мама");
        testList.add("папа");
        testList.add("папа");
        testList.add("мама");
        testList.add("папа");
        testList.add("дочь");
        testList.add("сын");
        testList.add("сын");
        testList.add("сестра");

        System.out.println("до удаления: " + testList);
        System.out.println("удалили дубликаты: " + dellDuplicates(testList));


        System.out.println("\n" + "Задание 2" + "\n");
        List<Integer> arrayList = arrayList();
        List<Integer> linkedList = linkedList();

        System.out.println("Списки заполнены");

        long arrayListTime = timeAccessCounter(arrayList, 100000);
        long linkedListTime = timeAccessCounter(linkedList, 100000);

        System.out.println("\n" + "Результаты:");
        System.out.println("arrayList время:  " + arrayListTime + " мс");
        System.out.println("linkedList время: " + linkedListTime + " мс");


        System.out.println("\n" + "Задание 3" + "\n");
        GameScores gC = new GameScores();
        gC.setScores("папа", 5000);
        gC.setScores("мама", 3000);
        gC.setScores("вася", 2500);
        gC.setScores("петя", 9999);
        gC.findUserScore();


    }


}