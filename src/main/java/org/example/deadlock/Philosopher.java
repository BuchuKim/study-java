package org.example.deadlock;

public class Philosopher extends Thread {
    String name;
    Fork left, right;
    Spagetti spagetti;

    Philosopher(String name, Fork left, Fork right, Spagetti spagetti) {
        this.name = name;
        this.left = left;
        this.right = right;
        this.spagetti = spagetti;
    }

    @Override
    public void run() {
        try {
            System.out.println(name + "가 왼쪽 포크를 집어든다.");
            left.picked();
            System.out.println(name + "가 오른쪽 포크를 집어든다.");
            right.picked();

            System.out.println(name + "가 스파게티를 먹는다.");
            spagetti.eaten();

            System.out.println(name + "가 왼쪽 포크를 내려놓는다.");
            left.putDowned();
            System.out.println(name + "가 오른쪽 포크를 내려놓는다.");
            right.putDowned();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
