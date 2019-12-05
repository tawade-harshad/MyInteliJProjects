package com.training.server;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.nio.ByteBuffer;

//@ServerEndpoint("/wserver/)
@ServerEndpoint(value = "/wserver/",decoders = {MyDecoder.class}, encoders = {MyEncoder.class})
//@ServerEndpoint(value = "/wserver/{location}",decoders = MyDecoder.class, encoders = MyEncoder.class)
public class WsSocketServer {

    @OnOpen
    public void open(Session session){
        try{
            Partner part1 = new Partner();
            part1.setPartnerCode(101L);
            part1.setPartnerName("Harshad");
            part1.setMobileNumber(985452352L);
            session.getBasicRemote().sendObject(part1);
        }
        catch (Exception e){
            e.printStackTrace();
        }

       /* try{
            session.getBasicRemote().sendText("Hi, We are connected now. Start your Chat");
        }
        catch(Exception e){
            e.printStackTrace();
        }*/
        System.out.println("Connection Opened :");
    }

    @OnClose
    public void close(Session session){
        System.out.println("Connection Closed :");
    }

    /*@OnMessage
    public Object message(Session session, String message, @PathParam("location") String location){
        session.getId();
        System.out.println("Message := " +message);
        String response = "\n" + "Welcome :"+message + " from " + location;
        return response;
    }
    */

    @OnMessage
    public void handleMessage(Session session, String objectRef){
        System.out.println("Inside On Message");
        System.out.println(objectRef);
    }

    @OnError
    public void error(Throwable e){
        e.printStackTrace();
        System.out.println("Error Message Called :");
    }
}
