package lab8;

public class TwoThreads {
    static final Object two = new Object();
    static boolean myTurn = true;


    public void startThreads() {
        Thread thread1 = new Thread(new Printer("Поток 1", true));
        Thread thread2 = new Thread(new Printer("Поток 2", false));

        thread1.start();
        thread2.start();

    }
}
class Printer implements Runnable {
    private final String name;      // Имя потока для вывода
    private final boolean isFirst;

    public Printer(String name, boolean isFirst) {
        this.name = name;
        this.isFirst = isFirst;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (TwoThreads.two) {
                while ((isFirst && !TwoThreads.myTurn) || (!isFirst && TwoThreads.myTurn)) {
                    try {
                        TwoThreads.two.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
                System.out.println(name);
                TwoThreads.myTurn = !TwoThreads.myTurn;
                TwoThreads.two.notifyAll();
            }
        }
    }
}