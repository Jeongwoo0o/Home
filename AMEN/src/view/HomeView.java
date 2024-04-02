package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import okiosk.KioskProject;

public class HomeView extends JPanel {

	JButton bottom;
	JLabel top1, top2;

	KioskProject kp;
	
	public HomeView(KioskProject kp) {
		this.kp = kp;
		addLayout();
		// connectDB();
		eventProc();
	}

	public void addLayout() {
		bottom = new JButton("주문하기");
		JLabel top1 = new JLabel("이미지1", JLabel.CENTER);
		JLabel top2 = new JLabel("이미지2", JLabel.CENTER);

		setLayout(new BorderLayout());

		JPanel order = new JPanel();

		order.setLayout(new GridLayout(3, 1));
		order.add(top1);
		order.add(top2);
		order.add(bottom);
		add(order);

	}

	public void eventProc() {
		// 주문하기 버튼에 actionListener추가
		bottom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kp.order();
			}
		});

	}

	public void connectDB() {

	}

}
