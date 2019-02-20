
class Average {
    double getAverage(int a, int b) {
        return (a + b) / 2;
    }
    double getAverage(int a, int b, int c) {
        return (a + b + c) / 3;
    }
}

public class AverageTest {
    public static void main(String[] args) {
        Average avg = new Average();
        System.out.println(avg.getAverage(10, 20));
        System.out.println(avg.getAverage(10, 20, 40));
    }
}
