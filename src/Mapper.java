import java.util.ArrayList;
import java.util.Arrays;

public class Mapper {
    public <T> ArrayList<T> toMap(T[] array) {
        return new ArrayList<T>(Arrays.asList(array));
    }
}
