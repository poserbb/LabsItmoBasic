package lab6;

public class CargoCar extends Car{

    private int wheels;
    private float maxWeight;

    public CargoCar(int w, String m, char c, float s, int wheels) {
        this.weight = w;
        this.model = m;
        this.color = c;
        this.speed = s;
        this.wheels = wheels;
    }

    public void newWheels(int countWheels) {
        this.wheels = countWheels;
        System.out.println("Новое колличество колёс: " + wheels);
    }

    @Override
    public void outPut() {
        super.outPut();
        System.out.println("Колличество колёс: " + wheels);
    }
}
