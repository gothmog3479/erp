package ru.gothmog.erp.model;

public class Hello {
    public Hello(String helloMessage) {
        this.helloMessage = helloMessage;
    }

    private String helloMessage;

    public Hello() {
    }

    public String getHelloMessage() {
        return helloMessage;
    }

    public void setHelloMessage(String helloMessage) {
        this.helloMessage = helloMessage;
    }
}
