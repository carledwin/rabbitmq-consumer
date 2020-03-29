package com.wordpress.carledwinti.rabbitmq.consumer.dto;

public class MessageDto {

    private String message;

    public MessageDto(){ }

    @Override
    public String toString() {
        return "MessageDto{" +
                "message='" + message + '\'' +
                '}';
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
