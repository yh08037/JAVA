import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

// ��Ƽä�� ���� thread ���
// (1) Ŭ���̾�Ʈ���� �������� �޽����� ���������� ����
// (2) ��� Ŭ���̾�Ʈ���� ���ŵ� �޽����� ����
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
			// (1) Ŭ���̾�Ʈ���� �������� �޽����� ���������� ����
			byte[] b = new byte[256];
			try {
				is.read(b);
				System.out.println(new String(b).trim());
			} catch (IOException e) {
				System.out.println("�޽��� ���� ����");
				e.printStackTrace();
			}
			
			// (2) ��� Ŭ���̾�Ʈ���� ���ŵ� �޽���(byte[] b)�� ����
			// ��� Ŭ���̾�Ʈ���� �޽����� ������ ���� �� Ŭ���̾�Ʈ�� ����� ������ �ʿ�
			
//			for (int i = 0; i < Server.total_socket.size(); i++) {
//				Socket temp = Server.total_socket.get(i);
//				temp.getOutputStream().write(b);
//			}
			for (Socket s:Server.total_socket) {
				try {
					s.getOutputStream().write(b);
				} catch (IOException e) {
					System.out.println("�޽��� �۽� ����");
					e.printStackTrace();
				}
			}
		}
	}
	
}

public class Server {
	
	// �� Client�� ����� ������ ����
	static ArrayList<Socket> total_socket = new ArrayList<Socket>();
	
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("[Server Start]");
		
		// ������ ������ �ϴ� Socket ��ü ����
		ServerSocket s = new ServerSocket(8888);
		
		while (true) {
			// (1)Ŭ���̾�Ʈ�� ������ ���  (2)Ŭ���̾�Ʈ ���ӽ� ��Ī�Ǵ� Socket ����
			Socket server = s.accept();	
			
			// ������ ������ ����
			total_socket.add(server);
			
			// ���� ���ӵ� Ŭ���̾�Ʈ�� ����� Thread ���� �� start
			new ServerThread(server).start();
			
		}
		
	}
	
}
