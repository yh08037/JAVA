
# 01/28 package/import와 예외처리

## 1. package / import

    package : 지정된 폴더에 특정 클래스들을 묶어주는 개념
    import : 지정된 폴더에 존재하는 class들을 사용


  * import javax.??.?? ; 

    import에 있어 지정된 폴더는 다음 네 가지 위치에서 검색이 된다.
```
  (1) 현재폴더
  (2) C:\Program Files\Java\jdk1.8.0_05\jre\lib\rt.jar //자바에서 제공되는 기본클래스
  (3) C:\Program Files\Java\jdk1.8.0_05\jre\lib\ext
  (4) classpath
```
  주의 : 윈도우 환경변수의 classpath 설정도 가능하나

         classpath 설정시 꼭 현재폴더를 의미하는 "."를 추가해줄 것


  * (콘솔에서)패키지가 적용되어 있는 소스를 컴파일 하고 실행할 경우

  - 루트 패키지가 존재하는 폴더에서 main 메소드를 가지는 class의

    경로를 지정하여 컴파일 및 실행

    ex) javac myPack/main/MyPackTest.java   -> myPack 폴더를 가지고 있는 폴더
  
        java myPack/main/MyPackTest


## 2. Exception (예외처리) 
   
- 예외처리에 가장 큰 목적은 실행시 프로그램 종료 방지

- 자바는 추정가능한 예외상황에 대비해 `Exception class`를 정의해 두었다

- 특정 예외 상황이 발생하면 시스템은 해당 `Exception class`를 객체화 한다.

- 발생되는 예외를 처리하기 직접 처리하기 위해서는 `try{} catch{}` 구문을 이용할 수 있으며 , 호출한곳으로 예외를 떠넘길 경우에는 `throws` 구문을 이용할 수 있다.

- Exception class 자바의 모든 예외클래스의 최상위 클래스

=> `Exception e = new XXXException();`

- 예외발생 후 try {} 구문의 나머지 코드는 실행되지 않음

- `e.printStackTrace();`  //예외의 발생 경위 단계별로 출력

- `System.out.println( e );`  //예외 종류만 간략히 출력

- 여러 예외를 동시에 처리할 수 있는 다중 `catch{}` 구문이 지원되며 상위 클래스의 예외는 제일 마지막에 처리해 주어야 한다.

- 예외 발생 여부와 상관없이 실행해 주고자 하는 코드가 있다면 `finally{}` 구문에 코딩


 - 실제 코딩시 예외 처리의 두 가지 방식
     - 실행시 예외가 발생 -> 해당 코드를 try catch
     - 코딩중 특정 클래스or메소드 사용시 컴파일에러
       => 예외처리를 강제



* www.sourceforge.net

