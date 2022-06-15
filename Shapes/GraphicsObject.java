abstract public class GraphicsObject {
    private double x;
    private double y;

    public GraphicsObject() {
        x = 0;
        y = 0;
    }

    public void printStatus() {
        System.out.println(x);
        System.out.println(y);
    }

    abstract public void draw();
}
