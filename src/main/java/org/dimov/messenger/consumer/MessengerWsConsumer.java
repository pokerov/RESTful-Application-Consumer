package org.dimov.messenger.consumer;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class MessengerWsConsumer {
    public static void main(String[] args) {
        Client messengerClient = ClientBuilder.newClient();
        WebTarget uri = messengerClient.target("http://localhost:8080/MessengerWs/api/messenger");

        if ( String.valueOf(uri.request(MediaType.APPLICATION_XML).get().getStatus()).equals("200") ) {
            System.out.println(uri.request(MediaType.APPLICATION_XML).get(String.class));
        }
    }
}
