package  videoshop.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;



public class RentView extends JPanel 
{
	JTextField tfRentTel, tfRentCustName, tfRentVideoNum;
	JButton bRent;
	
	JTextField tfReturnVideoNum;
	JButton bReturn;
	
	JTable tableRecentList;
	
	RentTableModel rentTM;
	
	ArrayList 	members;
	JTable 		table;
	JScrollPane scrollPane;
	DefaultTableModel model;
	
	//==============================================
	//	 생성자 함수
	public RentView(){
		addLayout();	//화면구성
		eventProc();	//DB연결
		connectDB();
	}
	
	// DB 연결
	void connectDB(){
		
	}
	
	
	// 이벤트 등록
	public void eventProc(){

		                         
	}
	
	/*	객체 생성 및 화면 구성   */
	void addLayout(){

		table 				= new JTable(model);
		scrollPane 			= new JScrollPane(table);
		members 			= new ArrayList();
		
		// Button
		bRent 	= new JButton("대여");
		bReturn = new JButton("반납");
		
		// TextField
		tfRentTel			= new JTextField();
		tfRentCustName		= new JTextField();
		tfRentVideoNum		= new JTextField();
		tfReturnVideoNum	= new JTextField();
		
		// 고객관리 탭
		
		// 위쪽
		JPanel pNorth = new JPanel();
		pNorth.setLayout(new BorderLayout());
		JPanel pNorth1 = new JPanel();
		pNorth1.setLayout(new GridLayout(1, 2));
		
		// 위쪽 왼쪽
		JPanel pNorthWest = new JPanel();
		pNorthWest.setLayout(new GridLayout(4, 2));
		pNorthWest.setBorder(new TitledBorder("대여"));
		pNorthWest.add(new JLabel("전화번호", JLabel.LEFT));
		pNorthWest.add(tfRentTel);
		pNorthWest.add(new JLabel("고객명", JLabel.LEFT));
		pNorthWest.add(tfRentCustName);
		pNorthWest.add(new JLabel("비디어 번호", JLabel.LEFT));
		pNorthWest.add(tfRentVideoNum);
		pNorthWest.add(bRent);
		
		
		// 위쪽 오른쪽
		JPanel pNorthEast = new JPanel();
		pNorthEast.setLayout(new FlowLayout(3));
		pNorthEast.setBorder(new TitledBorder("반납"));
		pNorthEast.add(new JLabel("비디어 번호", JLabel.RIGHT));
		pNorthEast.add(tfReturnVideoNum);
		pNorthEast.add(bReturn);
		
		// 위쪽 완성
		pNorth.add(pNorthWest,BorderLayout.WEST);
		pNorth.add(pNorthEast,BorderLayout.EAST);
		
		// 아래쪽
		JPanel pSouth = new JPanel();
		pSouth.setLayout(new BorderLayout());
		
		
		setLayout(new GridLayout(2,2));
		add(pNorth);
		add(pSouth);
		
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
