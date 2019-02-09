import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


// 배치관리자 FlowLayout 클래스 사용
class MyCalGUI extends JFrame {

    CalLogic logic;
    JTextField jf;
    String str;

    ActionListener myListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String result = e.getActionCommand();
            switch (result) {
                case "c":
                    jf.setText("c");
                    break;
                case "=":
                    str = jf.getText();
                    logic = new CalLogic();
                    jf.setText(logic.evaluate(str));
                    break;
            }
        }
    };

    MyCalGUI() {

        // UI 배치관리자
        FlowLayout layout = new FlowLayout();
        this.setLayout(layout);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLocation(300, 300);


        jf = new JTextField(20);
        this.add(jf);

        JButton[] jb = new JButton[10];

        for (int i = 0; i < 10; i++) {
            jb[i] = new JButton(i+"");
            this.add(jb[i]);
            jb[i].addActionListener(myListener);
        }

        JButton c = new JButton("c");
        c.setBackground(Color.RED);
        this.add(c);
        c.addActionListener(myListener);

        JButton eq = new JButton("=");
        eq.setBackground(Color.BLUE);
        this.add(eq);
        eq.addActionListener(myListener);


        this.setVisible(true);
    }

}




public class CalGUI {
    public static void main(String[] args) {
        new MyCalGUI();
    }
}
