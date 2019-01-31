import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

// 멀티채팅 서버 thread 기능
// (1) 클라이언트에서 보내오는 메시지를 지속적으로 수신
// (2) 모든 클라이언트에게 수신된 메시지를 전송
class ServerThread extends Thread {
	
	Socket server;
	InputStream is;
	OutputStream os;
	
	public ServerThread(Socket server) throws IOException {
		this.server = server;
		is = server.getInputStream();
		os = server.getOutputStream();
	}
	
	public void run() {
		while (true) {
			// (1) 클라이언트에서 보내오는 메시지를 지속적으로 수신
			byte[] b = new byte[256];
			try {
				is.read(b);
				System.out.println(new String(b).trim());
			} catch (IOException e) {
				System.out.println("메시지 수신 오류");
				e.printStackTrace();
			}
			
			// (2) 모든 클라이언트에게 수신된 메시지(byte[] b)를 전송
			// 모든 클라이언트에세 메시지를 보내기 위해 각 클라이언트와 연결된 종이컵 필요
			
//			for (int i = 0; i < Server.total_socket.size(); i++) {
//				Socket temp = Server.total_socket.get(i);
//				temp.getOutputStream().write(b);
//			}
			for (Socket s:Server.total_socket) {
				try {
					s.getOutputStream().write(b);
				} catch (IOException e) {
					System.out.println("메시지 송신 오류");
					e.printStackTrace();
				}
			}
		}
	}
	
}

public class Server {
	
	// 각 Client와 연결된 종이컵 저장
	static ArrayList<Socket> total_socket = new ArrayList<Socket>();
	
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("[Server Start]");
		
		// 종이컵 역할을 하는 Socket 객체 생성
		ServerSocket s = new ServerSocket(8888);
		
		while (true) {
			// (1)클라이언트의 접속을 대기  (2)클라이언트 접속시 매칭되는 Socket 생성
			Socket server = s.accept();	
			
			// 생성된 종이컵 저장
			total_socket.add(server);
			
			// 현재 접속된 클라이언트를 담당할 Thread 생성 후 start
			new ServerThread(server).start();
			
		}
		
	}
	
}
