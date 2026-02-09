package lab5;

import javax.xml.stream.events.DTD;
import java.util.Arrays;

public class Censored {

    public static String censore(String text) {

        String censored = text.replace("бяка", "[вырезано цензурой]");
        return censored;
    }
}
