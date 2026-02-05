package lab4.part2;

public class IsSortArr {

    public void isSort(int[] fLArr) {

        int chekIndex = 0;
        for (int i = 0; i<= (fLArr.length - 2); i++) {
            if (fLArr[i] < fLArr[i+1]) {
                chekIndex++;
            }
        }

        if (chekIndex < (fLArr.length - 1)) {
            System.out.println("Please, try again");
        } else {
            System.out.println("OK");
        }
    }
}
