### 01/14

# 01/14 자바 개발 환경 구성
## 1. 자바 설치
```
- java.sun.com 접속
- 우측 java SE 선택
    - 왼쪽 자바 아이콘 선택  
    - 라이센스 동의 후
    - OS에 적합한 자바 버전 다운
    	- x86 : 32bit 
	- x64 : 64bit
- 편집툴(개발툴) 설치 - IDE(integrated development environment)
   : Eclipse - www.eclipse.org
   : NetBeans
   : JBuilder
   : 메모장, UltraEditor, EditorPlus ...
```

## 2. 자바 코드 생성, 실행

* 자바 코드가 만족해야할 기본 조건
	- 하나 이상의 클래스가 존재
	- 파일에 확장자가 .java
	- 파일명이 클래스명과 동일
	- 하나의 파일에 두개이상의 클래스 생성이 가능
		(public class 명이 파일명이 되어야 함)


* 자바 컴파일 및 실행
  - 컴파일 : javac.exe 사용
    javac FileName.java
   => 결과물 - FileName.class

  - 실행   : java.exe 사용
    java FileName   (.class 파일이 사용)


* CLI 환경에서의 명령어
  - cd : 디렉토리 변경
  - dir : 디렉토리 내용보기
  - cls : clear screen
  - d: , c:   드라이브 변경   


## 3. 변수 ?

     int x       = 10;
   (변수 선언    할당)

## 4. 자바의 기본자료형 

   - 정수형 : byte - short - int - long  : default int
            (1byte)  (2 )   (4 )  ( 8 )

   - 실수형 : float - double , default double

   - 문자형 : char  ex) char c = 'A';  char c = 65;

   - boolean : true , false


5. 자바에서의 "=" 의미

  - 기본자료형만 값이 넘어감

  - 기존자료형 이외에 나머지는 모두 주소값이 넘어감



### 01/15

1. OOP(객체지향형 프로그래밍)는 왜 필요??

   - 유지 보수 관리가 편리한 프로그램 -> OOP

   - object는 무엇?

     : 메모리에 올라간 클래스

     : 특정 클래스 메모리에 올리는 문법

      => Test t = new Test();


* 컴퓨터 구조에서 CPU는 하드디스크에 있는 내용을

  읽을 수 없음.  RAM(메모리)에 있는 내용만 읽을 수 있음
  
  자바에서는 메모리에 변수나 메소드를 올려줄때 
  
  해당 되는 변수,메소드가 포함된 클래스를 통채로 올려줌
  
 - 객체(Object)는 무엇?
    => 메모리에 올라간 클래스!!  


2. static  

   프로그램이 시작될 때 제일 처음 스스로 메모리에 단 한번 올라가며
   프로그램이 끝날 때까지 존재

   : 대표적인 static method => main method


3. 객체지향형 프로그램의 출발점

  - 모든 멤버변수 private 선언
  - public 접근제한자를 가지는 getXXX, setXXX 메소드 구현



### 01/16

1. 조건문

   ``` java
   if (조건문) {
       [참일 경우 실행]
   } else {
       [거짓일 경우 실행]
   } 
   ```

   : switch ~ case 문

    ```java
   int x = 10;
   
   switch( x ) {
   	case 10:
   		[10일 경우 실행]
   		break;
       case 9:
           [9일 경우 실행]
           break;
   }
    ```

   

  * switch ~case 문의 경우 지정된 값이 특정 case에 해당되면 
    하위 case를 모두 실행, 따라서 특정 case만 실행 후 종료 하기위해 
    break 문을 사용


2. 연산자

   : ++, -- 
   : +=, -=
   : &&, &, ||, |   => 두 개 모인놈이 더 똑똑


  && - 앞에 조건이 false 라면 뒤에 조건 확인 하지 않음
  &  - 앞의 조건에 상관없이 뒤에 조건 확인

  || - 앞에 조건이 true 라면 뒤에 조건 확인 하지 않음
  |  - 앞의 조건에 상관없이 뒤에 조건 확인


3. 반복문
    : for
    : while, do~while 

4. 배열

(1) int[] x = {10,20,30};

(2) int[] x = new int[3];
     x[0] = 10;
     x[1] = 20;
     x[2] = 30;

(3) int[] x = new int[]{10,20,30};


