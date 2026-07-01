import java.util.*;
import java.util.stream.*;

record Person(String name, int age) {}

public class Q29_Records {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("Alice", 25),
            new Person("Bob", 17),
            new Person("Charlie", 30)
        );
        people.forEach(System.out::println);
        System.out.println("Adults:");
        people.stream().filter(p -> p.age() >= 18).forEach(System.out::println);
    }
}
