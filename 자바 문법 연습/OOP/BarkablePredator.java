
/*
public interface BarkablePredator {
    public String getFood();
    public void bark();
}
*/

public interface BarkablePredator extends Barkable, Predator {
    // 인터페이스는 다중 상속이 가능하다!!!!
}
