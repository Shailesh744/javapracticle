import java.net.*;
import java.io.*;

public class NetworkDemo {
    public static void main(String[] args) {
        try {
            // InetAddress class
            InetAddress address = InetAddress.getByName("www.google.com");
            System.out.println("IP Address: " + address.getHostAddress());
            System.out.println("Host Name: " + address.getHostName());

            // URL class
            URL url = new URL("https://www.example.com");
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Port: " + url.getPort());

            // URLConnection class
            URLConnection connection = url.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }
            in.close();

            // Socket class
            Socket socket = new Socket("localhost", 8080);
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            writer.println("Hello, Server!");
            String response = reader.readLine();
            System.out.println("Server response: " + response);
            socket.close();

            // DatagramSocket and DatagramPacket classes (UDP)
            DatagramSocket udpSocket = new DatagramSocket();
            String udpMessage = "Hello, UDP Server!";
            byte[] udpBuffer = udpMessage.getBytes();
            InetAddress udpAddress = InetAddress.getByName("localhost");
            DatagramPacket udpPacket = new DatagramPacket(udpBuffer, udpBuffer.length, udpAddress, 9000);
            udpSocket.send(udpPacket);

            byte[] udpResponseBuffer = new byte[udpBuffer.length];
            DatagramPacket udpResponsePacket = new DatagramPacket(udpResponseBuffer, udpResponseBuffer.length);
            udpSocket.receive(udpResponsePacket);
            String udpResponse = new String(udpResponsePacket.getData());
            System.out.println("UDP Server response: " + udpResponse);
            udpSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
