public class Truck extends Car {
    private int load;

    public Truck() {
        load = 0;
    }

    public Truck(int l) {
        load = l;
    }

    public void takeLoad(int cargoWeight) {
        load = cargoWeight;
    }

    public void goForward(int speed) {
        super.goForward(speed);
        System.out.println("With cargo load: " + getLoad() + "kg");
    }

    public int getLoad() {
        return load;
    }
    
    public void setLoad(int updateLoad) {
        load = updateLoad;
    }
    
    public static void main(String[] args) {
        Truck t = new Truck();
        t.putPeople(2);
        t.takeLoad(2000);
        t.goForward(80);
    }
}
