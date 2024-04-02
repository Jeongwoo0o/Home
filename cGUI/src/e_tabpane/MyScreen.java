package e_tabpane;
import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class MyScreen extends JFrame {

	PanelA a;
	PanelB b;
	PanelC c;
	
	ArrayList result = new ArrayList();
	
	public void addResult() {
		// 데이터 확인
//		for(int i = 0; i < 3; i++) {
//			ArrayList temp = new ArrayList();
//			temp.add("메뉴" + i);
//			temp.add(1000 * (i+1));
//			result.add(temp);
//		}
		// PanelA에 있는 화면 JTable(View) / 테이블 모델에 지정
		a.tm.data = result;
		a.tm.fireTableDataChanged();
	}
	
	
	MyScreen() {
		a = new PanelA();
		b = new PanelB(this);	// this : MyScreen 객체 주소
		c = new PanelC();
		
		JTabbedPane pane = new JTabbedPane();
		pane.addTab("내역", new ImageIcon("src/images/4.png"), a);
		pane.addTab("주메뉴", b);
		pane.addTab("부메뉴", c);
		
		// 출력 순서
		pane.setSelectedIndex(2);
		
		// JFrame 기본 layout : BorderLayout
		// NORTH, SOUTH, CENTER, WEST, EAST 영역
		// 기본영역 : CENTER
		add(pane, BorderLayout.CENTER);
		
		setBounds(200, 200, 500, 400);
		setVisible(true);
		
		addResult();
	}
	
	public static void main(String[] args) {
		
		new MyScreen();
	}
}





































