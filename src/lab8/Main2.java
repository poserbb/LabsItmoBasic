package lab8;

public class Main2 {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("\n" + "Задание 2" + "\n");
        Threads100 th100 = new Threads100();
        th100.set100Threads();

        FixThreads100 fTH100 = new FixThreads100();
        fTH100.set100Threads();

        System.out.println("\n" + "Задание 3" + "\n");
        TwoThreads tTs = new TwoThreads();
        tTs.startThreads();
    }
}
