package e_tabpane.model;

public class ModelC {
	
	DBDriver dbd;
	
	public ModelC() throws Exception {
//		dbd = new DBDriver();
		dbd = DBDriver.getInstance();
	}
}
