package lab6;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        System.out.println("Задание 1" + "\n");
        Client client = new Client("Ваня", "Иванов", "ВТБ");
        System.out.println(client.getInfo() + "\n");
        client.changeBankName("Сбер");
        System.out.println(client.getInfo() + "\n");

        Client client2 = new Client("Петя", "Сидоров", "Сбер");
        System.out.println(client2.getInfo() + "\n");
        client.changeBankName("ВТБ");
        System.out.println(client2.getInfo() + "\n");

        System.out.println("\n" + "Задание 2" + "\n");
        BankJobber emploee1 = new BankJobber("Васлий", "Сидоров", "Сбер");
        System.out.println(emploee1.getHumanInfo() + "\n");
        emploee1.changeBankName("ВТБ");
        System.out.println(emploee1.getHumanInfo() + "\n");

        System.out.println("\n" + "Задание 3" + "\n");
        CargoCar cargoCar = new CargoCar(6000, "kamaz", 'g', 205.6F, 9);
        cargoCar.outPut();
        cargoCar.newWheels(8);
        cargoCar.newWheels(10);
        cargoCar.outPut();

        System.out.println("\n" + "Задание 4" + "\n");
        ClassNaslednic clNas = new ClassNaslednic();
        clNas.setPeremennaya(5);
        clNas.vizov();

        System.out.println("\n" + "Задание 5" + "\n");
        Zadanie5Nasled naslednik = new Zadanie5Nasled();
        naslednik.setInfo();
        System.out.println(naslednik.getInfo());



    }
}