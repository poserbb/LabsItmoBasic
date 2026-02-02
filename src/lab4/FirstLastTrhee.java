package lab4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class FirstLastTrhee {

    public int[] getArr(int leng) {
        int[] fLArr = new int[leng];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < leng; i++) {
            System.out.println("Введите " + (i + 1) + " число массива: ");
            fLArr[i] = scanner.nextInt();
        }
        return fLArr;
    }

    public boolean checkThree(int[] fLArr) {
        if ((fLArr[0] == 3) || fLArr[fLArr.length - 1] == 3) {
            return true;
        } else return false;
    }

    public boolean checkOneThree(int[] fLArr) {
        int leng = fLArr.length;
        boolean isTrue = false;
        for (int i = 0; i < leng; i++) {
            if ((fLArr[i] == 1) || (fLArr[i] == 3)) {
                isTrue = true;
                break;
            } else isTrue = false;
        }
        return isTrue;
    }
}
