package lab9;

import java.util.*;

public class MillionElems {
    public static List<Integer> arrayList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        return list;
    }

    public static List<Integer> linkedList() {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        return list;
    }

    public static long timeAccessCounter(List<Integer> list, int iterCount) {
        Random random = new Random();

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < iterCount; i++) {

            int randomInd = random.nextInt(list.size());

            int element = list.get(randomInd);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }


}
