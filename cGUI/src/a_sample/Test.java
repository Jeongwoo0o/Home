package a_sample;
import java.awt.*;

/*
 * 	OOP 문법의 활용을 위해 GUI(화면) 만들기
 * 
 * 	자바 UI
 * 		- AWT	: 1.1
 * 		- SWING	: 1.2
 */

class MyScreen {
	// 1. 멤버 변수 선언
	Frame f;
	Button b1, b2;

	// 2. 객체 생성	
	MyScreen() {
		f = new Frame("나의 창");
		b1 = new Button("OK");
		b2 = new Button("Cancle");
	}
	
	// 3. 화면 붙이기
	// 4. 화면 띄우기
	void addLayout() {
		f.setLayout(new FlowLayout());
		f.add(b1);
		f.add(b2);
		f.setBounds(300, 300, 700, 500);;
		f.setVisible(true);
	}
}

public class Test {
	public static void main(String[] args) {

		MyScreen my = new MyScreen();
		my.addLayout();
	}
}


