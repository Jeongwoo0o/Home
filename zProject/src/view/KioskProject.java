package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.AbstractTableModel;


public class KioskProject extends JFrame {

	HomeView		homeView;
	EventView 		eventView;
	SetView			setView;
	BurgerView		burgerView;
	SideView		sideView;
	DrinkView		drinkView;

	JPanel 		contentpane;

	JTable 		tableBurger;
	JScrollPane scrollPane;

	BurgerTableModel tbModelBurger;
	
	ArrayList 	result 	= new ArrayList();

	public void addResult() {
		// PanelA에 있는 화면 JTable(View) / 테이블 모델에 지정
		tbModelBurger.data = result;
		tbModelBurger.fireTableDataChanged();
	}
	
	public KioskProject() {

		// 화면 관리하는 객체 생성
		eventView 	= new EventView();
		setView		= new SetView(this);
		burgerView	= new BurgerView(this);
		sideView 	= new SideView(this);
		drinkView 	= new DrinkView(this);

		createTable();
		addHomeView();
		addMenuButtons();
		addBottomPanel();



		// 프레임 설정
		setContentPane(contentpane);
		setBounds(500,200,500, 750);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		addResult();

	}

	// 홈 화면 추가 메소드
	void addHomeView() {
		homeView 		= new HomeView();
		//메인 패널 생성
		contentpane = new JPanel(new BorderLayout());
		contentpane.add(homeView, BorderLayout.CENTER);
		//초기화면 설정


	}



	//상단 메뉴버튼 추가 메소드
	void addMenuButtons() {
		// logo 라벨생성
		JLabel logo 		= new JLabel("King Burger");		//키오스크 라벨 생성

		//버튼메뉴 생성
		JButton event	= new JButton("행사상품");
		JButton set		= new JButton("세트메뉴");
		JButton burger	= new JButton("버거메뉴");
		JButton side	= new JButton("사이드메뉴");
		JButton drink	= new JButton("음료메뉴");
		JButton home	= new JButton("홈");
		JButton stats	= new JButton("통계");


		//메뉴의 버튼에 액션리스너 추가
		ActionListener menu = new MenuActionListener();
		event.addActionListener(menu);
		set.addActionListener(menu);
		burger.addActionListener(menu);
		side.addActionListener(menu);
		drink.addActionListener(menu);
		home.addActionListener(menu);
		stats.addActionListener(menu);

		// 상단 메뉴버튼 상하로 구분 >> 상단 : 홈/통계 , 하단: 메뉴탭
		JPanel menuTap = new JPanel();
		menuTap.setLayout(new GridLayout(2,1));

		//상단 메뉴 부분
		JPanel bPanel2 = new JPanel();
		bPanel2.setLayout(new GridLayout(1, 2));
		// 홈/통계 메뉴 >> 오른쪽 정렬
		JPanel bPanel2_right = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		bPanel2_right.add(home);
		bPanel2_right.add(stats);
		//로고 부분 >> 왼쪽 정렬
		JPanel bPanel2_left  = new JPanel(new FlowLayout(FlowLayout.LEFT));
		bPanel2_left.add(logo);
		//상단 로고 + 통계 붙이기
		bPanel2.add(bPanel2_left);
		bPanel2.add(bPanel2_right);

		// 하단 메뉴 버튼
		JPanel bPanel = new JPanel();
		bPanel.add(event);
		bPanel.add(set);
		bPanel.add(burger);
		bPanel.add(side);
		bPanel.add(drink);

		// 메뉴버튼에 상단/하단 붙이기
		menuTap.add(bPanel2);
		menuTap.add(bPanel);

		contentpane.add(menuTap, BorderLayout.NORTH);		//합쳐진 menuTap을 contetpane의 north 방향에 붙인다

	}	

