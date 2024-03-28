package f_jtable;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

public class JTableTest {

	JFrame  frame;
	JButton button;
	
	JTable  table;			// 화면에 출력되는 뷰(View)
	MyTableModel tbModel;	// 테이블의 데이터와 컬럼 관리
	
	
	JTableTest() {
		
		frame  = new JFrame("테이블테스트");
		button = new JButton("눌러주세요");
		
		tbModel = new MyTableModel();
		table   = new JTable(tbModel);
		
		frame.add(new JScrollPane(table), BorderLayout.CENTER);
		frame.add(button, BorderLayout.SOUTH);
		frame.setBounds(300, 300, 500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		// 버튼이 눌렸을 때
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				change();
			}
		});
		
		// 테이블에서 마우스 클릭했을 때
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int row = table.getSelectedRow();
				int col = table.getSelectedColumn();
				Integer value = (Integer)table.getValueAt(row, col);
				
				System.out.println(row + " " + col + " " + value);
			}
		});
	}
	
	void change() {
		
		// 데이터 만들기
		ArrayList data = new ArrayList();
		for(int i = 0; i < 4; i++) {
			ArrayList temp = new ArrayList();
			for(int j = 0; j < 4; j++) {
				temp.add(new Integer(i+j));
			}
			data.add(temp);
		}
		
		// 데이터를 테이블모델에 지정 -> 테이블모델을 데이블에 지정
		tbModel.data = data;
		table.setModel(tbModel);
		// *** 데이터가 바껴서 화면을 다시 반영하기 위해
		tbModel.fireTableDataChanged();
	}
	
	class MyTableModel extends AbstractTableModel {

		ArrayList data = new ArrayList();	// 테이블에 출력할 데이터
		String[] columnNames = {"하나", "둘", "셋", "사"};	// 컬럼명
		
		public int getRowCount() {
			return data.size();
		}
		public int getColumnCount() {
			return columnNames.length;
		}
		public Object getValueAt(int rowIndex, int columnIndex) {
			ArrayList temp = (ArrayList)data.get(rowIndex);
			return temp.get(columnIndex);
		}
		
		public String getColumnName(int col) {
			return columnNames[col];
		}
		
	}

	public static void main(String[] args) {

		new JTableTest();
	}
}



















