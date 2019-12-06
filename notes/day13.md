
# 01/30 : Thread 동기화 처리와 비공정성 

## 1. Thread 동기화 처리로 인한 비공정성 문제 해결

   - 비공정성 문제 해결을 위해 wait(), notify() 메소드를 이용 Thread를 적절히 제어 해준다.

   - wait() : 열쇠를 반납하고!!!! 대기 상태로 보내짐
              synchronized 블럭안에서만 사용이 가능
        (왜나하면 열쇠를 가지고 있다는게 전제되어져야 하므로)

   - notify() : 대기상태에 있는 Thread중 하나를 ready 상태로 보냄

   - notifyAll() : 대기상태에 있는 모든 Thread를 ready 상태로 보냄


*주의 : wait(), notify(), notifyAll() , Object 클래스에 정의되어 있는 메소드임, Thread 클래스에 정의된 메소드가 아님. 결론적으로 자바의 모든 클래스에서는 wait(), notify(), notifyAll() 메소드 사용이 가능


## 2. Thread 사용에 있어 동기화 처리 유의성

   - 되도록이면 동기화 처리 문법(synchronized)을 사용하지 말자!!  
     대신 로직으로 해결할 것
     동기화 처리를 할 경우 성능하락을 감수해야 함

   - 마지막 해결책으로 동기화 처리를 할것
     동기화 처리 블럭은 문제의 소지가 있는 최소한의 코드만!


## 3. 멀티채팅 구현 시작

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
