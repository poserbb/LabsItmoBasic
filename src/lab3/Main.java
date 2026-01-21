package lab3;
import static java.awt.Color.*;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Лабораторная 3, задание 2");
        Car car = new Car(BLUE);
        car.printInfo();

        Car car2 = new Car(RED, 1890.6);
        car2.printInfo();

        System.out.println("Лабораторная 3, задание 3");
        Home home = new Home();
        home.setInfo(22, 2010, "ЖК Гуси лебеди");
        home.printInfo();
        System.out.println("Возраст дома - " + home.homeAge() + "\n");

        Home home2 = new Home();
        home2.setInfo(1, 1890, "Скандинавская хижина");
        home2.printInfo();
        System.out.println("Возраст дома - " + home2.homeAge() + "\n");

        System.out.println("Лабораторная 3, задание 4");
        Tree tree1 = new Tree(40, "Дуб");
        tree1.printInfo();

        Tree tree2 = new Tree(10, true, "Береза");
        tree2.printInfo();

        Tree tree3 = new Tree();

    }
}