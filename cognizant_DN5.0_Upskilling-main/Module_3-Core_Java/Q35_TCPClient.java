import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Q35_TCPClient {

    public static void main(String[] args) throws IOException {

        try (
                Socket socket = new Socket("localhost", 5000);
                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(socket.getInputStream()));
                PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
                Scanner scanner = new Scanner(System.in)
        ) {

            System.out.println("Connected to server on port 5000.");

            while (true) {
                System.out.print("You: ");
                String message = scanner.nextLine();

                writer.println(message);

                String response = reader.readLine();
                System.out.println("Server: " + response);

                if (message.equalsIgnoreCase("bye")) {
                    System.out.println("Connection closed.");
                    break;
                }
            }
        }
    }
}