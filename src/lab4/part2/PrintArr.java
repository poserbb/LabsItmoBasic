package lab4.part2;

import java.util.Arrays;

public class PrintArr {

    public void printArr(int[] fLArr) {

        System.out.println("\n" + "Array lenght: " + fLArr.length +
                "\n" + "Numbers of array: ");

        for (int i = 0; i < fLArr.length; i++) {
            System.out.println("\n" + fLArr[i]);
        }
        System.out.println("Result: " + Arrays.toString(fLArr));


    }
}
