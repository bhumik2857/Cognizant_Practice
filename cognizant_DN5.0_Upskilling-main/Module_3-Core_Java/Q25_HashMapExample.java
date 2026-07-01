import java.util.*;

public class Q25_HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("How many entries? ");
        int n = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("ID: "); int id = sc.nextInt(); sc.nextLine();
            System.out.print("Name: "); map.put(id, sc.nextLine());
        }
        System.out.print("Enter ID to search: ");
        int search = sc.nextInt();
        System.out.println("Name: " + map.getOrDefault(search, "Not found"));
    }
}
