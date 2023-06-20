package org.example.deadlock;

public class Table {
    public static void main(String[] args) {
        Fork [] forks = new Fork[6];
        Spagetti [] spagettis = new Spagetti[5];
        for (int i=0; i<5; i++) {
            forks[i] = new Fork();
            spagettis[i] = new Spagetti(i+"번 스파게티");
        }
        forks[5] = forks[0];

        Philosopher [] philosophers = new Philosopher[5];
        for (int i=0; i<5; i++) {
            philosophers[i] = new Philosopher(i+"번 철학자",forks[i],forks[i+1],spagettis[i]);
        }

        for (Philosopher philosopher : philosophers) {
            philosopher.start();
        }
    }
}
