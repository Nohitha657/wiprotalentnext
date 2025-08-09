package Multithreading;


import java.util.Random;

class ColorTask implements Runnable {
    String[] colours = {"white", "blue", "black", "green", "red", "yellow"};

    public void run() {
        Random rand = new Random();
        while (true) {
            int index = rand.nextInt(colours.length);
            System.out.println(colours[index]);
            if (colours[index].equals("red")) {
                System.out.println("Red found! Stopping display.");
                break;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Question2 {
    public static void main(String[] args) {
        Thread t = new Thread(new ColorTask());
        t.start();
    }
}
