package org.example.volatilestudy.coop;

public class Data {
    private boolean sent = false;
    private String data;

    public void send(String data) {
        while (sent);
        this.data = data;
        sent = true;
    }

    public void receive() {
        while (!sent);
        System.out.println("receiver 스레드가 받은 data : " + this.data);
        sent = false;
    }
}
