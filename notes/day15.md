
# 02/01 멀티채팅 예외 처리와 동기화 문제 처리

## 1. 멀티채팅 예외 처리


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


## 2. 멀티채팅 동기화 문제 해결

    synchronized (Server.total_socket) { 
    // (2) 수신된 데이터 모든 클라이언트에게 전송				
    for (int i = 0; i < Server.total_socket.size(); i++) {
     //...
    }


## 3. 핵심 내용 정리

  - class, object, this, super, overriding, overloading 

    constructor, String, StringBuffer, Stringtokenizer, abstract method,

    abstract class, interface, extends, Thread, I/O class

    Socket, private, public

  - 과정 최 우선 목표
	
	class A {}
	class B extends A{}

	A a = new B();  // 가능
	B b = new A(); // 불가능


