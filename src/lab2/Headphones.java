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
                "Наличие микрофона - " + microphone + "\n";
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean getIsHaveBluetooth() {
        return haveBluetooth;
    }

    public void setBluetooth(boolean haveBluetooth) {
        this.haveBluetooth = haveBluetooth;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean getIsMicrophone() {
        return microphone;
    }

    public void setMicrophone(boolean microphone) {
        this.microphone = microphone;
    }
}
