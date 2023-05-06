package org.example.outputstream;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
  private static final int SERVER_PORT = 9000;
  private static final String HOST = "127.0.0.1";

  public static void main(String args[]) throws IOException {
    System.out.println("Client is trying to connect on Server...");
    Socket client = new Socket(HOST, SERVER_PORT);
    System.out.println("Client is successfully connected!");
    PrintWriter output = new PrintWriter(client.getOutputStream(), true);
    output.println("Hello from client!");
    output.close();
    client.close();
  }
}
