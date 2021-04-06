import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Utils {

    public static Set<Integer> asSet(Integer... integers) {
        return Arrays.stream(integers).collect(Collectors.toSet());
    }
}
