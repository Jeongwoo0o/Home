package	 project;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import videoshop.model.dao.CustomerModel;
import videoshop.model.vo.Customer;


public class CustomerView extends JPanel 
{
	// 변수 선언
	JTextField	tfCustName, tfCustTel,  tfCustTelAid, tfCustAddr, tfCustEmail;

	// 모델단 변수 선언
	CustomerModel model;
	
	public CustomerView(){
		addLayout();
		connectDB();
		eventProc();
	}
	
	public void eventProc(){
		ButtonEventHandler btnHandler = new ButtonEventHandler();
		
		// 이벤트 등록
		bCustRegist.addActionListener(btnHandler);
	}
	
	// 이벤트 핸들러 만들기
	class ButtonEventHandler implements ActionListener{
		public void actionPerformed(ActionEvent ev){
			Object o = ev.getSource();
			
			if(o==bCustRegist){  
//				registCustomer(); 
			}
			else if(o==bCustModify){  
//				updateCustomer();  
			}	//end if
		}	//end actionPerformed
	}	//end ButtonEventHandler
	
	// DB 연결
	public void connectDB(){
		try {
			model = new CustomerModel();
		} catch (Exception e) {
			System.out.println("고객관리 : " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	// 레이아웃
	public void addLayout(){
		// 객체 생성
		tfCustName			= new JTextField(20);
		model				= new CustomerModel();
		
		// 레이아웃 
		

		// 전체 패널에 붙이기
		setLayout( new BorderLayout() );
		add("Center",		pRegist );
		add("South",		pSearch );
	}	//end addLayout
	
	// 창 비우기
	void clearTexts() {
		tfCustName.setText("");
	}

}			 	
				 	
