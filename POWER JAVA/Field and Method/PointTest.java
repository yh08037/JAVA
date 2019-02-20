class Point {
    private int x;
    private int y;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
}

public class PointTest {
    public static void main(String[] args) {
        Point point1 = new Point();
        point1.setX(10);
        point1.setY(20);
        System.out.println(point1.getX());
        System.out.println(point1.getY());
    }
}
