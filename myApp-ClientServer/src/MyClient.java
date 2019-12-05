import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MyClient {

    Socket socket;
    BufferedReader buff;
    InputStreamReader isr;
    PrintWriter pw;

    public static void main(String[] args) throws IOException {

        MyClient objClient = new MyClient();
        objClient.socket = new Socket("192.168.1.185",6541);
        objClient.isr = new InputStreamReader(objClient.socket.getInputStream());
        objClient.buff = new BufferedReader(objClient.isr);
        objClient.pw = new PrintWriter(objClient.socket.getOutputStream(),true);
        objClient.pw.println("Hello ! Server - This is Harshad");
        System.out.println("Message from server is " +objClient.buff.readLine());
    }
}
