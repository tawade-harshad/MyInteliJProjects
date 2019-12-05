package com.training.server;

import com.google.gson.Gson;

import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;

public class MyEncoder implements Encoder.Text<Partner> {

    @Override
    public void init(EndpointConfig endpointConfig) {

    }

    @Override
    public void destroy() {

    }

    @Override
    public String encode(Partner partner) throws EncodeException {
        Gson gsonEncoder = new Gson();
        return gsonEncoder.toJson(partner);
    }
}
