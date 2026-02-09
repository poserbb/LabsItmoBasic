package lab5;

public class IsPalindrom {

    public static boolean ispalindrom(String word) {
        String reversWord = new StringBuilder(word).reverse().toString();
        return word.equals(reversWord);
    }
}
