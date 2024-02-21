package com.tahrioussama.kafkaproducerbrokerconsumer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic tahriTopic() {
        return TopicBuilder
                .name("tahri")
                .build();
    }

    @Bean
    public NewTopic jsonTahriTopic() {
        return TopicBuilder
                .name("tahri_json")
                .build();
    }
}
