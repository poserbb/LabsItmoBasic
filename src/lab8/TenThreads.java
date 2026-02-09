package lab8;

public class TenThreads {
    public void tenThreads() {
        for (int i = 0; i <= 10; i++) {
            Thread thread = new Thread(new PrintNum(i));
            System.out.println("Состояние потока " + i + " перед запуском: " + thread.getState());
            thread.start();
            System.out.println("Состояние потока " + i + " после запуска: " + thread.getState());



        }
    }

    class PrintNum implements Runnable {
        private int threadNum;

        public PrintNum(int threadNum) {
            this.threadNum = threadNum;
        }

        @Override
        public void run() {
            System.out.println("\n" + "Состояние потока " + threadNum +
                    " во время выполнения: " + Thread.currentThread().getState());

            for (int i = 0; i <= 10; i++) {
                System.out.println("Поток №" + threadNum + " пишет: " + i);
            }

            System.out.println("Поток " + threadNum + " завершил работу.");
        }
    }
}
