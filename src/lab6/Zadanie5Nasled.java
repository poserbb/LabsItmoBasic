package lab6;

public class Zadanie5Nasled extends Zadaie5 {

    @Override
    public void setInfo() {
        System.out.println("Введите имя пользователя: ");
        this.info = scanner.nextLine();
    }

    @Override
    public String getInfo() {
        return "Имя пользователя: " + info;
    }
}
