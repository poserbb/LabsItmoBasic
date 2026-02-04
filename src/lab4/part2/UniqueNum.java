package lab4.part2;

public class UniqueNum {
    int counterCompare = 0;
    int n = 0;
    public void findUnique(int[] fLArr) {

        comparing(fLArr);
        for (int i = 2; i < (fLArr.length - 1); i++) {
            if (counterCompare > 1) {
                counterCompare = 0;
                n++;
                comparing(fLArr);
            } else {
                System.out.println("\n" + "Первое уникальное число массива: " + fLArr[n]);
            }
        }


    }

    private void comparing(int[] fLArr) {
            for (int i = 0; i < (fLArr.length - 1); i++) {
            if (fLArr[n] == fLArr[i]) {
                counterCompare++;
            }
        }
    }


}