5. 메소드(method)  - 재활용 하기 위해서 사용, 중복되는 코드 제거


  * 정의방법
    접근제한자   리턴형    메소드이름  ( 파라미터)  {
    }

  public  int  add(int x, int y) {
       int result = x + y;
       return result;   	//리턴형이 존재하는 경우 필수
  }

 *접근제한자 종류 (4가지)
  public  - protected - default - private

 *리턴형 종류
 - 기본자료형
 - Object
 - void : 리턴값이 없는경우



### 01/17

1. 메소드 오버로딩 (Method Overloading) 

- 하나의 클래스 안에서 동일한 이름에 메소드 정의가 가능

- 이름이 동일하기 때문에 구분을 위해 메소드의 파라미터 종류 또는 개수가 달라야 함


2. 자바의 3대 생략 요소

 (1) extends Object
 (2) default Constructor
 (3) super()    - 모든 생성자의 첫번째 라인에 생략


3. 클래스의 3가지 구성요소
    (1) member variable
    (2) method
    (3) Constructor

4. 생성자(Constructor)

   - 이름은 클래스 이름과 동일
   - 메소드와 유사한 문법을 가지나 리턴형이 존재하지 않음
   - default constructor는 생략이 가능하나 다른 생성자가 하나라도 정의될 경우 생략 불가능
   - 생성자 overloading 가능

  * 생성자 사용의 가장 큰 목적은 멤버변수에 대한 초기화   


5. this()    

   - 현재 클래스의 생성자 호출
   - 생성자의 첫번째 라인에서만 사용가능

   * 일반 메소드 안에서는 사용 불가능


6. method overriding


  - 상위 클래스로부터 물려받은 메소드를 재정의

  - 문법적으로 물려받은 메소드를 그대로 사용해야 함
      (접근제한자는 상위보다 넓은 범위에 접근제한자로 변경이 가능)



### 01/18

1. String 클래스의 2가지 특징

  (1) 암시적인 객체 생성을 지원 
       String str = "ABC";   -> 가능

   * 문자열의 값 비교는 .equals()메소드 사용할것

  (2) 불변적인 특징을 가짐
      String name = "ABC";    //메모리에"ABC" 생성
      name = name + "D";      //메모리에 "ABCD" 추가생성
      name = name + "E";      //메모리에 "ABCDE"추가생성
      //최종적으로 "ABC", "ABCD", "ABCDE" 세 개가 메모리에 존재

  * 자바에서는 문법적으로 객체 할당(new)은 존재하나
      반대 개념인 객체해제는 문법적으로 존재하지 않음
    대신 GC(Gabage Collector)가 불필요한 메모리 자원을 해제해준다

  * 따라서 String class를 변경이 빈번하게 일어나는 문자열 저장을
      위해 사용하면 성능저하 또는 불필요한 메모리릭 문제가 생길 수 있음
    하드웨어 자원이 PC에 비해 상대적으로 부족한 모바일에서는
      문자열 변경이 자주 일어나는 경우에 String class를 사용하지 말것
      대신 StringBuffer class등을 사용할 것


2. StringTokenizer class


* 숫자 -> 문자열  :   숫자+""

  문자열 -> 숫자 

: 문자열 -> int 형으로
  Integer.parseInt( "7" );

: 문자열 -> double 형으로
  Double.parseDouble("0.3");

: 문자열 -> byte 형으로
  Byte.parseByte("10");



3. method overriding




* eclipse 기본 단축키

 - 한줄 지우기    : Ctrl + d

 - 주석 처리      : Ctrl + /

 - 들여쓰기 조정  : Ctrl + Shift + f

 - 자동 완성      : Ctrl + Space

 - import 	 : Ctrl + Shift + o

 - 실 행	         : Ctrl + F11



### 01/21

1. 지금까지의 줄거리?!

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


2.  abstract method / abstract class

  - 추상화 메소드 
      : 기능이 없는 메소드
    ex) abstract public void add();

  - 추상화 클래스
      : 한 개 이상의 추상화 메소드를 가지는 클래스
      : 객체화가 불가능

   : 추상화 클래스를 상속받은 클래스에서는
     추상화 메소드 오버라이딩이 강제된다.


3. 인터페이스(interface)


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


