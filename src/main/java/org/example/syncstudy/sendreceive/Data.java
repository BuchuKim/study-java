package org.example.syncstudy.sendreceive;

public class Data {
    private String data;
    private boolean received = true;

    public synchronized void send(String data) {
        while (!received) {
            try {
                // receiver 받을 때까지 wait
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        received = false;
        this.data = data;
        notify();
    }

    public synchronized String receive() {
        while (received) {
            try {
                // sender 보낼 때까지 wait
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        received = true;
        String msg = this.data;
        notify();
        return msg;
    }
}
