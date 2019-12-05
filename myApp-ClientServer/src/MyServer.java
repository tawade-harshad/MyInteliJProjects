import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    ServerSocket ss;
    Socket socket;
    BufferedReader buff;
    InputStreamReader isr;
    PrintWriter pw;

    public static void main(String[] args) throws IOException {

        MyServer objServer = new MyServer();
        objServer.ss = new ServerSocket(6541);
        System.out.println("Waiting for Client...");
        objServer.socket = objServer.ss.accept();
        System.out.println("Client Accepted...");

        objServer.isr = new InputStreamReader(objServer.socket.getInputStream());
        objServer.buff = new BufferedReader(objServer.isr);
        objServer.pw = new PrintWriter(objServer.socket.getOutputStream(),true);
        System.out.println("Message from client is " +objServer.buff.readLine());
        objServer.pw.println("Hello ! Client, Your Data is received on 198.168.1.86 !!!");


    }
}
