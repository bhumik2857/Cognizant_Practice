import java.io.*;

public class Q23_FileReading {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("output.txt"))) {
            String line;
            while ((line = br.readLine()) != null)
                System.out.println(line);
        } catch (FileNotFoundException e) {
            System.out.println("output.txt not found. Run Q22 first.");
        }
    }
}
