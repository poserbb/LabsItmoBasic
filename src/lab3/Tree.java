package lab3;

public class Tree {
    private int age;
    private boolean isAlive;
    private String name;

    public Tree(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Tree(int age, boolean isAlive, String name) {
        this.age = age;
        this.name = name;
        this.isAlive = isAlive;
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    public void printInfo() {
        System.out.println("Возраст дерева - " + age + "\n" +
                "Живое?(true или false) - " + isAlive + "\n" +
                "Название - " + name+ "\n");
    }
}
