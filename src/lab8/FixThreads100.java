package lab8;

public class FixThreads100 {
    public void set100Threads() throws InterruptedException {
        Thread[] threads = new Thread[100];
        FixCounter counter = new FixCounter();

        for (int i = 0; i < 100; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    counter.increment();
                }
            });
        }

        for (Thread thread : threads) {
            thread.start();
        }

        boolean allDone;
        do {
            allDone = true;
            for (Thread thread : threads) {
                if (thread.isAlive()) {
                    allDone = false;
                    break;
                }
            }
        } while (!allDone);

        System.out.println(counter.getCount());
    }
}