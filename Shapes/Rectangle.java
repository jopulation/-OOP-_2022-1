public class Rectangle implements Drawable {
    private int width;
    private int height;

    public Rectangle() {
        width = 0;
        height = 0;
    }

    @Override
    public void draw() {
        System.out.println(width + " x " + height);
    }
}



