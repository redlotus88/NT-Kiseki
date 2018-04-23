package com.newtouch.activemq.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Destination;
import javax.jms.Topic;

/**
 * Created by dragon on 2018/4/23.
 */
@Service("producer")
public class ActiveMQProducer {

    @Autowired // 也可以注入JmsTemplate，JmsMessagingTemplate对JmsTemplate进行了封装
    private JmsMessagingTemplate jmsTemplate;

    @Autowired
    private Topic topic;

    // 发送消息，destination是发送到的队列，message是待发送的消息
    public void sendMessage(final String message){
        jmsTemplate.convertAndSend(this.topic, message);
    }
}
