package com.training.assignment;

import org.apache.commons.dbcp2.BasicDataSource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.StringTokenizer;

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
        String receivedData =  objServer.buff.readLine();

        StringTokenizer str = new StringTokenizer(receivedData,"-");

        String userName=" ";
        String email=" ";
        String contact=" ";

        while(str.hasMoreTokens()){
            userName = str.nextToken();
            email = str.nextToken();
            contact = str.nextToken();
        }

        BasicDataSource ds = new BasicDataSource();
        ds.setUsername("harshad_t");
        ds.setPassword("letmein19");
        ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        ds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");

        try {
            Connection conObj = ds.getConnection();
            PreparedStatement ps = conObj.prepareStatement("Insert into user_table values (?,?,?)");

            ps.setString(1,userName);
            ps.setString(2,email);
            ps.setString(3,contact);

            int count = ps.executeUpdate();

            System.out.println(count + " record update successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

}
