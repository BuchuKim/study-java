package org.example.syncstudy.sendreceive;

import java.io.PrintStream;
import java.util.concurrent.ConcurrentHashMap;

public class SenderAndReceiver {
    public static void main(String[] args) {
        Data packet = new Data();
        Receiver receiver = new Receiver(packet);
        Sender sender = new Sender(packet);

        sender.start();
        receiver.start();
    }
}
