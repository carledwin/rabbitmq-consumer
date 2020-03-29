package com.wordpress.carledwinti.rabbitmq.consumer.service;

import com.wordpress.carledwinti.rabbitmq.consumer.dto.MessageDto;

public interface AmqpService {

    void action(MessageDto messageDto);
}
