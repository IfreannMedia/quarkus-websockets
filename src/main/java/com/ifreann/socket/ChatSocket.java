package com.ifreann.socket;

import javax.enterprise.context.ApplicationScoped;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint(value = "/chat/{username}")
@ApplicationScoped
public class ChatSocket {

}
