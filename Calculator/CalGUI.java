import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


// 배치관리자 FlowLayout 클래스 사용
public class CalGUI extends JFrame {

    CalLogic logic;
    JTextField jf;
    String str = "";
    JPanel panel1, panel2;

    ActionListener myListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String result = e.getActionCommand();
            switch (result) {
                case "C":
                    jf.setText("");
                    str = "";
                    break;
                case "=":
                    str = jf.getText();
                    logic = new CalLogic();
                    jf.setText(logic.evaluate(str));
                    str = jf.getText();
                    break;
                default:
                    str = jf.getText();
                    str += result;
                    jf.setText(str);

            }
        }
    };

    CalGUI() {

        // UI 배치관리자

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLocation(300, 300);


        jf = new JTextField(20);
        this.add("North", jf);


        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(5, 4, 1, 1));

        String[] buttons = {"(", ")", "C", "=", "7", "8", "9", "+",
                "4", "5", "6", "-", "1", "2", "3" ,"*", "0", "/"};

        JButton[] jb = new JButton[buttons.length];

        for (int i = 0; i < buttons.length; i++) {
            jb[i] = new JButton(buttons[i]);
            panel1.add(jb[i]);
            jb[i].addActionListener(myListener);
        }
        this.add(panel1);

        this.setVisible(true);
    }

}