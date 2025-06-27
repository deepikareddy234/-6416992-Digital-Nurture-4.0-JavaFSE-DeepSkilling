package com.advexample.junitparamdemo;

public class MessageService {
    private MessageSender messageSender;

    public MessageService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void sendMessageToCity(String city) {
        messageSender.send(city);  // internally sends the message
    }
}
