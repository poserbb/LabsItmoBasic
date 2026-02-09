package lab5;

public class LongerWordFinder {

    public static String lWordFinder (String text) {
        String[] words = text.split(" ");

        String lWord = "";

        for (String word : words) {
            if (word.length() > lWord.length()) {
                lWord = word;
            }
        } return lWord;
    }
}
