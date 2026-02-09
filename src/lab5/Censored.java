package lab5;

import javax.xml.stream.events.DTD;
import java.util.Arrays;

public class Censored {

    public static String censore(String text) {

        String censoringWord = "бяка";
        String censoredWord = "[вырезано цензурой]";

        String censored = text.replace(censoringWord, censoredWord);
        return censored;
    }
}
