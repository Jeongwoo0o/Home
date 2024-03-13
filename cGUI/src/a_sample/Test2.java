package a_sample;
import java.awt.*;
import javax.swing.*;

/*
 *  AWT ---> Swing
 *           J이름
 */

class MyFrame extends JFrame {
    // 1. 멤버변수 선언
    JButton b1, b2;
    JLabel l1;
    JCheckBox cb1, cb2;
    JList list;
    JComboBox com1;
    JRadioButton rb1, rb2;
    JTextField tf;
    JTextArea ta;

    // 2. 객체 생성
    MyFrame() {
        b1 = new JButton("OK");
		b2 = new JButton("Cancle");
        l1 = new JLabel("Good Morning");
        cb1 = new JCheckBox("Male");
        cb2 = new JCheckBox("Female");
        rb1 = new JRadioButton("Boy");
        rb2 = new JRadioButton("Girl");
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        tf = new JTextField("이름 입력", 30);
        ta = new JTextArea(10, 50);

        String[] data1 = {"one", "two", "three", "four", "five", "six"};
        list = new JList(data1);
        String[] data2 = {"one", "two", "three", "four", "five", "six"};
        com1 = new JComboBox(data2);
    }

    // 3. 화면 붙이기 + 화면 출력
    void addLayout() {
        // 1) FlowLayout - 윗줄 상단 중앙 배치 (컴포넌트 크기 유지)
        // setLayout(new FlowLayout());
        // 2) GridLayout - 행과 열에 맞춰 배치 (컴포넌트 크기 유지 안됨)
        // setLayout(new GridLayout(4, 3));
        // 3) BorderLayout - 중앙 동서남북
        setLayout(new BorderLayout());
        add(b1, BorderLayout.WEST);
        add(b2, BorderLayout.EAST);
        add(l1, BorderLayout.CENTER);
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(2, 1));
        p.add(cb1);
        p.add(cb2);
        add(p,BorderLayout.SOUTH);
        // add(list);
        // add(com1);
        // add(rb1);
        // add(rb2);
        // add(tf);
        // add(ta);
        setBounds(300, 300, 700, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class Test2 {
    public static void main(String[] args) {
        
        MyFrame my = new MyFrame();
        my.addLayout();
    }
}
