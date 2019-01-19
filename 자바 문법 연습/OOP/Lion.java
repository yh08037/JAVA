
// Predator 인터페이스의 구현체 Lion

// public class Lion extends Animal implements Predator, Barkable {
public class Lion extends Animal implements BarkablePredator {
    public String getFood() {
        return "banana";
    }

    public void bark() {
        System.out.println("으르렁");
    }
}
