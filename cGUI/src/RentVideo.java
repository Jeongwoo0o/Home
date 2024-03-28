import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class RentVideo extends JFrame {
	
	// 1. 멤버 변수 선언
	JButton		bRent, bReturn;
	JTextField	tfRentTel, tfRentCustName, tfRentVideoNum, tfReturnVideoNum;
	ArrayList 	members;
	JTable 		table;
	JScrollPane scrollPane;
	JTabbedPane pTab;
	DefaultTableModel model;
	
	RentVideo() {
		// 2. 객체 생성
		super("RentVideo");
		
		pTab = new JTabbedPane();
		
		// TableList
		String[] colName 	= new String[] {"비디오번호", "비디오제목", "고 객 명 ", "전화번호", "반납예정일", "반납여부"};
		model 				= new DefaultTableModel(colName, 0);
		table 				= new JTable(model);
		scrollPane 			= new JScrollPane(table);
		members 			= new ArrayList();
		
		// Button
		bRent 	= new JButton("대여");
		bReturn = new JButton("반납");
		
		// TextField
		tfRentTel			= new JTextField(20);
		tfRentCustName		= new JTextField(20);
		tfRentVideoNum		= new JTextField(20);
		tfReturnVideoNum	= new JTextField(20);
	}
	
	// 3.화면 붙이기 및 출력
	void addLayout() {
		
		// 고객관리 탭
		setLayout(new BorderLayout());
		
		// Label, TestField 출력
		JPanel pWest = new JPanel();
		pWest.setLayout(new GridLayout(4, 2));
		pWest.setBorder(new TitledBorder(new EtchedBorder(),"대여"));
		pWest.add(new JLabel("전화번호", JLabel.LEFT));
		pWest.add(tfRentTel);
		pWest.add(new JLabel("고객명", JLabel.LEFT));
		pWest.add(tfRentCustName);
		pWest.add(new JLabel("비디어 번호", JLabel.LEFT));
		pWest.add(tfRentVideoNum);
		pWest.add(bRent);
		add(pWest, BorderLayout.WEST);
		
		JPanel pEast = new JPanel();
		pEast.setLayout(new FlowLayout(3));
		pEast.setBorder(new TitledBorder(new EtchedBorder(),"반납"));
		pEast.add(new JLabel("비디어 번호", JLabel.RIGHT));
		pEast.add(tfReturnVideoNum);
		pEast.add(bReturn);
		add(pEast, BorderLayout.EAST);
		
		JPanel pSouth = new JPanel();
        pSouth.setLayout(new GridLayout(1, 1));
        pSouth.add(scrollPane,BorderLayout.CENTER);
        add(pSouth, BorderLayout.SOUTH);
        
		
		setBounds(300, 100, 1000, 700);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		RentVideo video = new RentVideo();
		video.addLayout();
	}
}
