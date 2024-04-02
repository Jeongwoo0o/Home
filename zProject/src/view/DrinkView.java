package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class DrinkView extends JPanel {
	JButton[]	btMenu  = new JButton[7];
	String[]	menu  	= {"아메리카노","핫초코/아이스초코","코카콜라","코카콜라제로","스프라이트","미닛메이드 오렌지","순수(미네랄워터)"};
	int[] 		price 	= {1500,2000,1900,1900,1900,2700,1200};
	
	KioskProject kp;

	public DrinkView(KioskProject kp) {
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
