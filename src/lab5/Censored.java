package lab5;

import javax.xml.stream.events.DTD;
import java.util.Arrays;

public class Censored {
    public static String censore(String text, String censoringWord, String censoredWord) {

        String censored = text.replace(censoringWord, censoredWord);
        return censored;
    }
}
