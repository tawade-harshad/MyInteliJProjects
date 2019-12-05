package com.training.assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    ServerSocket ss;
    Socket socket;
    BufferedReader buff;
    InputStreamReader isr;
    PrintWriter pw;

    public static void main(String[] args) throws IOException {

        Server objServer = new Server();
        objServer.ss = new ServerSocket(6541);
        System.out.println("Waiting for Client...");
        objServer.socket = objServer.ss.accept();
        System.out.println("Client Accepted...");

        objServer.isr = new InputStreamReader(objServer.socket.getInputStream());
        objServer.buff = new BufferedReader(objServer.isr);
        objServer.pw = new PrintWriter(objServer.socket.getOutputStream(),true);
        System.out.println("Data Passed from Client is :" +objServer.buff.readLine());



    }

}
