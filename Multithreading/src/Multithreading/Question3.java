package Multithreading;

class NumberPrinter extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i == 5) {
                try {
                    Thread.sleep(5000); // 5 seconds delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class Question3 {
    public static void main(String[] args) {
        NumberPrinter t = new NumberPrinter();
        t.start();
    }
}

