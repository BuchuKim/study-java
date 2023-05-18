package org.example.syncstudy.racecondition;

public class Contribute {
    public static void main(String[] args) {
        // 10명 기부자의 1000원이 온전히 10000원이 되지 않는다.
        Village village = new Village();

        Contributor [] contributor = new Contributor[10];
        for (int i = 0; i<10; i++) {
            contributor[i] = new Contributor("기부자"+i,village);
        }

        for (int i=0;i<10;i++) {
            contributor[i].start();
        }
    }
}
