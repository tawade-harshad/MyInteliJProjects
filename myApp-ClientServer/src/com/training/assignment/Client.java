package com.training.assignment;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    Socket socket;
    BufferedReader buff;
    InputStreamReader isr;
    PrintWriter pw;

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Name.");
        String strFName = sc.next();

        System.out.println("Enter Email Id.");
        String strEmail = sc.next();

        System.out.println("Enter Contact Number");
        String strContact = sc.next();

        StringBuffer sb = new StringBuffer(60);
        sb.append(strFName).append("-").append(strEmail).append("-").append(strContact);

        String userInput = sb.toString();
        System.out.println(userInput);

        Client objClient = new Client();
        objClient.socket = new Socket("127.0.0.1",6541);
        objClient.isr = new InputStreamReader(objClient.socket.getInputStream());
        objClient.buff = new BufferedReader(objClient.isr);
        objClient.pw = new PrintWriter(objClient.socket.getOutputStream(),true);
        objClient.pw.println(userInput);
//        System.out.println("Message from server is " +objClient.buff.readLine());
    }
}
