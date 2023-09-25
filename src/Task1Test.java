import java.util.List;
import java.util.stream.Collectors;

public class Task1Test {

   public static String oddElementsOfList(List<String> list)
   {
       return list.stream().filter((x) -> list.indexOf(x)%2==0).map(x->list.indexOf(x) + 1 + ". " + x).collect(Collectors.joining(", "));
   }

    public static void main(String[] args) {
        System.out.println( oddElementsOfList(List.of("Ivan", "Peter", "Sergey", "Mykola", "John")));
    }
}
