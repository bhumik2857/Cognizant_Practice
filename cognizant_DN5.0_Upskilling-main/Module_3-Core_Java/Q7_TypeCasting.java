public class Q7_TypeCasting {
    public static void main(String[] args) {
        double d = 9.99;
        int fromDouble = (int) d;
        System.out.println("double " + d + " cast to int: " + fromDouble);
        int i = 7;
        double fromInt = (double) i;
        System.out.println("int " + i + " cast to double: " + fromInt);
    }
}
