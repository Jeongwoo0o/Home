package videoshop.model;

import java.util.ArrayList;

public interface RentDao {
	public void rentVideo(String tel, int vnum) throws Exception;
	public String selectByTel(String tel) throws Exception;
	public void returnVideo(int vnum) throws Exception;
	public ArrayList selectNoReturn() throws Exception;
}
