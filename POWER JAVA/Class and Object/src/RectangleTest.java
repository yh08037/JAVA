
class Rectangle {

    private int width;
    private int height;

    Rectangle(int w, int h) {
        this.width = w;
        this.height = h;
    }

    int area() {
        return width * height;
    }

    int perimeter() {
        return 2 * (width + height);
    }
}

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 5);
        System.out.println("area : " + rectangle.area());
        System.out.println("perimeter : " + rectangle.perimeter());
    }
}
