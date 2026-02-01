package lab4;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeNFive {

    public void threeNFive() {

        ArrayList<Integer> threeArr = new ArrayList<>();
        ArrayList<Integer> fiveArr = new ArrayList<>();
        ArrayList<Integer> threeNFiveArr = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 5 ==0)) {
                threeNFiveArr.add(i);
                threeArr.add(i);
                fiveArr.add(i);
            } else if (i % 5 == 0) {
                fiveArr.add(i);
            } else if (i % 3 == 0) {
                threeArr.add(i);
            }
        }

        System.out.println("Делится на 3: " + threeArr.toString());

        System.out.println("Делится на 5: " + fiveArr.toString());

        System.out.println("Делится на 3 и на 5: " + threeNFiveArr.toString());
    }
}
