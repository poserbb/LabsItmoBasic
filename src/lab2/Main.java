package lab2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//Задание 1
        Calculator calc = new Calculator();

        System.out.println(calc.summa(1, 2));
        System.out.println(calc.summa(1.1, 2.2));
        System.out.println(calc.summa(100000000000L, 2222222222L));
        System.out.println(calc.minus(1, 2));
        System.out.println(calc.minus(2.5, 1.5));
        System.out.println(calc.minus(2222222222L, 111111111L));
        System.out.println(calc.expand(5, 2));
        System.out.println(calc.expand(5.5, 2.5));
        System.out.println(calc.expand(11111111111L, 2222222222L));
        System.out.println(calc.slash(4, 2));
        System.out.println(calc.slash(5.5, 2.5));
        System.out.println(calc.slash(11111111111L, 2222222222L));
        System.out.println(calc.slash(3, 0) + "\n");


//Задание 2
        Headphones hf = new Headphones();
        System.out.println("Конструктор без параметров вот это выводит: \n");
        System.out.println(hf);

        System.out.println("После постановки через сеттеры/геттеры: \n");

        hf.setBrand("apple");
        hf.setMicrophone(true);
        hf.setBluetooth(true);
        hf.setWeight(0.3);

        System.out.println("Бренд: " + hf.getBrand());
        System.out.println("Вес: " + hf.getWeight());
        System.out.println("Наличие микрофона: " + hf.getIsMicrophone());
        System.out.println("Наличие bluetooth: " + hf.getIsHaveBluetooth());

        Headphones hf2 = new Headphones("JBL", true, 0.5, false);
        System.out.println("Конструктор с параметрами вот это выводит: \n");
        System.out.println(hf2);



    }
}