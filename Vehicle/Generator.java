public class Generator implements DieselEngineMountable {
    public void generateElectricity() {
        System.out.println("Generates electricity.");
    }

    @Override
    public void putDieselEngine(int capacity) {
        System.out.println("Putting in diesel engine " + capacity + "cc");
        System.out.println("Generates electricity with the diesel engine.");
    }
}
