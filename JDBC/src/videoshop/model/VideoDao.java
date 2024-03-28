package videoshop.model;
import java.util.ArrayList;

import videoshop.model.vo.Video;

public interface VideoDao {
	public void insertVideo(Video vo, int count) throws Exception;
	public ArrayList searchVideo(int index, String keyword) throws Exception;
	public Video selectVideo(int videoNum) throws Exception;
	public Video deleteVideo(String videoNum) throws Exception;
}
