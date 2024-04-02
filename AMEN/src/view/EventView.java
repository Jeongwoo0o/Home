package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import model.ordermodel;
import okiosk.KioskProject;

public class EventView extends JPanel {
	JButton[] btMenu = new JButton[4];

	ordermodel model;

	ArrayList menu = new ArrayList();
	ArrayList price = new ArrayList();
	ArrayList list;
	
	int[] su = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	
	KioskProject kp;

	public EventView(KioskProject kp) {
		this.kp = kp;
		connectDB();
		addLayout();
		eventProc();
	}
	
	public void connectDB() { // DB연결
		try {
			model = new ordermodel();
			list = model.selectEvent();
			
			for(int i = 0; i < list.size(); i++) {  // 행 row
				ArrayList temp = (ArrayList)list.get(i);
				menu.add(temp.get(0));
				price.add(temp.get(1));
			}
		} catch (Exception e) {
			System.out.println("행사관리 : " + e.getMessage());
			e.printStackTrace();
		}
	}

	public void addLayout() {

		setLayout(new BorderLayout());
		JPanel middlePanel = new JPanel();
		middlePanel.setLayout(new GridLayout(0, 3));

		for (int i = 0; i < list.size(); i++) {
			btMenu[i] = new JButton();
			// 버튼 크기 조정
			btMenu[i].setPreferredSize(new Dimension(200, 100));
			middlePanel.add(btMenu[i]);
		}

		add(middlePanel);

		JPanel pMenu = new JPanel();
		pMenu.setLayout(new GridLayout(4, 1));
		for (int i = 0; i < list.size(); i++) {
			pMenu.add(btMenu[i]);
		}

		JScrollPane scroll = new JScrollPane(pMenu);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setPreferredSize(pMenu.getPreferredSize());
		add(scroll, BorderLayout.CENTER);

	}

	void eventProc() {
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
	} // end eventProc()

}
