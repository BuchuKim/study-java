package org.example.syncstudy.onemonitor;

public class Contribute {
    public static void main(String[] args) {
        Village village1 = new Village("마을1");
        Village village2 = new Village("마을2");

        Contributor contributor1 = new Contributor("기부자1",village1);
        Contributor contributor2 = new Contributor("기부자2",village2);

        contributor1.start();
        contributor2.start();
    }
}
