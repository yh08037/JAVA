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
	
	JTextField jf;	// ������
	JButton con;	// ���� ��ư
	JTextArea ja;	// ������ ǥ��
	Socket client;
	InputStream is;
	OutputStream os;
	String nick;
	
	class ClientThread extends Thread {
		int count = 0;
		public void run() {
			// ���������� �޼��� ����
			// ���ŵ� �޼��� ja�� �����ֱ�
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
					System.out.println("�޼��� ���� ����");
					e.printStackTrace();
				}
			}
		}
	}
		
	
	class MyListener implements ActionListener {
		
		public void actionPerformed(ActionEvent arg0) {
			
			if (arg0.getActionCommand().equals("����")) {
				// '����' ��ư�� Ŭ�� �Ǿ��� ���
				try {
					nick = JOptionPane.showInputDialog("�г����� �Է��� �ּ���");
//					client = new Socket("155.230.57.60", 8888);
					client = new Socket("127.0.0.1", 8888);
					jf.setEditable(true);
					con.setEnabled(false);
					// ���� ���� ����
					// -> �������� �������� �޽��� ���������� ����
					is = client.getInputStream();
					os = client.getOutputStream();
				
					new ClientThread().start();
					
				} catch (IOException e) {
					System.out.println("���� ���� ���� �߻�");
					e.printStackTrace();
				}
			}else {
				// JTextFiled�� ����Ű �Է��� �Ǿ��� ���
				String msg = "["+nick+"]"+ jf.getText();
				try {
					os.write(msg.getBytes());
					os.flush();	// flush()�� ���������� ���ִ� ���� ����!
					jf.setText("");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	
	
	ClientGUI(String title) {
		super(title);	// ���� Ŭ����(JFrame)�� ���� ����
		jf = new JTextField(15);
		jf.setEditable(false);
		con = new JButton("����");
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
		
		// ������ ������ �ϴ� Socket ��ü ����
//		Socket client = new Socket("155.230.57.11", 8888);
		new ClientGUI("ä��");
	}
	
}
