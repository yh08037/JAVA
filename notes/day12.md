
# 01/29 : Thread, Synchronized 

## 1. Thread 왜쓰나? 특징은?

  - 하나의 앱 안에서 두 가지 이상의 작업을 처리해 줄 경우 사용

  - 실제 리얼타임에서 두 가지 작업이 동시에 처리되는 것은 아니며

    CPU가 아주 빠르게 두 가지 작업을 전환하며 처리해주므로

    동시에 처리되는것 처럼 보일뿐


## 2. Thread 사용을 위한 문법적인 두 가지 방법


  - 첫번째 : Thread class 상속받아서 class 정의

  - 두번째 : Runnable interface를 implements 

  * Thread가 처리해주어야 하는 작업은 public void run() 메소드에 
    구현해 주어야 함

  * 특정 Thread 구동을 위해서는 start()  메소드를 호출
    단, start 메소드 호출이 Thread (작업)시작을 의미하지는 않으며
    현재 특정 아무런 Thread도 running 상태에 존재하지 않는다면
    그 때 cpu의 제어권을 얻어 실행 될 수 있다.

  * run 메소드를 직접 호출을 할 경우에는 Thread로서 동작되지 않으며
    해당 메소드를 호출해주는 thread에 의해(일반적으로 main thread)
    구동되므로 Thread 구동은 start 메소드를 사용할것   
    (run method는 콜백메소드 이다)

  * Thread 를 정지해 줄 경우 stop() 메소드를 사용하지 않고
    로직으로 해결 해줄 것

    ex: 
    ~~~java
	public void run() {
              	      while( 변수 ) {}   //변수값을 사용해 제어
	}
    ~~~

## 3. 동기화 문제? 해결법


  - 두 개이상의 Thread가 하나의 자원을 공유해서 사용하면

    무조건 동기화 문제가 발생


  - 해결방안 : 하나의 thread가 공유 자원에 접근하고 있을경우

               다른 thread가 접근하지 못하게 제어

  - 자바에서는 Thread 동기화 문제 해결을 위해 synchronized 문법을 제공함

   - synchronized 문법은 하나의 Thread가 동기화 문제 발생 코드에 접근할 경우 다른 Thread는 접근이 불가능하게 블럭
``` java
synchronized( ? ) {
     ....
     ....
}
```
? = 동기화를 필요로 하는 공유자원(객체)
     동기화 처리를 위한 방법 :  자바에서는 기본적으로 클래스에 보안을 위해 자물쇠 기능이 구현되어 있음. 디펄트로 자물쇠는 비활성화 상태임
     동기화(synchronized) 기능을 사용하여 클래스의 자물쇠를 활성화하게 되면 해당 블럭으로 진입하기 위해서는 자물쇠의 열쇠를 획득하여 진입하여야 함.

     기본적으로 열쇠는 하나만 존재하며 누구에게나 공유되어 있으나 하나의 Thread가 열쇠를 사용하여 블럭으로 진입 할 경우에는 다른 Thread에서는 열쇠를 획득할 수 없으므로 블럭내 진입이 불가능

    열쇠를 가지고 블럭내로 진입한 Thread가 작업 도중, cpu 제어권을 버리고 ready 상태로 가더라도 열쇠는 반환하지 않는다
    
    기본적으로 synchronized 문법은 Thread 클래스가 아닌곳에서도 사용이 가능. Thread에 클래스의 run메소드에서만 사용되는 것이 아님에 유의할 것!!!!

   * 메소드에 synchronized 처리를 할경우는
      synchronized (this) 와 같은 기능을 하게 됨

   * sleep() 메소드 실행시에는 열쇠를 가지고 자러감!!

    (열쇠를 반납하지 않음) 



