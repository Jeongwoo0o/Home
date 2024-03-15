package d_cal;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Calculator extends JFrame {

    // 1. 멤버변수 선언
    JButton bAdd, bSub, bMul, bDiv, bEqu;
    JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
    JTextField tf;
    String num1 = "", num2 = "", oper = "";

    // 2. 객체 생성
    Calculator() {
        super("유치원 계산기");
        // TextField
        tf = new JTextField(15);
        bAdd = new JButton("+");
        bSub = new JButton("-");
        bMul = new JButton("*");
        bDiv = new JButton("/");
        bEqu = new JButton("=");
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
    }

    // 3. 화면 붙이기 및 화면 출력
    void addLayout() {
        setLayout(new BorderLayout());

        JPanel pNorth = new JPanel();
        pNorth.setLayout(new GridLayout(1, 1));
        pNorth.add(tf);
        add(pNorth, BorderLayout.NORTH);

        JPanel pCenter = new JPanel();
        pCenter.setLayout(new GridLayout(5, 3));

        pCenter.add(b1);
        pCenter.add(b2);
        pCenter.add(b3);
        pCenter.add(b4);
        pCenter.add(b5);
        pCenter.add(b6);
        pCenter.add(b7);
        pCenter.add(b8);
        pCenter.add(b9);
        pCenter.add(bAdd);
        pCenter.add(b0);
        pCenter.add(bEqu);
        pCenter.add(bSub);
        pCenter.add(bMul);
        pCenter.add(bDiv);
        add(pCenter, BorderLayout.CENTER);

        setBounds(300, 300, 300, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // 4. 이벤트 처리
    void eventProc() {
        // b0 버튼이 눌렸을 때
        b0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("0");
            }
        });
        // b1 버튼이 눌렸을 때
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("1");
            }
        });
        // b2 버튼이 눌렸을 때
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("2");
            }
        });
        // b3 버튼이 눌렸을 때
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("3");
            }
        });
        // b4 버튼이 눌렸을 때
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("4");
            }
        });
        // b5 버튼이 눌렸을 때
        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("5");
            }
        });
        // b6 버튼이 눌렸을 때
        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("6");
            }
        });
        // b7 버튼이 눌렸을 때
        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("7");
            }
        });
        // b8 버튼이 눌렸을 때
        b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("8");
            }
        });
        // b9 버튼이 눌렸을 때
        b9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("9");
            }
        });

        // add 버튼이 눌렸을 때
        bAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("+");
                num1 = tf.getText();
            }
        });
        // sub 버튼이 눌렸을 때
        bSub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("-");
                num1 = tf.getText();
            }
        });
        // mul 버튼이 눌렸을 때
        bMul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("*");
                num1 = tf.getText();
            }
        });
        // div 버튼이 눌렸을 때
        bDiv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("/");
                num1 = tf.getText();
                oper = "/";
            }
        });
        // equal 버튼이 눌렸을 때
        bEqu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                num2 = tf.getText();
                int inum1 = Integer.parseInt(num1);
                int inum2 = Integer.parseInt(num2);
                if (oper.equals("/")) {
                    int sum = inum1 / inum2;
                    String ssum = Integer.toString(sum);
                    tf.setText(ssum);
                }
            }
        });

    }

    public static void main(String[] args) {

        Calculator c = new Calculator();
        c.addLayout();
        c.eventProc();
    }
}
