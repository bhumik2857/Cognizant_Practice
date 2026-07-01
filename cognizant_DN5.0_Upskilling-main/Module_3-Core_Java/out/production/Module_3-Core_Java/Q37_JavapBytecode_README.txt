== Using javap to Inspect Bytecode ==

1. Create Sample.java:
   public class Sample {
       public int add(int a, int b) { return a + b; }
       public static void main(String[] args) { System.out.println(new Sample().add(3,4)); }
   }

2. Compile:  javac Sample.java
3. Inspect:  javap -c Sample

Sample output:
  public int add(int, int);
    Code:
       0: iload_1       <- push param a
       1: iload_2       <- push param b
       2: iadd          <- add both
       3: ireturn       <- return result
