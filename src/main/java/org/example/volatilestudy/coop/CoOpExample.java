package org.example.volatilestudy.coop;

import java.util.Objects;

public class CoOpExample {
    public static void main(String[] args) {
        Data data = new Data();

        Thread sender = new Thread(() -> {
            data.send("스레드가 보낸 데이터");
        });

        Thread receiver = new Thread(data::receive);

        receiver.start();
        sender.start();
    }
}
