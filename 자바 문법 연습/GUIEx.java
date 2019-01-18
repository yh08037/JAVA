import javax.swing.*;

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
        CalGUI c = new CalGUI();

    }
}
