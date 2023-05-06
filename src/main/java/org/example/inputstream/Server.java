package org.example.inputstream;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
  private static final int SERVER_PORT = 9000;
  public static void main(String[] args) throws IOException {
    ServerSocket server = new ServerSocket(SERVER_PORT);
    System.out.println("Server is listen for client connections...");
    Socket client = server.accept();
    Scanner input = new Scanner(client.getInputStream());
    while (input.hasNext()){
      System.out.println(input.nextLine());
    }
    System.out.println("Server stopped successfully!");
    input.close();
    server.close();
  }
}
