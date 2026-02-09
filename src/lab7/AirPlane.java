package lab7;

public class AirPlane {

    private Wing wing;
    private Wing wing2;

    public void setInfo(float weight1, float weight2){
        this.wing = new Wing(weight1);
        this.wing2 = new Wing(weight2);
    }


//    Wing wing = new Wing(560.6F);
//    Wing wing2 = new Wing(569.7F);

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
