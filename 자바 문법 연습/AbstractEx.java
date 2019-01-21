abstract class abs {    // 추상화 클래스
    abstract public void printA();   // 추상화 메소드
}
// 추상화 클래스는 추상화 메소드를 적어도 하나 가지고 있는 클래스
// 추상 메소드는 바디{} 를 가지고 있으면 안되고 ; 로 끝맺어야한다

// 추상화 클래스의 특징
// (1) 객체화가 불가능하다!

abstract class Animal {
    abstract public void cry();
}

// 추상화 클래스를 사용함으로써 얻는 이점
// => 추상화 클래스는 하위 클래스에 추상화 메소드의 구현이 강제되어진다
// => "운다" 라는 기능의 메소드의 이름을 cry() 로 통일시킨다

//  class Pig extends Animal {    // 컴파일 오류 <= 추상화 메소드 구현이 강제되기 때문
//
//  }

class Dog extends Animal {
    public void cry() {
        System.out.println("개 울음");
    }
}

class Cat extends Animal {
    public void cry() {
        System.out.println("고양이 울음");
    }
}

public class AbstractEx {

    public static void main(String[] args) {
//      new Animal();   // 컴파일 오류 <= 추상화 클래스는 객체화가 불가능
    }

}
