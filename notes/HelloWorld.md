# 예제1. HelloWorld.java

```java
public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello World!");
    }
}
```

자바 프로그램들은 클래스들의 모임으로 구성됩니다. 필요한 클래스를 하나씩 만들어감으로써 전체 프로그램이 완성됩니다.
일반적으로 하나의 소스 파일은 하나의 public 클래스를 포함합니다. 하나의 클래스 안에는 여러개의 메소드가 포함될 수 있으며, 하나의 메소드 안에는
여러개의 문장이 포함될 수 있습니다.

## 클래스 정의

```java
public class HelloWorld {
    ~~~
}
```
class 키워드는 HelloWorld라는 클래스의 정의를 시작한다는 것을 나타냅니다.


public 키워드는 HelloWorld 클래스가 다른 클래스에서도 사용가능함을 나타냅니다.


### 메소드 정의

```java
    public static void main(String[] args){
        ~~~
    }
```
클래스는 메소드와 변수로 이루어집니다. 메소드는 입력을 받아서 작업을 수행하고 결과를 내보내는, 클래스 내부의 함수라고 볼 수 있습니다.
main()메소드는 특히 프로그램 실행의 시작점이 된다는 점에서 특별합니다. 모든 다른 메소드는 main()메소드로부터 호출됩니다.
main()메소드는 String[] args 라는 매개변수를 가집니다. 매개변수란 외부의 데이터를 메소드로 전달하는 수단입니다. 또한 String은 그 데이터의 타입이
문자열이라는 것을 나타냅니다.

### 문장
```java
        System.out.println("Hello World!");
```
System 클래스는 자바에서 기본적으로 제공하는 클래스입니다. 이 클래스의 메소드 중 하나인 println()은 값을 출력하고 줄바꿈을 하지만,
또다른 메소드인 print()는 값을 출력하고 줄바꿈을 하지 않습니다.
