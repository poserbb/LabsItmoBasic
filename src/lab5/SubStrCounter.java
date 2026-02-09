package lab5;

public class SubStrCounter {

    public static int subStrCounter(String fStr, String secStr) {
        int count = 0;
        int startPos = 0;
        while ((startPos = fStr.indexOf(secStr, startPos)) != -1) {
            count++;
            startPos = startPos + secStr.length();
        } return count;
    }
}
