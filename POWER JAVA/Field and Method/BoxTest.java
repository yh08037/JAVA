
class Box {
    private int width;
    private int length;
    private int height;

    Box(int w, int l, int h) {
        width = w;
        length = l;
        height = h;
    }

    int getVolume() {
        return width * length * height;
    }

    void print() {
        System.out.println("폭 : " + width + ", 길이 : " + length + ", 높이 : " + height);
    }
}

public class BoxTest {
    public static void main(String[] args) {
        Box box1 = new Box(100, 100, 100);
        System.out.println(box1.getVolume());

        Box box2 = new Box(200, 200, 200);
        box1 = box2;

        box1.print();
    }
}
