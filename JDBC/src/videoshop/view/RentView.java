package  videoshop.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.AbstractTableModel;

import videoshop.model.RentDao;
import videoshop.model.dao.RentModel;



public class RentView extends JPanel 
{
	JTextField tfRentTel, tfRentCustName, tfRentVideoNum;
	JButton bRent;
	
	JTextField tfReturnVideoNum;
	JButton bReturn;
	
	JTable tableRecentList;
	RentTableModel rentTM;
	
	JScrollPane scrollPane;
	RentDao model;
	
	//==============================================
	//	 생성자 함수
	public RentView(){
		addLayout();	//화면구성
		eventProc();	//DB연결
		connectDB();
		selectNoReturn();
	}
	
	// DB 연결
	void connectDB(){
		try {
			model = new RentModel();
		} catch (Exception e) {
			System.out.println("대여관리 - 드라이버 로딩 실패 : " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	// 이벤트 등록
	public void eventProc(){
		// 전화번호에서 엔터쳤을 때
		tfRentTel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectByTel();
			}
		});	
		
		// 대여버튼이 눌렸을 때
		bRent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rentVideo();
				selectNoReturn();
				clearTexts();
			}
		});
		
		// 반납버튼이 눌렸을 때
		bReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				returnVideo();
				selectNoReturn();
				clearTexts();
			}
		});
	}	//end eventProc
	
	public void selectNoReturn() {
		try {
			ArrayList data = model.selectNoReturn();
			rentTM.data = data;
			tableRecentList.setModel(rentTM);
			rentTM.fireTableDataChanged();
		} catch (Exception e) {
			System.out.println("미납목록 예외 발생 : " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	// 전화번호로 고객 이름 불러오기
	void selectByTel() {
		String  tel  = tfRentTel.getText();
		try {
			
			String name = model.selectByTel(tel);
			tfRentCustName	.setText(name);
		} catch (Exception e) {
			System.out.println("검색 실패 : " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	void rentVideo() {
		/*
		 *  1. 전화번호 입력값 얻어오기
		 *  2. 대여할 비디오번호 입력값 얻어오기
		 *  3. 모델에 rentVideo(1번, 2번) 호출
		 *  4. 화면 비우기
		 */
		String  tel  = tfRentTel.getText();
		int		vnum = Integer.parseInt(tfRentVideoNum.getText());
		
		try {
			model.rentVideo(tel, vnum);
			JOptionPane.showMessageDialog(null, "대여완료");
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "예외발생");
			e.printStackTrace();
		}
	}
	
	void returnVideo() {
		/*
		 * 	1. 반납할 비디오번호 입력값 얻어오기
		 * 	2. 모델에 returnVideo(1번) 호출
		 * 	3. 화면 지우기
		 */
		int vnum = Integer.parseInt(tfReturnVideoNum.getText());
		try {
			model.returnVideo(vnum);
			JOptionPane.showMessageDialog(null, "반납완료");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "반납실패");
			e.printStackTrace();
		}
	}
	
	// 창 비우기
	void clearTexts() {
		tfRentTel.setText("");
		tfRentCustName.setText("");
		tfRentVideoNum.setText("");
		tfReturnVideoNum.setText("");
	}
	
	/*	객체 생성 및 화면 구성   */
	void addLayout(){
		
		// Button
		bRent 				= new JButton("대여");
		bReturn 			= new JButton("반납");
		
		// TextField
		tfRentTel			= new JTextField();
		tfRentCustName		= new JTextField();
		tfRentVideoNum		= new JTextField();
		tfReturnVideoNum	= new JTextField(20);
		
		// table
		rentTM				= new RentTableModel();
		tableRecentList 	= new JTable(rentTM);
		scrollPane 			= new JScrollPane(tableRecentList);
		
		
		
		// 고객관리 탭
		// 위쪽
		JPanel pNorth = new JPanel();
		pNorth.setLayout(new GridLayout(1, 2));
		
		// 위쪽 왼쪽
		JPanel pNorthWest = new JPanel();
		pNorthWest.setLayout(new GridLayout(4, 2));
		pNorthWest.setBorder(new TitledBorder("대여"));
		pNorthWest.add(new JLabel("전화번호", JLabel.LEFT));
		pNorthWest.add(tfRentTel);
		pNorthWest.add(new JLabel("고객명", JLabel.LEFT));
		pNorthWest.add(tfRentCustName);
		pNorthWest.add(new JLabel("비디오 번호", JLabel.LEFT));
		pNorthWest.add(tfRentVideoNum);
		pNorthWest.add(bRent);
		
		
		// 위쪽 오른쪽
		JPanel pNorthEast = new JPanel();
		pNorthEast.setLayout(new FlowLayout(3));
		pNorthEast.setBorder(new TitledBorder("반납"));
		pNorthEast.add(new JLabel("비디오 번호", JLabel.RIGHT));
		pNorthEast.add(tfReturnVideoNum);
		pNorthEast.add(bReturn);
		
		// 위쪽 완성
		pNorth.add(pNorthWest);
		pNorth.add(pNorthEast);
		
		// 아래쪽
		JPanel pCenter = new JPanel();
		pCenter.setLayout(new BorderLayout());
		pCenter.add(new JScrollPane(tableRecentList),BorderLayout.CENTER);
		
		
		setLayout(new BorderLayout());
		add(pNorth, BorderLayout.NORTH);
		add(pCenter, BorderLayout.CENTER);
		
	}

	class RentTableModel extends AbstractTableModel { 
		  
		ArrayList data = new ArrayList();
		String [] columnNames = {"비디오번호","제목","고객명","전화번호","반납예정일","반납여부"};
		
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

	

	
}

