4. 자바 UI 구성

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



### 01/22

1. CallBack Method

  : 프로그래머가 호출해 주지 않음!!!
  : 시스템이 호출해 주는 메소드!!
  : 그러나 구현은 프로그래머가 해줌!!
  : 따라서 콜백메소드가 어떤 조건에서 호출되는지 파악할 것


2. 이벤트 처리(Event Handling)

   : 대상이 되는 이벤트 결정 (XXXEvent class)
   : 해당 이벤트를 감시해줄 감시자 결정 (XXXListener interface)
   : 감시자 구현 => 이벤트 발생시 구동되어야 할 코드 구현
   : 이벤트 대상 결정


3. inner class (내부 클래스)

  - 클래스 안에 클래스 정의
  - 내부 클래스 사용으로 인해 얻는 이점
      : 내부클래스 안에서 외부 클래스 멤버변수에 접근이 가능

  ex) class Outer {
	class Inner {  
                }
       }



4. 계산기 구현


* class간의 두가지 관계

  - is a 관계 : 상속관계 (extends)
  - has a 관계 : 멤버변수로 객체를 가짐





### 01/23


1.  자바에서 I/O 클래스 사용

  - 자바에 I/O(Input / Output) class는 크게 두 가지 부류 나뉨

  (1) byte stream 계열 : 1byte 단위로 데이터 입출력

    대표 클래스
    InputStream   : 1byte 단위로 read, 추상화 클래스
    OutputStream : 1byte 단위로 write, 추상화 클래스
    
    FileInputStream     :  1byte 단위로 파일에서 read
    FileOutputStream  :  1byte 단위로 파일에 write
    
    BufferedInputStream    :  버퍼 기능 제공 
    BufferedOutputStream : 버퍼 기능 제공 



* 문자열 -> 바이트배열   
  String str = "가나다";
  str.getBytes("euc-kr");

* 바이트배열 -> 문자열
  byte[] b = new byte[1024];
  String msg = new String( b , "euc-kr" );  

* flush() : buffer 있는 데이터 지금 출력
  trim()  : 빈 공백 제거



* 문자 입출력시 주의사항

  : 영문 / 숫자 / 기호 등은 1byte로 표현이 가능
   (아스키코드표에서 확인)

  : 한글은 1byte 표현이 불가능(아스키코드표에 없음!)

  : 한글을 표시하기 위한 규약인 character-set 은

    utf-8 / euc-kr 두 가지를 주로 사용


  : utf-8 - 한글 처리를 위해 3byte 사용

    euc-kr - 한글 처리를 위해 2byte 사용



### 01/24

1. 자바 I/O 클래스 -  character stream

    -대표클래스
    Reader : 문자 단위로 읽기 기능 제공, 추상화 클래스
    Writer  : 문자 단위로 쓰기 기능 제공, 추상화 클래스

    -파일에 입출력
    FileReader : 파일에서 문자 단위로 읽기
    FileWriter : 파일에 문자 단위로 출력


    BufferReader : 버퍼 기능제공, 
                   추가적으로 readLine() 메소드 제공
                   => 한줄 read  기능을 제공



2. Network class 사용(TCP 기반)

   - 자바에서 TCP 기반의 Network 통신을 위해서는
    Socket(종이컵) 클래스가 필요

   - 서버에서 종이컵(Socket) 생성방법
      ServerSocekt ss = new ServerSocket(포트번호);
      Socket server = ss.accept(); 

      accept() 메소드의 두 가지 기능 
      (1) 클라이언트의 접속을 대기
      (2) 클라이언트 접속이 이루어지면 Socket 객체 생성
      => blocking method


   - 클라이언트에서 종이컵(Socket) 생성방법
     Socket client  = new Socket("서버IP주소", 포트번호);



### 01/25

1. polymorphism

    - 클래스 상속관계 + 메소드 오버라이딩 + A a = new B(); 

2. 자바의 3대 생략요소

  (1) extends Object
  (2) default Constructor 
  (3) super()   -  모든 생성자의 첫번째 라인에 생략


3. 자바에서의 상속 

  - 단일 상속만 지원
  - 클래스 구성요소중 상속에 대상은 멤버변수 + 메소드(생성자 제외)

4. class의 3가지 구성요소
    (1) 멤버변수
    (2) 메소드
    (3) 생성자

