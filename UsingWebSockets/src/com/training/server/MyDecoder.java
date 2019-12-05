package com.training.server;

import com.google.gson.Gson;

import javax.websocket.DecodeException;
import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;

public class MyDecoder implements Decoder.Text<Partner> {
    @Override
    public void init(EndpointConfig endpointConfig) {

    }

    @Override
    public void destroy() {

    }

    @Override
    public Partner decode(String s) throws DecodeException {
       Gson gsonDecoder = new Gson();
       return gsonDecoder.fromJson(s,Partner.class);
    }

    @Override
    public boolean willDecode(String s) {
        return false;
    }
}
