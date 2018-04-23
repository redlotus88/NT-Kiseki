package com.newtouch.activemq.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Queue;
import javax.jms.Topic;

/**
 * Created by dragon on 2018/4/23.
 */
@Configuration
public class ActiveMQTopicConfig {

    // Topic模式的配置
    @Bean
    public Topic topic(){
        return new ActiveMQTopic("mytest");
    }

    // Queue模式的配置
//    @Bean
//    public Queue queue(){
//        return new ActiveMQQueue("queue");
//    }
}
