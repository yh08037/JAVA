import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {

        System.out.println("[Server Start]");

        // 서버 파트에서 사용할 종이컵(Socket) 클래스 생성 방법
        ServerSocket ss = new ServerSocket(8888);   // port 지정

        while (true) {
        	// accept() 메소드 역할
        	// (1) 클라이언트 접속 대기
        	// (2) 클라이언트 접속시 해당 클라이언트와 연결된 Socket을 리턴
        	// !! blocking method
            Socket server = ss.accept();

            InputStream is = server.getInputStream();	// !!중요!! 기억해주길...
            // class A{}
            // class B extends A{}
            // A x = new B(); 가능!! <= 상속관계 (is-a관계)            
            
            byte[] b = new byte[1024];
            is.read(b);
            String result = new String(b);
            System.out.println(result.trim());
        }
    }
}
