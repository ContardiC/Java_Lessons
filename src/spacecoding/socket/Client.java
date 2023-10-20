package spacecoding.socket;

import java.net.*;
import java.io.*;
 
public class Client {
   public static void main(String[] args) throws IOException {
      Socket socket = new Socket("localhost", 8080);
      PrintWriter out =
          new PrintWriter(socket.getOutputStream(), true);
      BufferedReader in =
          new BufferedReader(
              new InputStreamReader(socket.getInputStream()));
      BufferedReader stdIn =
          new BufferedReader(
              new InputStreamReader(System.in));
      String userInput;
      while ((userInput = stdIn.readLine()) != null) {
         out.println(userInput);
         System.out.println("echo: " + in.readLine());
      }
    }
}
   
