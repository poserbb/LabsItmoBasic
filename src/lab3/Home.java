package lab3;

public class Home {
    private int numberOfFloors;
    private int yearOfBuild;
    private String notify;

    public Home() {

    }

    public void setInfo(int numberOfFloors, int yearOfBuild, String notify) {
        this.yearOfBuild = yearOfBuild;
        this.numberOfFloors = numberOfFloors;
        this.notify = notify;
    }

    public void printInfo() {
        System.out.println("Год постройки дома - " + yearOfBuild + "\n" +
                "Кол-во этажей дома - " + numberOfFloors + "\n" +
                "Наименование - " + notify);
    }

    public int homeAge() {
        int homeAge = 2026 - yearOfBuild;
        return homeAge;
    }
}
