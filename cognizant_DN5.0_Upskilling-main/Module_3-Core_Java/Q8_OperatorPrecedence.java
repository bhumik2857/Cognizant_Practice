public class Q8_OperatorPrecedence {
    public static void main(String[] args) {
        int r1 = 10 + 5 * 2;
        int r2 = (10 + 5) * 2;
        int r3 = 100 / 5 + 3 * 2;
        System.out.println("10 + 5 * 2 = " + r1 + "  (* before +)");
        System.out.println("(10 + 5) * 2 = " + r2 + "  (parentheses first)");
        System.out.println("100 / 5 + 3 * 2 = " + r3 + "  (/ and * before +)");
    }
}
