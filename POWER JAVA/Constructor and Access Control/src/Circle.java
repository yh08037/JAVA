public class Circle {
    private double radius;
    static final double PI = 3.141592;

    Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    private double square(double num) {
        return num * num;
    }

    public double getArea() {
        return PI * this.square(this.getRadius());
    }

    public double getPerimeter() {
        return 2 * PI * this.getRadius();
    }

    public static double getPI() {
        return PI;
    }

    public static void main(String[] args) {
//      square(10.0); // 에러 : 정적 메소드에서 인스턴스 메소드를 호출하려했기 때문

        // Non-static method "square(double)" cannot be referenced from a static method
        // 인스턴스 메소드인 square() 는 정적 메소드로부터 참조되어질 수 없다

        System.out.println(getPI());

        // getPI() 는 정적 메소드이므로 정적 메소드인 main 에서 호출할 수 있다
    }
}
