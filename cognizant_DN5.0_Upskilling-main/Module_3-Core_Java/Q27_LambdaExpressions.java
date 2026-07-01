import java.util.*;

public class Q27_LambdaExpressions {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Banana", "Apple", "Cherry", "Date"));
        Collections.sort(list, (a, b) -> a.compareTo(b));
        System.out.println("Sorted: " + list);
    }
}
