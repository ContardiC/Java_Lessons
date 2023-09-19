package spacecoding.socket;

import java.net.*;
import java.io.*;
public class Server{
    public static void main(String[] args) {
        try{
        ServerSocket serverSocket = new ServerSocket(8080);
        Socket clientSocket = serverSocket.accept();
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true, null);
        InputStreamReader i = new InputStreamReader(clientSocket.getInputStream());
        BufferedReader in = new BufferedReader(i);
        String inputLine = in.readLine();
        while((inputLine = in.readLine()) != null){
             out.println(inputLine);
        }
        }catch(IOException e){

        }
        
    }
          
}