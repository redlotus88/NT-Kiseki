package com.newtouch.activemq.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

/**
 * Created by dragon on 2018/4/23.
 */
@Service
public class ActiveMQListener {

    @JmsListener(destination = "mytest")
    public void receiveQueue(String text) {
        System.out.println("Consumer收到的报文为:" + text);
    }
}