5. 생성자
  - 클래스가 객체화 될때 단한번 호출
  - 생성자의 문법적인 특징은 메소드와 유사하나 리턴형이 없음
    생성자 이름은 클래스명과 동일
  - 생성자를 사용하는 가장 큰 이유는 멤버변수 초기화
  - 생성자 오버로딩이 가능



### 01/28

1. package / import

    package : 지정된 폴더에 특정 클래스들을 묶어주는 개념
    import : 지정된 폴더에 존재하는 class들을 사용


  * import javax.??.?? ; 

    import에 있어 지정된 폴더는 다음 네 가지 위치에서 검색이 된다.

  (1) 현재폴더
  (2) C:\Program Files\Java\jdk1.8.0_05\jre\lib\rt.jar //자바에서 제공되는 기본클래스
  (3) C:\Program Files\Java\jdk1.8.0_05\jre\lib\ext
  (4) classpath

  주의 : 윈도우 환경변수의 classpath 설정도 가능하나

         classpath 설정시 꼭 현재폴더를 의미하는 "."를 추가해줄 것


  * (콘솔에서)패키지가 적용되어 있는 소스를 컴파일 하고 실행할 경우

  - 루트 패키지가 존재하는 폴더에서 main 메소드를 가지는 class의

    경로를 지정하여 컴파일 및 실행

    ex) javac myPack/main/MyPackTest.java   -> myPack 폴더를 가지고 있는 폴더
  
        java myPack/main/MyPackTest


2. Exception (예외처리) 
   
    - 예외처리에 가장 큰 목적은 실행시 프로그램 종료 방지

    - 자바는 추정가능한 예외상황에 대비해 ***Exception class를 정의해 두었다

    - 특정 예외 상황이 발생하면 시스템은 해당 Exception class를 객체화 한다.

    - 발생되는 예외를 처리하기 직접 처리하기 위해서는 try{}catch {} 구문을 이용할 수 있으며 , 호출한곳으로 예외를 떠넘길 경우에는 throws 구문을 이용할 수 있다.

   - Exception class 자바의 모든 예외클래스의 최상위 클래스
    => Exception e = new XXXException();

   - 예외발생 후 try {} 구문의 나머지 코드는 실행되지 않음

   - e.printStackTrace();  //예외의 발생 경위 단계별로 출력

   - System.out.println( e );  //예외 종류만 간략히 출력

   - 여러 예외를 동시에 처리할 수 있는 다중 catch{} 구문이 지원되며 상위 클래스의 예외는 제일 마지막에 처리해 주어야 한다.

   - 예외 발생 여부와 상관없이 실행해 주고자 하는 코드가 있다면 finally{} 구문에 코딩


 - 실제 코딩시 예외 처리의 두 가지 방식
     - 실행시 예외가 발생 -> 해당 코드를 try catch
     - 코딩중 특정 클래스or메소드 사용시 컴파일에러
       => 예외처리를 강제



* www.sourceforge.net



### 01/29

1. Thread 왜쓰나? 특징은?

  - 하나의 앱 안에서 두 가지 이상의 작업을 처리해 줄 경우 사용

  - 실제 리얼타임에서 두 가지 작업이 동시에 처리되는 것은 아니며

    CPU가 아주 빠르게 두 가지 작업을 전환하며 처리해주므로

    동시에 처리되는것 처럼 보일뿐


2. Thread 사용을 위한 문법적인 두 가지 방법


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
	public void run() {
              	      while( 변수 ) {}   //변수값을 사용해 제어
	}


3. 동기화 문제? 해결법


  - 두 개이상의 Thread가 하나의 자원을 공유해서 사용하면

    무조건 동기화 문제가 발생


  - 해결방안 : 하나의 thread가 공유 자원에 접근하고 있을경우

               다른 thread가 접근하지 못하게 제어

  - 자바에서는 Thread 동기화 문제 해결을 위해 synchronized 문법을 제공함

   - synchronized 문법은 하나의 Thread가 동기화 문제 발생 코드에 접근할 경우 다른 Thread는 접근이 불가능하게 블럭

     synchronized( ? ) {
             ....
             ....
     }

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





### 01/30

