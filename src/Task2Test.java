import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2Test {
    public static List<String> upperCaseSort(List<String> list)
    {
        return list.stream().map(x->x.toUpperCase()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }
    public static void main(String[] args) {
        System.out.println("upperCaseSort(List.of(\"Ivan\", \"Peter\", \"Sergey\", \"Mykola\", \"John\")) = "
                + upperCaseSort(List.of("Ivan", "Peter", "Sergey", "Mykola", "John")));
    }
}
