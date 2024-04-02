package e_tabpane.model;

import javax.swing.JTable;

public class ModelA {
	
	DBDriver dbd;
	
	public ModelA() throws Exception {
//		dbd = new DBDriver();
		dbd = DBDriver.getInstance();
	}
}