1. Thread 동기화 처리로 인한 비공정성 문제 해결

   - 비공정성 문제 해결을 위해 wait(), notify() 메소드를 이용 Thread를 적절히 제어 해준다.

   - wait() : 열쇠를 반납하고!!!! 대기 상태로 보내짐
              synchronized 블럭안에서만 사용이 가능
        (왜나하면 열쇠를 가지고 있다는게 전제되어져야 하므로)

   - notify() : 대기상태에 있는 Thread중 하나를 ready 상태로 보냄

   - notifyAll() : 대기상태에 있는 모든 Thread를 ready 상태로 보냄


*주의 : wait(), notify(), notifyAll() , Object 클래스에 정의되어 있는 메소드임, Thread 클래스에 정의된 메소드가 아님. 결론적으로 자바의 모든 클래스에서는 wait(), notify(), notifyAll() 메소드 사용이 가능


2. Thread 사용에 있어 동기화 처리 유의성

   - 되도록이면 동기화 처리 문법(synchronized)을 사용하지 말자!!  
     대신 로직으로 해결할 것
     동기화 처리를 할 경우 성능하락을 감수해야 함

   - 마지막 해결책으로 동기화 처리를 할것
     동기화 처리 블럭은 문제의 소지가 있는 최소한의 코드만!


3. 멀티채팅 구현 시작

    - Server Part
      : 클라이언트의 접속을 지속적으로 대기 Thread 필요
      : n개의 client에서 보내오는 메시지 수신 - N 개의 Thread 필요
        -> 수신된 메시지를 (모든)n개의 클라이언트로 전송
    
    - Client Part
      : Server로 데이터 전송 - thread
      : Server에서 데이터 수신 - thread
      : 두 개의 Thread가 필요


   - 서버 파트 기능
     : 클라이언트에 접속을 대기
     : 모든 클라이언트 관리(Socket 관리) - ArrayList 사용
     : 특정 클라이언트가 보내는 메시지 지속적으로 수신(read)
      -> 해당 메시지를 모든 클라이언트에게 전송(write)
     : 서버에서는 1 + n(클라이언트의 수) Thread 필요

   - 클라이언트 파트 기능
     : 서버에게 데이터 전송(write)
     : 서버에서 보내오는 메시지 지속적으로 수신(read)
     : 2개의 Thread 필요







### 01/31

1. 멀티채팅 구현
   - UI focus 가져오기
      requestFocus(); 메소드 사용
   - 간단한 팝업 UI 사용
      JOptionPane.showInputDialog("닉네임을 입력해 주세요");



### 02/01

1. 멀티채팅 예외 처리


   - 서버 part

    : 클라이언트 종료시 해당 클라이언트를 담당하던 Thread에 대한 종료
    
    : 종료된 클라이언트에 연결된 Socket(종이컵) 정리
    
    : 동기화 처리(서버파트 Thread 공유자원 사용)


   - 클라이언트 part

    : 종료 처리(프로그램 종료시 서버로 접속해제 메세지 전송)



 * 자원해제 - Socket, I/O 클래스는 close() 메소드를 지원

 * 종이컵(Socket)에서 실 역할을 하는 I/O 클래스를 가져오면
    모두 byteStream 계열이 넘어옴

   주고 받는 데이터가 모두 문자라는 전제가 주어진다면
    CharacterStream 계열로 변경하여 사용하면 코드 작성을 
   효율적으로 할 수 있게 됨.
    ByteStream -> CharacterStream 변경을 위해 InputStreamReader 사용

 * InputStreamReader class

   - ByteStream -> CharacterStream 계열로 변환
   - ex) new InputStreamReader( 소켓객체.getInputStream(), "euc-kr" );


2. 멀티채팅 동기화 문제 해결

    synchronized (Server.total_socket) { 
    // (2) 수신된 데이터 모든 클라이언트에게 전송				
    for (int i = 0; i < Server.total_socket.size(); i++) {
     //...
    }


3. 핵심 내용 정리

  - class, object, this, super, overriding, overloading 

    constructor, String, StringBuffer, Stringtokenizer, abstract method,

    abstract class, interface, extends, Thread, I/O class

    Socket, private, public

  - 과정 최 우선 목표
	
	class A {}
	class B extends A{}

	A a = new B();  // 가능
	B b = new A(); // 불가능


