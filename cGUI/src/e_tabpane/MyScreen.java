package e_tabpane;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class MyScreen extends JFrame {

	PanelA a;
	PanelB b;
	PanelC c;
	
	MyScreen() {
		a = new PanelA();
		b = new PanelB();
		c = new PanelC();
		
		JTabbedPane pane = new JTabbedPane();
		pane.addTab("고객관리", new ImageIcon("src/images/4.png"), a);
		pane.addTab("비디오관리", b);
		pane.addTab("대여관리", c);
		
		// 출력 순서
		pane.setSelectedIndex(2);
		
		// JFrame 기본 layout : BorderLayout
		// NORTH, SOUTH, CENTER, WEST, EAST 영역
		// 기본영역 : CENTER
		add(pane, BorderLayout.CENTER);
		
		setBounds(200, 200, 500, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new MyScreen();
	}
}





































