package org.example.syncstudy.syncmethod;

public class Contribute {
    // using synchronized method
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
