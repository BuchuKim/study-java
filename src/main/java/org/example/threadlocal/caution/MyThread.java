package org.example.threadlocal.caution;

public class MyThread extends Thread {
    @Override
    public void run() {
        if (MyNumber.threadLocal.get()==null) {
            System.out.println(getName() + "'s value is null!");
            MyNumber.threadLocal.set(new SomeClass(getName()));
        } else {
            System.out.println(getName() + "'s value = " + MyNumber.threadLocal.get());
        }

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // MyNumber.threadLocal.remove();
    }
}
