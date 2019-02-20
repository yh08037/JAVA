
class Circle {
    private int radius;
    private int cx;
    private int cy;

    int getRadius() {
        return radius;
    }

    void setRadius(int r) {
        radius = r;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(5);
        System.out.println(circle.area());
    }
}
