package e_tabpane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

import e_tabpane.model.ModelB;

public class PanelB extends JPanel{

	JButton btn;
	
	MyScreen screen;
	
	ModelB model;
	
	public PanelB(MyScreen screen) {
		try {
			model = new ModelB();
		} catch (Exception e) {
			e.printStackTrace();
		}
		addLayout();
		eventProc();
		this.screen = screen;
	}
	
	void addLayout() {
		btn = new JButton("치킨");
		add(btn);
	}
	
	void eventProc() {
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// MyScreen에 ArrayList result에 추가만 하면
				// 그 뒤로 PanelA의 목록으로 출력
				ArrayList temp = new ArrayList();
				temp.add(btn.getText());
				temp.add(1000);
				
				screen.result.add(temp);
				screen.addResult();
			}
		});
	}
}

























