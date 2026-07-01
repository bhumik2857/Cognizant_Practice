import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Q35_TCPClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 5000);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        Scanner sc = new Scanner(System.in);
        String msg;
        while (true) {
            System.out.print("You: ");
            msg = sc.nextLine();
            out.println(msg);
            System.out.println(in.readLine());
            if (msg.equalsIgnoreCase("bye")) break;
        }
        socket.close();
    }
}
