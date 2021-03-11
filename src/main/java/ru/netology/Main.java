package ru.netology;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup mainGroup = new ThreadGroup("mainGroup");
        Thread myThread1 = new MyThread(mainGroup,"поток 1");
        Thread myThread4 = new MyThread(mainGroup, "поток 4");
        Thread myThread2 = new MyThread(mainGroup, "поток 2");
        Thread myThread3 = new MyThread(mainGroup, "поток 3");

        //запуск потоков
        myThread1.start();
        myThread4.start();
        myThread3.start();
        myThread2.start();
        Thread.sleep(15000);

        //метод для остановки потоки
        mainGroup.interrupt();
    }
}
