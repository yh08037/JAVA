import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;


public class Client {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		// 종이컵 역할을 하는 Socket 객체 생성
		Socket client = new Socket("155.230.57.11", 8888);
		
	}
	
}
