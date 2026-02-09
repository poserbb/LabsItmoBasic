package lab5;

public class ReverseText {
    public static String reverseText(String text) {
        String[] words = text.split(" ");

        for (int i = 0; i < words.length; i++) {
            words[i] = new StringBuilder(words[i]).reverse().toString();
        }

        StringBuilder strBld = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
           strBld.append(words[i]);
           if (i < (words.length - 1)) {
               strBld.append(" ");
           }
        } return strBld.toString();
    }
}
