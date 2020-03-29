package com.wordpress.carledwinti.rabbitmq.consumer.amqp;

import com.wordpress.carledwinti.rabbitmq.consumer.dto.MessageDto;
import com.wordpress.carledwinti.rabbitmq.consumer.service.RabbitMQService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQAmqConsumer implements AmqpConsumer<MessageDto> {

    @Autowired
    private RabbitMQService rabbitMQService;

    @Override
    @RabbitListener(queues = "${spring.rabbitmq.request.routing-key.producer}")
    public void consumer(MessageDto messageDto) {
        rabbitMQService.action(messageDto);
    }
}
