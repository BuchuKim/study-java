package org.example.syncstudy.sendreceive;

public class Receiver extends Thread {
    private final Data data;
    public Receiver(Data data) {
        this.data = data;
    }

    public void run() {
        for (String received = data.receive();
             !received.equals("END");
             received = data.receive()) {
            System.out.println(received);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
