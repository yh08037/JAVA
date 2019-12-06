
# 01/24 : 멀티채팅 프로그램 2

## 1. 자바 I/O 클래스 -  character stream

    -대표클래스
    Reader : 문자 단위로 읽기 기능 제공, 추상화 클래스
    Writer  : 문자 단위로 쓰기 기능 제공, 추상화 클래스

    -파일에 입출력
    FileReader : 파일에서 문자 단위로 읽기
    FileWriter : 파일에 문자 단위로 출력


    BufferReader : 버퍼 기능제공, 
                   추가적으로 readLine() 메소드 제공
                   => 한줄 read  기능을 제공



## 2. Network class 사용(TCP 기반)

   - 자바에서 TCP 기반의 Network 통신을 위해서는 Socket(종이컵) 클래스가 필요

   - 서버에서 종이컵(Socket) 생성방법
      ``` java
      ServerSocekt ss = new ServerSocket(포트번호);
      Socket server = ss.accept(); 
      ```
      `accept()` 메소드의 두 가지 기능 

      (1) 클라이언트의 접속을 대기

      (2) 클라이언트 접속이 이루어지면 `Socket` 객체 생성

       => blocking method


   - 클라이언트에서 종이컵(Socket) 생성방법
     ``` java
     Socket client  = new Socket("서버IP주소", 포트번호);
     ```
