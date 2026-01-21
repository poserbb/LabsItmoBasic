package lab2;

public class Headphones {
    private String brand;
    private boolean haveBluetooth;
    private double weight;
    private boolean microphone;

    public Headphones(){

    }

    public Headphones(String brand, boolean bluetooth, double weight, boolean microphone){
        this.brand = brand;
        this.haveBluetooth = bluetooth;
        this.weight = weight;
        this.microphone = microphone;
    }

    @Override
    public String toString() {
        return "Бренд - " + brand + "\n" +
                "Наличие bluetooth - " + haveBluetooth + "\n" +
                "Вес(килограммы) - " + weight + "\n" +
                "Наличие микровона - " + microphone + "\n";
    }

}
