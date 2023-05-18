package org.example.syncstudy.syncblock;

public class Contributor extends Thread {
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
        System.out.println(name + "님이 1000번 기부를 한 후 마을에 " + village.money+" 원이 모였습니다.");
    }
}
