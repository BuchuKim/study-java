package org.example.syncstudy.onemonitor;

public class Contributor extends Thread {
    // no shared resource
    private final String name;
    private final Village village;

    public Contributor(String name, Village village) {
        this.name = name;
        this.village = village;
    }

    @Override
    public void run() {
        for (int i=0; i<1000; i++) {
            village.addMoney();
        }
        System.out.println(name + "님이 1000번 기부를 한 후 " +
                village.name + "에 " +
                village.money + "원이 모였습니다.");
    }
}
