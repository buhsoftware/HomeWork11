import java.util.stream.Stream;

public class Task4Test {
    public static Stream<Long> randomStream(long seed, long a, long c, long m) {
        return Stream.iterate(seed, x -> (a * x + c) % m);
    }

    public static void main(String[] args) {

        long a = 25214903917L;
        long c = 11;
        long m = (long) Math.pow(2,48);

        randomStream(1,a,c,m).limit(10).forEach(System.out::println);

    }
}
