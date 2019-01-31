import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


class ClientGUI extends JFrame {
	
	JTextField jf;	// 프레임
	JButton con;	// 접속 버튼
	JTextArea ja;	// 여러줄 표현
	Socket client;
	InputStream is;
	OutputStream os;
	String nick;
	
	class ClientThread extends Thread {
		int count = 0;
		public void run() {
			// 지속적으로 메세지 수신
			// 수신된 메세지 ja에 보여주기
			while (true) {
				byte[] b = new byte[256];
				try {
					is.read(b);
					String result = new String(b);
					count++;
	//				if (count % 10 == 0) {
	//					ja.setText("");
	//					count = 0;
	//				};
					ja.append(result.trim()+'\n');
				} catch (IOException e) {
					System.out.println("메세지 수신 오류");
					e.printStackTrace();
				}
			}
		}
	}
		
	
	class MyListener implements ActionListener {
		
		public void actionPerformed(ActionEvent arg0) {
			
			if (arg0.getActionCommand().equals("접속")) {
				// '접속' 버튼이 클릭 되었을 경우
				try {
					nick = JOptionPane.showInputDialog("닉네임을 입력해 주세요");
//					client = new Socket("155.230.57.60", 8888);
					client = new Socket("127.0.0.1", 8888);
					jf.setEditable(true);
					con.setEnabled(false);
					// 서버 접속 성공
					// -> 서버에서 보내오는 메시지 지속적으로 수신
					is = client.getInputStream();
					os = client.getOutputStream();
				
					new ClientThread().start();
					
				} catch (IOException e) {
					System.out.println("서버 접속 오류 발생");
					e.printStackTrace();
				}
			}else {
				// JTextFiled에 엔터키 입력이 되었을 경우
				String msg = "["+nick+"]"+ jf.getText();
				try {
					os.write(msg.getBytes());
					os.flush();	// flush()는 습관적으로 써주는 것이 좋다!
					jf.setText("");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	
	
	ClientGUI(String title) {
		super(title);	// 상위 클래스(JFrame)의 제목 설정
		jf = new JTextField(15);
		jf.setEditable(false);
		con = new JButton("접속");
		ja = new JTextArea(15, 15);
		
		MyListener m = new MyListener();
		con.addActionListener(m);
		jf.addActionListener(m);
		
		FlowLayout layout = new FlowLayout();
		setLayout(layout);
		
		add(jf);
		add(con);
		add(ja);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(300, 300);
		setSize(200, 300);
		setVisible(true);
	}
}
	


public class Client {
	
	public static void main(String[] args) throws IOException, UnknownHostException{
		
		// 종이컵 역할을 하는 Socket 객체 생성
//		Socket client = new Socket("155.230.57.11", 8888);
		new ClientGUI("채팅");
	}
	
}
