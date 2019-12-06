# 01/21 추상 클래스, 인터페이스, UI

## 1. 지금까지의 줄거리?!

  - Class / Object
  - 기본자료형
  - 자바에서 "=" 의미
  - static
  - 제어문(if), 반복문(for)
  - 배열 
  - 클래스의 구성요소
      (생성자,변수,메소드)
  - overloading / overriding
  - 자바의 3대 생략 요소
  - 상속(extends), super, this
  - GC는 무엇인가?
  - String class 특징
  - StringTokenizer class


## 2.  abstract method / abstract class

### 추상 메소드 
기능이 없는 메소드

ex) 
``` java
abstract public void add();
```

### 추상 클래스
한 개 이상의 추상 메소드를 가지는 클래스 => 객체화가 불가능하다.

추상 클래스를 상속받은 클래스에서는 추상 메소드 오버라이딩이 강제된다.


## 3. 인터페이스(interface)


  : 전부 추상화 메소드 + 상수로만 구성
  : 객체화가 불가능
  : implements 를 사용 하위 클래스에서 구현해서 사용

  : 자바의 단일상속을 보완하기 위해 사용
   ex) class Test  implements Inter {
        }

   : class는 기능을 중심으로 이름을 결정해주지 않으나
    interface는 기능을 중심으로 이름을 결정하기도 한다

   ex) class Run{}   -> 권장되지 않음
       interface Run{} -> 가능


## 4. 자바 UI 구성

  - 화면 구성
    UI 크기 / 위치
    : setSize() = 크기 결정
    : setLocation() = 위치 결정

  - 다양한 해상도를 가지는 화면에서 동일한 화면 구성을

    보여주기 위해 화면 구성 정책을 적용할 수 있음(Layout)

  - 대표적인 Layout 

    FlowLayout / BorderLayout / GridLayout/ GridBagLayout/ CardLayout

    FlowLayout : 화면에 배치되는 순서대로 UI를 배치

    BorderLayout : 화면을 동/서/남/북/센터로 나누어서 UI를 배치

    GridBagLayout : FlowLayout과 더불어 제일 많이 사용되는 Layout

	    일반적으로 IDE 툴 사용시 layout=null 상태에서

	    화면 구성을 한 뒤 GridBagLayout으로 layout을

	    변경하는 방식으로 많이 사용됨

	    화면에 위치를 가장 자유롭게 구성할 수 있음

  - Layout 정책 적용 = JFrame class의 setLayout() 메소드 사용


  - px 값을 사용 절대적인 크기/위치를 구성하고자 한다면 

    현재 Container에 설정된 Layout을 삭제 -> setLayout(null)

