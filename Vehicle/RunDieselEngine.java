public class RunDieselEngine {
    public static void main(String[] args) {
        DieselEngineMountable bongo = new Truck(1000);
        DieselEngineMountable boat = new Boat("For fishing");
        DieselEngineMountable homeGenerator = new Generator();

        bongo.putDieselEngine(3000);
        boat.putDieselEngine(5000);
        homeGenerator.putDieselEngine(500);
    }
}
