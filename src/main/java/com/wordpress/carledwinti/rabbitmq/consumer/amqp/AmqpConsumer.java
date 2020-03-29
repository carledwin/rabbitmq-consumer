package com.wordpress.carledwinti.rabbitmq.consumer.amqp;

public interface AmqpConsumer<T> {

    void consumer(T t);
}
