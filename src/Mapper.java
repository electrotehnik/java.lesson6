import java.util.ArrayList;
import java.util.Arrays;

public class Mapper {
    public <T> ArrayList<T> toMap(T[] array) {
        ArrayList<T> arrayList = new Arrays.asList(array);
        return arrayList;
    }
}
