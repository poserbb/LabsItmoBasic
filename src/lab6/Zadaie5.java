package lab6;

import java.util.Scanner;

public class Zadaie5 {



    public String info;
    Scanner scanner = new Scanner(System.in);

    public Zadaie5() {}


    public void setInfo() {
        System.out.print("Введите возраст пользователя: ");
        this.info = scanner.nextLine();
    }

    public String getInfo() {
        return "Возраст пользователя: " + info;
    }
}
