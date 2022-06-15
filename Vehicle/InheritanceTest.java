public class InheritanceTest {
    public static void main(String[] args) {
        Vehicle movable = new Vehicle(1000);
        Vehicle car = new Car(4);
        Vehicle truck = new Truck(1500);
        Vehicle boat = new Boat("Incheon");

        movable.goForward(30);
        System.out.println();
        car.goForward(100);
        System.out.println();
        truck.goForward(80);
    }
}


