public class Driver {
    private String name;
    private Vehicle vehicle;

    public Driver(String driverName) {
        name = driverName;
    }

    public void purchase(Vehicle v) {
        vehicle = v;
    }

    public void driveAtSpeed(int speed) {
        vehicle.goForward(speed);
    }

    public String getName() {
        return name;
    }

    public boolean hasBoat() {
        return vehicle instanceof Boat;

        //if (vehicle instanceof Boat)
        //{
        //    return true;
        //}
        //else
        //{
        //    return false;
        //}
    }

    public void checkHarbor() {
        if (hasBoat() == true) {
            Boat b = (Boat)vehicle;
            b.currentHarbor();
        }
    }

    public static void main(String[] args) {
        Driver carDriver = new Driver("john");
        Driver truckDriver = new Driver("jane");
        Driver boatDriver = new Driver("dooly");

        carDriver.purchase(new Car(4));
        truckDriver.purchase(new Truck(1000));
        boatDriver.purchase(new Boat("Busan"));

        System.out.println(carDriver.getName());
        carDriver.driveAtSpeed(100);
        System.out.println(carDriver.hasBoat());
        System.out.println();

        System.out.println(truckDriver.getName());
        truckDriver.driveAtSpeed(80);
        System.out.println(truckDriver.hasBoat());
        System.out.println();

        System.out.println(boatDriver.getName());
        boatDriver.driveAtSpeed(30);
        boatDriver.checkHarbor();
        System.out.println();
    }
}
