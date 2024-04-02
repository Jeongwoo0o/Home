package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class EventView extends JPanel {
	JButton b1 , b2 , b3, b4, b5, b6 , b7 , b8 , b9;
	
	
	public EventView() {
		addLayout();
		eventProc();
		
	}
	
	public void addLayout() {
		 b1 = new JButton("행사상품0");
		 b2 = new JButton("행사상품1");
		 b3 = new JButton("행사상품2");
		 b4 = new JButton("행사상품3");
		 b5 = new JButton("행사상품4");
		 b6 = new JButton("행사상품5");
		 b7 = new JButton("행사상품6");
		 b8 = new JButton("행사상품7");
		 b9 = new JButton("행사상품8");
		
		setLayout(new BorderLayout());
		
		// 3*3 형태 패널 구성
		// 버튼 크기 조정
        b1.setPreferredSize(new Dimension(200, 100));
        b2.setPreferredSize(new Dimension(200, 100));
        b3.setPreferredSize(new Dimension(200, 100));
        b4.setPreferredSize(new Dimension(200, 100));
        b5.setPreferredSize(new Dimension(200, 100));
        b6.setPreferredSize(new Dimension(200, 100));
        b7.setPreferredSize(new Dimension(200, 100));
        b8.setPreferredSize(new Dimension(200, 100));
        b9.setPreferredSize(new Dimension(200, 100));
		
        JPanel menu = new JPanel();
		
		menu.setLayout(new GridLayout(9,1));
		menu.add(b1);
		menu.add(b2);
		menu.add(b3);
		menu.add(b4);
		menu.add(b5);
		menu.add(b6);
		menu.add(b7);
		menu.add(b8);
		menu.add(b9);
		
		JScrollPane scroll = new JScrollPane(menu);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setPreferredSize(menu.getPreferredSize());
		add(scroll, BorderLayout.CENTER);
		
				
	}
	
	void eventProc() {
		
	}
		
		
		
	}
	
	