	//ActionListner class
	class MenuActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			// 버튼에 따라 화면 변경
			if (e.getActionCommand().equals("행사상품")) {
				contentpane.remove(setView);
				contentpane.remove(burgerView);
				contentpane.remove(sideView);
				contentpane.remove(drinkView);
				contentpane.remove(homeView);
				contentpane.add(eventView, BorderLayout.CENTER);
			} else if (e.getActionCommand().equals("세트메뉴")) {
				contentpane.remove(eventView);
				contentpane.remove(burgerView);
				contentpane.remove(sideView);
				contentpane.remove(drinkView);
				contentpane.remove(homeView);
				contentpane.add(setView, BorderLayout.CENTER);
			} else if (e.getActionCommand().equals("버거메뉴")) {
				contentpane.remove(setView);
				contentpane.remove(eventView);
				contentpane.remove(sideView);
				contentpane.remove(drinkView);
				contentpane.remove(homeView);
				contentpane.add(burgerView, BorderLayout.CENTER);
			}else if(e.getActionCommand().equals("사이드메뉴")) {
				contentpane.remove(setView);
				contentpane.remove(eventView);
				contentpane.remove(burgerView);
				contentpane.remove(drinkView);
				contentpane.remove(homeView);
				contentpane.add(sideView, BorderLayout.CENTER);
			}else if(e.getActionCommand().equals("음료메뉴")) {
				contentpane.remove(setView);
				contentpane.remove(eventView);
				contentpane.remove(burgerView);
				contentpane.remove(sideView);
				contentpane.remove(homeView);
				contentpane.add(drinkView, BorderLayout.CENTER);
			}else if(e.getActionCommand().equals("홈")){
				contentpane.remove(setView);
				contentpane.remove(eventView);
				contentpane.remove(burgerView);
				contentpane.remove(sideView);
				contentpane.remove(drinkView);
				contentpane.add(homeView, BorderLayout.CENTER);
			}


			// 새로운 구성으로 패널 다시 그리기
			contentpane.revalidate();
			contentpane.repaint();

		}

	}


	// 하단 버튼 패널 메소드
	void addBottomPanel() {

		//하단 버튼 생성
		JButton b1 = new JButton("주문삭제");
		JButton b4 = new JButton("전체삭제");
		JButton b2 = new JButton("쿠폰사용하기");
		JButton b3 = new JButton("결제하기");

		//하단 패널 설정
		JPanel bSouth = new JPanel(new BorderLayout());

		//좌하단 테이블 패널 설정 >> center 출력
		JPanel bSouth_left = new JPanel();
		bSouth.add(scrollPane , BorderLayout.CENTER);

		//우하단 버튼 패널 설정 >> 오른쪽 세로방향 출력
		JPanel bSouth_right = new JPanel();
		GridLayout boxsize = new GridLayout(4,1);
//		boxsize.setHgap(0);		//버튼의 간격 조정 좌우
//		boxsize.setVgap(25);	//버튼의 간격 조정 상하
		bSouth_right.setLayout(boxsize);
		bSouth_right.add(b1);
		bSouth_right.add(b4);
		bSouth_right.add(b2);
		bSouth_right.add(b3);
		
		bSouth.add(bSouth_right, BorderLayout.EAST);

		//contentpane에 하단 패널 추가
		contentpane.add(bSouth, BorderLayout.SOUTH);

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "선택된 메뉴를 지웁니다.");
				// 테이블에서 선택된 행의 인덱스를 가져옵니다.
				int[] selectedRows = tableBurger.getSelectedRows();
				// 선택된 행이 있을 경우에만 삭제를 수행합니다.
				if (selectedRows.length > 0) {
					// 선택된 행을 역순으로 순회하며 삭제합니다.
					for (int i = selectedRows.length - 1; i >= 0; i--) {
						// 테이블 모델에서 선택된 행의 데이터를 삭제합니다.
						tbModelBurger.data.remove(selectedRows[i]);
					}
					// 테이블 모델에 변경된 내용을 알리고 다시 그리기
					tbModelBurger.fireTableDataChanged();
				} else {
					JOptionPane.showMessageDialog(null, "선택된 메뉴가 없습니다.");
				}
			}
		});
	}

	//테이블 생성
	void createTable () {
		
		tbModelBurger = new BurgerTableModel();
	
		//테이블  패널 생성
		tableBurger = new JTable(tbModelBurger);
		
		
		// 다중 선택 모드로 변경
	    tableBurger.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

		//테이블의크기 조절
	    scrollPane = new JScrollPane(tableBurger);
		scrollPane.setPreferredSize(new Dimension(000, 250));

		//선택된 행의 배경색 변경
		tableBurger.setSelectionBackground(Color.YELLOW);
		 
		

	}


	//화면에 테이블 붙이는 메소드 
	class BurgerTableModel extends AbstractTableModel { 

		ArrayList data = new ArrayList();
		String [] columnNames = {"상품","금액","수량"};

		public int getColumnCount() { 
			return columnNames.length; 
		} 

		public int getRowCount() { 
			return data.size(); 
		} 

		public Object getValueAt(int row, int col) { 
			ArrayList temp = (ArrayList)data.get( row );
			return temp.get( col ); 
		}

		public String getColumnName(int col){
			return columnNames[col];
		}
	}

	public static void main(String[] args) {

		new KioskProject();

	}


}




