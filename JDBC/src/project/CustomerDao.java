package project;
import videoshop.model.vo.Customer;

/** 고객관리 JDBC 연결 */
public interface CustomerDao {
	public void insertCustomer(Customer vo) throws Exception;		// 회원가입
}
