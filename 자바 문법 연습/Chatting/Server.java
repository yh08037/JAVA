import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
	
	public static void main(String[] args) throws IOException {
		
		// 종이컵 역할을 하는 Socket 객체 생성
		ServerSocket s = new ServerSocket(8888);
		// (1)클라이언트의 접속을 대기  (2)클라이언트 접속시 매칭되는 Socket 생성
		Socket server = s.accept();	
		
	}
	
}
