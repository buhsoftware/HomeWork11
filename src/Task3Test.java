import java.util.Arrays;
import java.util.stream.Stream;

public class Task3Test {
    public static void main(String[] args) {
        String[] array = new String[]{"1, 2, 0", "4, 5"};
        System.out.println("array = " + Arrays.toString(array));
        Stream myStream = Stream.of(array).map(x -> x.split(", ")).flatMap(Arrays::stream).map(x -> Integer.valueOf(x)).sorted();
        System.out.println("myStream.toArray() = " + Arrays.toString(myStream.toArray()));
    }
}
