package e_tabpane;
import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

import e_tabpane.model.ModelA;

public class PanelA extends JPanel{
	
	MyTableModel tm;
	JTable table;
	
	ModelA model;

	public PanelA() {
		try {
			model = new ModelA();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		tm = new MyTableModel();
		table = new JTable(tm);
		
		setLayout(new BorderLayout());
		add(new JScrollPane(table), BorderLayout.CENTER);
	}
	
	class MyTableModel extends AbstractTableModel {

		ArrayList data = new ArrayList();	// 테이블에 출력할 데이터
		String[] columnNames = {"메뉴", "가격"};	// 컬럼명
		
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
	
}




















