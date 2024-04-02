package e_tabpane.model;

public class ModelB {
	
	DBDriver dbd;
	
	public ModelB() throws Exception {
//		dbd = new DBDriver();
		dbd = DBDriver.getInstance();
	}
}
