package lab3;

import java.awt.*;

public class Car {
    private Color color;
    private String name;
    private double weight;

    public Car(Color color) {
        this.color = color;
    }

    public Car(Color color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public Car() {

    }

    public void printInfo() {
        System.out.println("Цвет - " + color + "\n" + "Название - " + name + "\n" + "Вес - " + weight + "\n");
    }
}
