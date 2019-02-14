public interface Predator {
    public String getFood();
    // 인터페이스에는 메솓의 이름과 입출력에 대한 정의만 있고 그 내용은 없다.
    // 그 이유는 인터페이스는 규칙이기 때문이다.
    // 위에서 설정한 getFood 라는 메소드는
    // 인터페이스를 implements 한 클래스들이 구현해야하만하는 것이다.
}
