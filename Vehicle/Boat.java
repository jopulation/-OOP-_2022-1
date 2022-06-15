public class Boat extends Vehicle implements DieselEngineMountable {
    private String place;

    public Boat() {
        place = "";
    }

    public Boat(String harborName) {
        place = harborName;
    }

    public void harborAt(String harborName) {
        place = harborName;
    }

    @Override
    public void putDieselEngine(int capacity) {
        System.out.println("Putting im engine " + capacity + "cc in engine chamber.");
    }

    public void currentHarbor() {
        System.out.println("Home harbor for this boat: " + place);
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String h) {
        place = h;
    }

    public static void main(String[] args) {
        Boat b = new Boat();
        b.goForward(30);
        b.harborAt("Inchon");
        b.currentHarbor();
    }
}
