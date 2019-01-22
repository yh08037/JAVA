import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 버튼 클릭을 감시하기 위한 감시자 정의
class MyListener implements ActionListener {

    @Override   // 지능형 주석은 메소드를 오버라이딩할 때 메소드 이름이 똑같이 만들어졌는지 확인해준다
    public void actionPerformed(ActionEvent e) {
        // CallBack 메소드 : 우리가 호출하는 것이 아니라 시스템이 호출하는 메소드
        // 현재 메소드는 버튼이 클릭되었을 경우에 호출
        System.out.println("C버튼 클릭");
    }
}

// CallBack Method : 프로그래머가 호출하지 않고 시스템이 호출하는 메소드
// 그러나 구현은 프로그래머가 함 -> 메소드가 언제 호출되는지 정확히 파악할 것!


class CalGUIB extends JFrame {

    CalLogic logic;

    CalGUIB() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLocation(300, 300);

        // this.setSize(500, 500); == setSize(500, 500);
        // this. 는 생략 가능!! 아무것도 없이 메소드만 나온다면 그 메소드는 현재 클래스의 것!!

        // UI 배치 관리자
        FlowLayout layout = new FlowLayout();
        setLayout(layout);  // 현재 클래스(JFrame)에 배치관리자 설정

        JTextField jf = new JTextField(20);


//        JButton b0 = new JButton("0");
//        JButton b1 = new JButton("1");
//        JButton b2 = new JButton("2");
//        JButton b3 = new JButton("3");
//        JButton b4 = new JButton("4");
//        JButton b5 = new JButton("5");
//        JButton b6 = new JButton("6");
//        JButton b7 = new JButton("7");
//        JButton b8 = new JButton("8");
//        JButton b9 = new JButton("9");
//
//        add(jf);
//        this.add(b7);
//        this.add(b8);
//        this.add(b9);
//        this.add(b4);
//        this.add(b5);
//        this.add(b6);
//        this.add(b1);
//        this.add(b2);
//        this.add(b3);
//        this.add(b0);

        // 반복되는 코드 줄이기!!

        JButton[] b = new JButton[10];

        for (int i = 0; i < 10; i++) {
            b[i] = new JButton(i+"");
        }

        add(jf);
        for (int i = 7; i >= 1; i-=3) {
            for (int j = 0; j < 3; j++) {
                int temp = i + j;
//                b[temp] = new JButton(temp + "");
                add(b[temp]);
            }
        }
        add(b[0]);

//        add(jf);
//        for (int i = 0; i < 10; i++) {
//            b[i] = new JButton(i + "");
//            add(b[i]);
//        }

        JButton c = new JButton("C");
        c.setBackground(Color.RED);
        add(c);


        // 버튼 클릭 감시를 위한 MyLIstener 객체화
        MyListener m = new MyListener();
        c.addActionListener(m);

        this.setVisible(true);
    }

}

class CalGUI {
    JFrame frame;    // = new Frame(); 권고 X -> 멤버 변수 초기화는 생성자로 하라!

    CalGUI() {
        frame = new JFrame();   // 계산기 화면의 판때기
        frame.setLayout(null);  // 판때기 배치관리자 무효화
        // 종료기능 활성화
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton b0 = new JButton("0");           // 판때기에 넣을 버튼
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");


        b0.setLocation(0,0);
        b0.setSize(50, 50);
        b1.setLocation(70,0);
        b1.setSize(50, 50);
        b2.setLocation(140,0);
        b2.setSize(50, 50);

        frame.add(b0);                                 // 판때기에 버튼 추가
        frame.add(b1);
        frame.add(b2);


        frame.setLocation(0, 0);            // 판때기 위치 결정
        frame.setSize(500, 500);        // 판때기 가로세로 결정
        frame.setVisible(true);
    }
}


public class GUIEx {

    public static void main(String[] args) {
//        CalGUI c = new CalGUI();
        new CalGUIB();
    }
}
