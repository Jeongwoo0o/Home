package z_escaperoom;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class EmpView {

	// 화면 관련 멤버변수
	JFrame f;
	JTextField tfEmpno, tfEname, tfSal, tfJob;
	JButton bInsert, bUpdate, bDelete, bSelectAll;
	JTextArea ta;

	//#########################
	// 모델단 멤버 변수
	EmpModel model;

	// 멤버변수 객체 생성
	EmpView(){

		//#########################
		// 모델단 멤버변수 객체 생성
		try {
			model = new EmpModelImpl();
			System.out.println("드라이버 로딩 성공");
		} catch (Exception ex) {
			System.out.println("드라이버 로딩 실패 : " + ex.getMessage());
		}

		f = new JFrame("나의 연습");
		tfEmpno = new JTextField(10);
		tfEname = new JTextField(10);
		tfSal = new JTextField(10);
		tfJob = new JTextField(10);
		bInsert = new JButton("입력");
		bUpdate = new JButton("수정");
		bDelete = new JButton("삭제");
		bSelectAll = new JButton("전체검색");
		ta = new JTextArea();
	}

	// 화면 구성
	void addLayout() {
		JPanel pNorth = new JPanel();
		pNorth.setLayout(new GridLayout(1,2));

		JPanel pNorth1 = new JPanel();
		pNorth1.setLayout(new GridLayout(4,2));
		pNorth1.add(new JLabel("사번"));		pNorth1.add(tfEmpno);
		pNorth1.add(new JLabel("사원명"));		pNorth1.add(tfEname);
		pNorth1.add(new JLabel("월급"));		pNorth1.add(tfSal);
		pNorth1.add(new JLabel("업무"));		pNorth1.add(tfJob);

		JPanel pNorth2 = new JPanel();
		pNorth2.setLayout(new GridLayout(4,1));
		pNorth2.add(bInsert);
		pNorth2.add(bUpdate);
		pNorth2.add(bDelete);
		pNorth2.add(bSelectAll);

		pNorth.add(pNorth1);
		pNorth.add(pNorth2);

		f.add(pNorth, BorderLayout.NORTH);
		f.add(new JScrollPane(ta), BorderLayout.CENTER);

		f.setBounds(200, 200, 600, 500);
		f.setVisible(true);
	}

	// ******************************************************************************
	// 버튼 및 텍스트필드 이벤트 관련
	void eventProc() {
		// 입력버튼이 눌렸을 때
		bInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				try {
					// 1. 사용자 입력값 얻어오기
					int empno = Integer.parseInt(tfEmpno.getText());
					String ename = tfEname.getText();
					int sal = Integer.parseInt(tfSal.getText());
					String job = tfJob.getText();

					// 2. 여러 입력값들을 하나의 VO 객체로 지정
					EmpVO r = new EmpVO();
					r.setEmpno(empno);
					r.setEname(ename);
					r.setSal(sal);
					r.setJob(job);

					model.insert(r);
					clearTexts();
					selectAll();

				} catch (Exception ex) {
					ta.append("연결 실패 : " + ex.getMessage());
				}
			}
		});

		// 사번 텍스트필드에서 사번 입력 후 엔터 쳤을 때
		tfEmpno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int empno = Integer.parseInt(tfEmpno.getText());

				try {
					EmpVO vo = model.selectByEmpno(empno);
					// 각각 화면 텍스트필드에 지정(출력)
					tfEmpno	.setText(Integer.toString(vo.getEmpno()));
					tfEname	.setText(vo.getEname());
					tfSal	.setText(Integer.toString(vo.getSal()));
					tfJob	.setText(vo.getJob());

				}catch(Exception ex) {
					ta.setText("검색 실패 : " + ex.getMessage());
				} //end try-catch
			}
		});	//끝

		// 사번 입력 후 삭제버튼 눌렸을 때
		bDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int empno = Integer.parseInt(tfEmpno.getText());
				try {
					
					int resultCnt = model.delete(empno);
					if(resultCnt == 0) {
						JOptionPane.showMessageDialog(null, "사번이 틀렸습니다.");
					}
				} catch (Exception ex) {
					System.out.println("삭제 실패 : " + ex.getMessage());
				}
				
				
				selectAll();
			}
		});
		
		// 수정 버튼이 눌렸을 때
		bUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					// 1. 사용자 입력값 얻어오기
					int empno = Integer.parseInt(tfEmpno.getText());
					String ename = tfEname.getText();
					int sal = Integer.parseInt(tfSal.getText());
					String job = tfJob.getText();

					// 2. 여러 입력값들을 하나의 VO 객체로 지정
					EmpVO vo = new EmpVO();
					vo.setEmpno(empno);
					vo.setEname(ename);
					vo.setSal(sal);
					vo.setJob(job);

					model.modify(vo);
					clearTexts();
					JOptionPane.showMessageDialog(null, "'Modify'버튼눌렸습니다.");
					selectAll();
					
				} catch (Exception ex) {
					ta.append("수정 실패 : " + ex.getMessage());
				}
				
				
			}
		});

		// 전체검색 버튼이 눌렸을 때
		bSelectAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearTexts();
				selectAll();
				JOptionPane.showMessageDialog(null, "'전체검색'버튼눌렸습니다.");
			}
		});
	}

	// clearTexts
	void clearTexts() {
		tfEmpno.setText(""); // 입력칸 초기화
		tfEname.setText("");
		tfSal.setText("");
		tfJob.setText("");
		ta.setText("");
	} // end clearTexts()

	// selectAll
	void selectAll() {
		try {
			ArrayList<EmpVO> list = model.selectAll();

			ta.setText(" ===================================== 검색결과 =====================================\n\n");
			// 기본 for -> 향상된 for 수정
			for(EmpVO empVO : list) {
				
				ta.append(empVO.toString());
			}

		} catch (Exception ex) {
			System.out.println("전체 검색 실패 :" + ex.getMessage());
			ex.printStackTrace();
		} //end try-catch
	}	//end searchAll


	public static void main(String[] args) {
		EmpView view = new EmpView();
		view.addLayout();
		view.eventProc();

	}

}
