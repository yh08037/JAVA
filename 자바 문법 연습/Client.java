import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JTextField;

class ClientGUI extends JFrame{
	JTextField jf;
	
	ActionListener myListener = new ActionListener() {	//익명 내부 클래스
		@Override
		public void actionPerformed(ActionEvent e) {
			// 클라이언트세어 사용될 종이컵(socket) 생성 방법
		    try {	
			    Socket client = new Socket("155.230.57.60", 8888);
		        
		        OutputStream os = client.getOutputStream();
		        String msg = jf.getText();
		        os.write(msg.getBytes());
		        jf.setText("");	// jf 초기화
			}catch(Exception ee) {
				System.out.println("서버 데이터 전송 중 예외 발생");
			}
		}
	};
	
	// Actionlistener는 인터페이스이다!!
	// interface A{}
	// class B implements A{}
	// A x = new B(); 가능!!!
	
	ClientGUI() {
		super("채팅 Client");
		jf = new JTextField(10);
		jf.addActionListener(myListener);
		add(jf);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200, 100);
		setLocation(300, 300);
		setVisible(true);
	}
}


public class Client {

    public static void main(String[] args) throws UnknownHostException, IOException{
    	
    	new ClientGUI();
    	
    	
//    	// 클라이언트세어 사용될 종이컵(socket) 생성 방법
//        Socket client = new Socket("155.230.57.60", 8888);
//        
//        OutputStream os = client.getOutputStream();
//        String msg = "메세지 내용";
//        os.write(msg.getBytes());
    }

}
