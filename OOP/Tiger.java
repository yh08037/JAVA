
// Predator 인터페이스의 구현체 Tiger

// public class Tiger extends Animal implements Predator, Barkable {
public class Tiger extends Animal implements BarkablePredator {
    public String getFood() {
        return "apple";
    }

    public void bark() {
        System.out.println("어흥");
    }
}
