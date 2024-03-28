package d_info;
import java.util.ArrayList;

public interface InfoModel {
	
	/*
	 * 	함수명	: insertData
	 * 	인자값	: 
	 * 	리턴값	:
	 * 	역할		: 회원가입하는 입력값을 받아서 데이터베이스에 저장
	 */
	void insertData(InfoVO vo) throws Exception;
	
	/*
	 * 	함수명	: searchByTel
	 * 	인자값	: tel
	 * 	리턴값	: 
	 * 	역할		: 전화번호를 입력받아 해당 고객의 정보를 반환
	 */
	InfoVO searchByTel(String tel) throws Exception;
	
	/* 	함수명	: searchAll
	 * 	인자값	: 
	 * 	리턴값	: 
	 * 	역할		: 모든 데이터를 TextArea에 불러오기
	 */
	ArrayList<InfoVO> searchAll() throws Exception;

	/* 	함수명	: deleteData
	 * 	인자값	: 
	 * 	리턴값	: 
	 * 	역할		: 전화번호를 받아와 해당하는 데이터 삭제
	 */
	void deleteData(String tel) throws Exception;
	
	/* 	함수명	: modifyData
	 * 	인자값	: 
	 * 	리턴값	:
	 * 	역할		: 회원정보를 불러와서 수정
	 */
	void modifyData(InfoVO vo) throws Exception;
}
