import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


// (1) 이번트 처리를 위한 기본적 방법 첫번째
class MListener implements ActionListener {
    JTextField jf;

    public MListener(JTextField j) {
        jf = j;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("버튼 클릭");
        jf.setText("버튼클릭");
    }
}

class MyFrame extends JFrame {

    // int x = 10; 이렇게 초기화하는 것 권장 X
    // 멤버 변수 초기화는 생성자에서 하는 것이 좋다!


    JTextField jf;
    JButton b, b2, eq;

    // (2) 이벤트 처리를 위한 두번째 방법(내부 클래스 사용)
    class MListener2 implements  ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            jf.setText("이벤트 처리 두번째 방법");
        }
    }

    // (3) 이벤트 처리를 위한 세번째 방법(익명 내부 클래스 사용)
    ActionListener m3 = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String result = e.getActionCommand();
//            if (result.equals("b")){
//                jf.setText("b");
//            }else if (result.equals("b2")) {
//                jf.setText("b2");
//            }
            switch (result) {
                case "b":
                    jf.setText("b");
                    break;
                case "b2":
                    jf.setText("b2");
                    break;
                case "=":
                    String temp = jf.getText();
                    CalLogic c = new CalLogic();
                    jf.setText(c.cal(temp));
                    break;
            }
        }
    };


    public MyFrame() {
        jf = new JTextField(10);
        jf.setText("텍스트 필드");

        b = new JButton("b");
        b2 = new JButton("b2");
        eq = new JButton("=");

//        MListener m = new MListener(jf);
//        MListener2 m = new MListener2();
        b.addActionListener(m3);

        // (4) m3 자리에 바로 넣기
//        b.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                jf.setText("이벤트 처리 네번째 방법");
//            }
//        });

        b2.addActionListener(m3);
        eq.addActionListener(m3);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlowLayout layout = new FlowLayout();
        setLayout(layout);

        add(jf);    // this. 생략
        add(b);     // this. 생략
        add(b2);    // this. 생략
        add(eq);

        this.setSize(200, 100);
        this.setLocation(200, 200);
        this.setVisible(true);
    }
}

public class EventEx {

    public static void main(String[] args) {

        new MyFrame();

    }

}
