public class Vehicle {
    private int weight;

    public Vehicle() {
        weight = 0;
    }

    public Vehicle(int w) {
        weight = w;
    }

    public void goForward(int speed) {
        System.out.println("Going forward at the speed of " + speed + "km/h");
    }
    
    public int getWeight() {
        return weight;
    }

    public void setWeight(int updateWeight) {
        weight = updateWeight;
    }

    public static void main(String[] args) {
        Vehicle testVehicle = new Vehicle(1000);
        testVehicle.goForward(50);
    }
}
