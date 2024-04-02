package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class SideView extends JPanel{
	JButton[]	btMenu  = new JButton[9];
	String[]	menu  	= {"프렌치프라이","너겟킹","크리미모짜볼","어니언링","쉐이킹프라이","콘샐러드","21치즈스틱","바삭킹2조각","사이드소스"};
	int[] 		price 	= {2000,2800,2500,2300,2300,2000,2000,2900,300};
	
	KioskProject kp;

	public SideView(KioskProject kp) {
		addLayout();
		eventProc();
		this.kp = kp;
	}
	
	public void addLayout() {

		setLayout(new BorderLayout());

		JPanel middlePanel = new JPanel();
        middlePanel.setLayout(new GridLayout(0, 3));
        for (int i = 0; i < menu.length; i++) {
        	btMenu[i] = new JButton(menu[i]);
            middlePanel.add(btMenu[i]);
        }
		add(middlePanel);
	}

	void eventProc() {
		for(int i = 0; i < btMenu.length; i++) {
			int st = i;
			btMenu[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ArrayList temp = new ArrayList();
					temp.add(menu[st]);
					temp.add(price[st]);
					temp.add(1);
					temp.add(500);
					temp.add(500);
					kp.result.add(temp);
					kp.addResult();
				}
			});	//end btMenu
		}
	}
}