package lab9;
import java.util.*;

public class DelDublicat {
    public static List<String> dellDuplicates(List<String> list) {

        Set<String> set = new HashSet<>(list);
        List<String> result = new ArrayList<>(set);

        return result;
    }
}
