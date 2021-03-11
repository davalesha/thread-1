package ru.netology;

public class MyThread extends Thread {
    public MyThread(ThreadGroup tg, String name){
        super(tg,name);
    }
    @Override
    public void run() {
        try {
            while (!isInterrupted()) { // вернет true, если выполнение потока было остановлено
                Thread.sleep(2500);
                System.out.println("Я " + Thread.currentThread().getName() + ". Всем привет!");
            }
        } catch (InterruptedException err) {
            interrupt(); // метод для остановки потоки
        } finally {
            System.out.printf("%s завершен\n", Thread.currentThread().getName());
        }
    }
}
