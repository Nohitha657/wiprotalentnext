package Multithreading;

class PriorityThread extends Thread {
    public PriorityThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - Count: " + i);
        }
    }
}

public class Question5 {
    public static void main(String[] args) {
        PriorityThread t1 = new PriorityThread("MAX_PRIORITY_THREAD");
        PriorityThread t2 = new PriorityThread("MIN_PRIORITY_THREAD");
        PriorityThread t3 = new PriorityThread("NORM_PRIORITY_THREAD");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}

