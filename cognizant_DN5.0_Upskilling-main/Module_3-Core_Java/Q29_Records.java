import java.util.List;

record Person(String name, int age) {}

public class Q29_Records {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Alice", 25),
                new Person("Bob", 17),
                new Person("Charlie", 30)
        );

        System.out.println("All People:");
        people.forEach(System.out::println);

        System.out.println("\nAdults (Age 18 and above):");

        List<Person> adults = people.stream()
                .filter(person -> person.age() >= 18)
                .toList();

        adults.forEach(System.out::println);
    }
}