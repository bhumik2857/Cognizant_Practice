import java.lang.reflect.*;

class SampleClass {
    public void sayHello() { System.out.println("Hello from SampleClass!"); }
    public int add(int a, int b) { return a + b; }
}

public class Q39_ReflectionInJava {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("SampleClass");
        System.out.println("Methods in " + clazz.getName() + ":");
        for (Method m : clazz.getDeclaredMethods())
            System.out.println("  " + m.getName() + " -> params: " + m.getParameterCount());
        Object obj = clazz.getDeclaredConstructor().newInstance();
        clazz.getMethod("sayHello").invoke(obj);
        System.out.println("add(3,4) = " + clazz.getMethod("add", int.class, int.class).invoke(obj, 3, 4));
    }
}
