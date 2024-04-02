package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class SideView extends JPanel{
	JButton b1 , b2 , b3, b4, b5, b6 , b7 , b8 , b9;

	public SideView() {
		addLayout();
		eventProc();

	}
	
	public void addLayout() {
		 b1 = new JButton("사이드메뉴0");
		 b2 = new JButton("사이드메뉴1");
		 b3 = new JButton("사이드메뉴2");
		 b4 = new JButton("사이드메뉴3");
		 b5 = new JButton("사이드메뉴4");
		 b6 = new JButton("사이드메뉴5");
		 b7 = new JButton("사이드메뉴6");
		 b8 = new JButton("사이드메뉴7");
		 b9 = new JButton("사이드메뉴8");

		setLayout(new BorderLayout());

		JPanel set = new JPanel();

		set.setLayout(new GridLayout(3,3));
		set.add(b1);
		set.add(b2);
		set.add(b3);
		set.add(b4);
		set.add(b5);
		set.add(b6);
		set.add(b7);
		set.add(b8);
		set.add(b9);
		add(set);
}

	void eventProc() {

	}
}