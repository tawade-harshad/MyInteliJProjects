package com.training.chat;

import com.google.gson.Gson;
import com.training.model.Message;

import javax.websocket.DecodeException;
import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;

public class MessageDecoder implements Decoder.Text<Message> {
    @Override
    public Message decode(String s) throws DecodeException {
        Gson gson = new Gson();
        Message message = gson.fromJson(s,Message.class);
        return message;
    }

    @Override
    public boolean willDecode(String s) {
        return (s != null) ;
    }

    @Override
    public void init(EndpointConfig endpointConfig) {

    }

    @Override
    public void destroy() {

    }
}
