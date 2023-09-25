import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Stream;

public class Task5Test {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second)
    {
        Stream<T> resultStream = Stream.empty();
        Iterator<T> firstIterator = first.iterator();
        Iterator<T> secondIterator = second.iterator();

        while (firstIterator.hasNext() & secondIterator.hasNext()){
            resultStream = Stream.concat(resultStream, Stream.of(firstIterator.next(), secondIterator.next()));
        }

        return resultStream;
    }

    public static void main(String[] args) {

        Stream stream1 = Stream.of(1,3,5,7,9,11);
        Stream stream2 = Stream.of(2,4,6,8);
        System.out.println("Arrays.toString(zip(stream1,stream2).toArray()) = " + Arrays.toString(zip(stream1, stream2).toArray()));
    }

}
