package com.wordpress.carledwinti.rabbitmq.consumer.service;

import com.wordpress.carledwinti.rabbitmq.consumer.dto.MessageDto;
import org.springframework.amqp.AmqpRejectAndDontRequeueException;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQService implements AmqpService {

    @Override
    public void action(MessageDto messageDto) {

        try{

            //TODO somente para testar o envio para a deadLetter
            //throw new RuntimeException("Exception para testar o envio para a deadLetter");

            System.out.println("Uma nova mensagem chegou: \n" + messageDto);
        }catch(Exception e){
            throw new AmqpRejectAndDontRequeueException(e);
        }
    }
}
