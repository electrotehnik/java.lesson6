public class Swapper {
    public <T> void swap(T[] array, int index1, int index2) {
        T temp;
        temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
