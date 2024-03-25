import java.awt.BorderLayout;
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

public class Test extends JFrame{

	JButton		bRent, bReturn;
	JTextField	tfRentTel, tfRentCustName, tfRentVideoNum, tfReturnVideoNum;
	ArrayList 	members;
	JTable 		table;
	JScrollPane scrollPane;
	JTabbedPane pTab;
	DefaultTableModel model;



	void createTabbedPane(){

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


		JTabbedPane tPane = new JTabbedPane();
		add(tPane);
		tPane.addTab("고객관리", new JLabel());
		tPane.addTab("비디오관리", new JLabel());
		tPane.addTab("대여관리", new JLabel());
	}



	Test(){

		super("RentVideo");

		createTabbedPane();
		setBounds(300, 100, 1000, 700);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}






	public static void main(String[] args) {

		new Test();
	}
}
