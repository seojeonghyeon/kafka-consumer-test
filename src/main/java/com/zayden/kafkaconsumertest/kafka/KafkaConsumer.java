package com.zayden.kafkaconsumertest.kafka;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;


@Slf4j
@RequiredArgsConstructor
public class KafkaConsumer {

    @KafkaListener(topics = "peter-test06")
    public void kafkaConsuming(String kafkaMessage){
        log.info("Kafka Log Message : {}", kafkaMessage);
    }

}
