import java.io.*;
import java.net.*;

public class Q35_TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(5000);
        System.out.println("Server listening on port 5000...");
        Socket client = server.accept();
        System.out.println("Client connected.");
        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        PrintWriter out = new PrintWriter(client.getOutputStream(), true);
        String msg;
        while ((msg = in.readLine()) != null) {
            System.out.println("Client: " + msg);
            out.println("Server echo: " + msg);
            if (msg.equalsIgnoreCase("bye")) break;
        }
        client.close(); server.close();
    }
}
