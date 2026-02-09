package lab7;

public class AirPlane {

    Wing wing = new Wing(560.6F);
    Wing wing2 = new Wing(569.7F);

    public void getInfo() {
        System.out.println(wing.showWeight());
        System.out.println(wing2.showWeight());
    }


    public class Wing {

        public Wing(float weight){
            this.weight = weight;
        }

        public float weight;

        public String showWeight() {
            return "Вес крыла: " + weight;
        }
    }

}
