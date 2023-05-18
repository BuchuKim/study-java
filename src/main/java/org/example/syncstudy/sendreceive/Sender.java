package org.example.syncstudy.sendreceive;

public class Sender extends Thread {
    private final Data data;
    public Sender(Data data) {
        this.data = data;
    }
    public void run() {
        String [] packets = {"1번 패킷", "2번 패킷", "3번 패킷", "4번 패킷", "END"};

        for (String packet : packets) {
            data.send(packet);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
