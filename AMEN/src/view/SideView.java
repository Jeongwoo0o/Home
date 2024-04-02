package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

import model.ordermodel;
import okiosk.KioskProject;

public class SideView extends JPanel {
	JButton[] btMenu = new JButton[9];
	ordermodel model;
	
	ArrayList menu = new ArrayList();
	ArrayList price = new ArrayList();
	ArrayList list;
	
	int[] su = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	
	KioskProject kp;

	public SideView(KioskProject kp) {
		this.kp = kp;
		connectDB();
		addLayout();
		eventProc();
	}
	
	public void connectDB() { // DB연결
		try {
			model = new ordermodel();
			list = model.selectSide();
			
			for(int i = 0; i < list.size(); i++) {  // 행 row
				ArrayList temp = (ArrayList)list.get(i);
				menu.add(temp.get(0));
				price.add(temp.get(1));
			}	
		} catch (Exception e) {
			System.out.println("사이드관리 : " + e.getMessage());
			e.printStackTrace();
		}
	}

	public void addLayout() {

		setLayout(new BorderLayout());
		JPanel middlePanel = new JPanel();
		middlePanel.setLayout(new GridLayout(0, 3));

		for (int i = 0; i < list.size(); i++) {
			btMenu[i] = new JButton();
			middlePanel.add(btMenu[i]);
		}

		add(middlePanel);
	}

	void eventProc() {
		try {
			for (int i = 0; i < btMenu.length; i++) {
				int st = i;
				btMenu[i].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						// 기존에 추가된 상품인지 확인
						boolean found = false;
						for (ArrayList item : kp.result) {
							if (item.get(0).equals(menu.get(st))) {
								// 기존에 추가된 상품인 경우, 수량만 증가시키고 테이블에 반영
								int quantity = (int) item.get(1);
								item.set(1, quantity + 1); // 수량 증가
								found = true;
								break;
							}
						}
						// 기존에 추가된 상품이 아닌 경우, 새로운 행 추가
						if (!found) {
							su[st]++;
							ArrayList temp = new ArrayList();
							temp.add(menu.get(st)); // 상품
							temp.add(su[st]); // 수량
							temp.add(price.get(st)); // 금액
							kp.result.add(temp);
						}
						// 결과 업데이트
						kp.addResult();
					}
				}); // end btMenu
			}
		} catch (Exception e) {
			System.out.println("검색 실패 : " + e.getMessage());
			e.printStackTrace();
		}

	} // end eventProc()
}