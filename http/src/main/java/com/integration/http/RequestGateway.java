package com.integration.http;

import org.springframework.messaging.Message;

public interface RequestGateway {

    String echo(Message<?> message);

}
