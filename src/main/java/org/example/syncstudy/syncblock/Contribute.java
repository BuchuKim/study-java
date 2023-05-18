package org.example.syncstudy.syncblock;

public class Contribute {
    // using synchronized block
    public static void main(String[] args) {
        Village village = new Village();

        Contributor[] contributor = new Contributor[10];
        for (int i = 0; i<10; i++) {
            contributor[i] = new Contributor("기부자"+i,village);
        }

        for (int i=0;i<10;i++) {
            contributor[i].start();
        }
    }
}
