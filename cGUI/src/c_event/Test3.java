package c_event;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
 * 	OOP 문법의 활용을 위해 GUI(화면) 만들기
 * 
 * 	자바 UI
 * 		- AWT	: 1.1
 * 		- SWING	: 1.2
 */

class MyScreen3 {
	// 1. 멤버 변수 선언
	JFrame f;
	JButton b1, b2;

	// 2. 객체 생성
	MyScreen3() {
		f = new JFrame("나의 창");
		b1 = new JButton("OK");
		b2 = new JButton("Cancle");
	}

	// 3. 화면 붙이기
	// 4. 화면 띄우기
	void addLayout() {
		f.setLayout(new FlowLayout());
		f.add(b1);
		f.add(b2);
		f.setBounds(300, 300, 700, 500);
		;
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	} // end addLayout()

	// *************
	// 이벤트 처리
	void eventPro() {
		// [2] 이벤트핸들러 객체 생성
		// [3] 이벤트 컴포넌트와 이벤트 객체를 등록(연결)
		// [1] 이벤트핸들러 : 이벤트 처리하는 클래스

		// 'ok' 버튼이 눌렸을 때 이벤트 처리
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "버튼눌렸습니다.");
			}
		});

		// 'cancel' 버튼이 눌렸을 때 이벤트 처리
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

	} // end eventPro()

} // end MyScreen()

public class Test3 {
	public static void main(String[] args) {

		MyScreen3 my = new MyScreen3();
		my.addLayout();
		my.eventPro();
	}
}
