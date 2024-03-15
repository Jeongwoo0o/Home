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

class MyScreen {
	// 1. 멤버 변수 선언
	JFrame f;
	JButton b1, b2;

	// 2. 객체 생성
	MyScreen() {
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
		MyHandle hdlr = new MyHandle();

		// [3] 이벤트 컴포넌트와 이벤트 객체를 등록(연결)
		b1.addActionListener(hdlr);
	} // end eventPro()

	// [1] 이벤트핸들러 : 이벤트 처리하는 클래스
	class MyHandle implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "버튼눌렸습니다.");
		}
	}

} // end MyScreen()

public class Test {
	public static void main(String[] args) {

		MyScreen my = new MyScreen();
		my.addLayout();
		my.eventPro();
	}
}
