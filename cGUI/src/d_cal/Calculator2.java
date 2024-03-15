package d_cal;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Calculator2 extends JFrame {

    // 1. 멤버변수 선언
    JButton[] btn;
    String[] str = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "+", "0", "=", "-", "*", "/" };
    JTextField tf;
    String oper;
    double result;

    // 2. 객체 생성
    Calculator2() {
        super("유치원 계산기");
        // TextField
        tf = new JTextField(15);

        // Button
        btn = new JButton[15];
        for (int i = 0; i < btn.length; i++) { // 버튼 객체 생성 반복문
            btn[i] = new JButton(str[i]);
        } // end for(i)
    } // end Calculator2

    // 3. 화면 붙이기 및 화면 출력
    void addLayout() {
        setLayout(new BorderLayout());

        // TextField
        JPanel pNorth = new JPanel();
        pNorth.setLayout(new GridLayout(1, 1));
        pNorth.add(tf);
        add(pNorth, BorderLayout.NORTH);

        // Button
        JPanel pCenter = new JPanel();
        pCenter.setLayout(new GridLayout(5, 3));
        for (int i = 0; i < btn.length; i++) { // 버튼 생성 반복문
            pCenter.add(btn[i]);
        } // end for(i)
        add(pCenter, BorderLayout.CENTER);

        // Layout
        setBounds(300, 300, 300, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    int i = 0;

    // 4. 이벤트 처리
    void eventProc() {
        for (i = 0; i < btn.length; i++) {
            btn[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String str1 = e.getActionCommand(); // 이벤트를 발생시킨 객체의 문자열 가져오기

                    // 숫자 입력
                    if (str1.equals("0") || str1.equals("1") || str1.equals("2") ||
                            str1.equals("3") || str1.equals("4") || str1.equals("5") ||
                            str1.equals("6") || str1.equals("7") || str1.equals("8") ||
                            str1.equals("9")) {
                        tf.setText(tf.getText() + str1); // 입력한 문자열에 새로 입력한 문자열 붙여서 출력
                    } // end if

                    // 연산자 입력
                    if (str1.equals("+") || str1.equals("-") || str1.equals("*") ||
                            str1.equals("/")) {
                        oper = str1; // oper에 연산자 저장

                        switch (oper) {
                            case "+": // 누르면 이전에 누른 문자열이 Double로 형 변환 되면서 result에 저장되고, TextField가 비워진다.
                                result = Double.parseDouble(tf.getText());
                                tf.setText("");
                                break;
                            case "-":
                                result = Double.parseDouble(tf.getText());
                                tf.setText("");
                                break;
                            case "*":
                                result = Double.parseDouble(tf.getText());
                                tf.setText("");
                                break;
                            case "/":
                                result = Double.parseDouble(tf.getText());
                                tf.setText("");
                                break;
                        } // end switch(oper)
                    } // end if

                    // 계산
                    if (str1.equals("=")) {
                        switch (oper) {
                            case "+": // 누르면 이전 result에 저장된 Double값과 방금 누른 문자열을 Double로 형 변환 후, 서로 더해서 다시 result에 저장.
                                result = result + Double.parseDouble(tf.getText());
                                tf.setText(Double.toString(result)); // result를 String으로 형 변환 후, TextField에 set.
                                break;
                            case "-":
                                result = result - Double.parseDouble(tf.getText());
                                tf.setText(Double.toString(result));
                                break;
                            case "*":
                                result = result * Double.parseDouble(tf.getText());
                                tf.setText(Double.toString(result));
                                break;
                            case "/":
                                result = result / Double.parseDouble(tf.getText());
                                tf.setText(Double.toString(result));
                                break;
                        } // end switch(oper)
                    } // end if
                }
            });
        } // end for(i)
    } // end eventProc()

    public static void main(String[] args) {

        Calculator2 c = new Calculator2();
        c.addLayout();
        c.eventProc();
    }
}
