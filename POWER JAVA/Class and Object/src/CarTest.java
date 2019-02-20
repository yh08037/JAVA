
class Car {

    String color;
    int speed;
    int gear;
    void print() {
        System.out.println(color + ", " + speed + ", " + gear);
    }
}

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.color = "red";
        car1.speed = 0;
        car1.gear = 1;
        car1.print();

        Car car2 = new Car();
        car2.color = "blue";
        car2.speed = 60;
        car2.gear = 3;
        car2.print();
    }
}