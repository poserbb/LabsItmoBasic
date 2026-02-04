package lab4.part2;

import java.util.Arrays;

public class SwapNums {
    public void swapArrayNums(int[] fLArr) {

        System.out.println("Array 1: " + Arrays.toString(fLArr));

        int first = fLArr[0];
        int last = fLArr[fLArr.length - 1];

        fLArr[0] = last;
        fLArr[fLArr.length - 1] = first;

        System.out.println("\n" + "Array 2: " + Arrays.toString(fLArr));
    }
}
