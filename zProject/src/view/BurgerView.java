package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class BurgerView extends JPanel {
	JButton[]	btMenu  = new JButton[9];
	String[]	menu  	= {"와퍼","불고기와퍼","치즈와퍼","할라피뇨와퍼","콰트로치즈와퍼","통새우와퍼","베이컨치즈와퍼","치킨킹","몬스터X"};
	int[] 		price 	= {6900,6900,7500,7700,7700,7700,7700,6400,10100};
	
	KioskProject kp;

	public BurgerView(KioskProject kp) {
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
