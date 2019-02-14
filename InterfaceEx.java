interface InterA {
    // 인터페이스는 추상화  메소드 + 상수로 이루어짐

//  final int AGE = 10;  인터페이스에서 상수 선언은 final 생략 가능
//  abstract public void printA();  인터페이스에서 추사화 메소드 선언은 abstract 생략 가능

    int AGE = 10;   // 상수의 변수명은 대문자로 쓰는게 관례
    public void printA();
}

// interface 사용을 위해 "extends" 대신 "implements" 사용
// 인터페이스는 다중 상속을 지원한다!
// 클래스는 모두 명사개념으로 만들지만 인터페이스는 동사개념으로 만들기도 한다

class InterClass implements InterA {
    @Override   // 지능형 주석
    public void printA() {

    }
}

public class InterfaceEx {

    public static void main(String[] args) {

    }

}
