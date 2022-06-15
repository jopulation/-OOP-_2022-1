public class Car extends Vehicle {
    private int occupied;

    public Car() {
        occupied = 0;
    }

    public Car(int numberOfPeople) {
        occupied = numberOfPeople;
    }

    public void putPeople(int numberOfPeople) {
        setOccupied(numberOfPeople);
    }

    public void goForward(int speed) {
        super.goForward(speed);
        System.out.println("With " + getOccupied() + " people inside");
    }

    public int getOccupied() {
        return occupied;
    }

    public void setOccupied(int updateOccupied) {
        occupied = updateOccupied;
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.putPeople(4);
        c.goForward(100);
    }
}
