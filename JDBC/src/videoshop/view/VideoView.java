package	 videoshop.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.AbstractTableModel;

import videoshop.chart.MyFrame;
import videoshop.model.dao.VideoModel;
import videoshop.model.vo.Video;


public class VideoView extends JPanel 
{	
	//	member field
	JTextField	tfVideoNum, tfVideoTitle, tfVideoDirector, tfVideoActor;
	JComboBox	comVideoGanre;
	JTextArea	taVideoContent;

	JCheckBox	cbMultiInsert;
	JTextField	tfInsertCount;

	JButton		bVideoInsert, bVideoModify, bVideoDelete;

	JComboBox	comVideoSearch;
	JTextField	tfVideoSearch;
	JTable		tableVideo;
	
	VideoTableModel tbModelVideo;
	
	// 모델 변수
	VideoModel model;

	//##############################################
	//	constructor method
	public VideoView(){
		addLayout(); 	// 화면설계
		initStyle();
		eventProc();
		connectDB();	// DB연결
	}
	
	public void connectDB(){	// DB연결
		try {
			model = new VideoModel();
		} catch (Exception e) {
			System.out.println("비디오관리 : " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void eventProc(){
		// '다중입고' 체크박스에 이벤트 발생하면
		cbMultiInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfInsertCount.setEditable(cbMultiInsert.isSelected());
			}
		});
		
		ButtonEventHandler hdlr = new ButtonEventHandler();
		bVideoInsert.addActionListener(hdlr);
		bVideoModify.addActionListener(hdlr);
		bVideoDelete.addActionListener(hdlr);
		tfVideoSearch.addActionListener(hdlr);
		
		// JTable에서 마우스 클릭했을 때
		tableVideo.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int row = tableVideo.getSelectedRow();
				int col = 0;
				Integer videoNum = (Integer)tableVideo.getValueAt(row, col);
				
				try {
				Video video = model.selectVideo(videoNum);
				// 각각 화면에 출력
				tfVideoNum		.setText(Integer.toString(video.getVideoNo()));
				tfVideoTitle	.setText(video.getVideoName());
				tfVideoDirector	.setText(video.getDirector());
				tfVideoActor	.setText(video.getActor());
				taVideoContent	.setText(video.getExp());
				comVideoGanre	.setSelectedItem(video.getGenre());
				
				} catch (Exception ex) {
					System.out.println("검색 실패 : " + ex.getMessage());
					ex.printStackTrace();
				}
			}
		});
		
	}	//end eventProc()
	
	// 버튼 이벤트 핸들러 만들기
	class ButtonEventHandler implements ActionListener{
		public void actionPerformed(ActionEvent ev){
			Object o = ev.getSource();
			
			if(o==bVideoInsert){  
				registVideo();					// 비디오 등록
			}
			else if(o==bVideoModify){  
				modifyVideo();					// 비디오 정보 수정
			}
			else if(o==bVideoDelete){  
				deleteVideo();					// 비디오 정보 삭제
			}
			else if(o==tfVideoSearch){
				searchVideo();					// 비디오 검색
				new MyFrame();
			}
		}
	}	//end ButtonEventHandler()
	
	// 입고 클릭시  - 비디오 정보 등록
	public void registVideo(){
		Video video = new Video();
		JOptionPane.showMessageDialog(null, "입고");
		int count = Integer.parseInt(tfInsertCount.getText());

		video.setVideoName(tfVideoTitle.getText());
		video.setDirector(tfVideoDirector.getText());
		video.setActor(tfVideoActor.getText());
		video.setExp(taVideoContent.getText());
		video.setGenre((String)comVideoGanre.getSelectedItem());
		
		try {
			model.insertVideo(video, count);
		} catch (Exception e) {
			System.out.println("비디오 입고 실패 : " + e.getMessage());
			e.printStackTrace();
		}

		// 화면 지우기
		clearTexts();
	}	//end registVideo()
	
	// 창 비우기
	void clearTexts() {
		tfVideoTitle	.setText("");
		tfVideoDirector	.setText("");
		tfVideoActor	.setText("");
		taVideoContent	.setText("");
	}	//end clearTexts()
	
	
	public void initStyle(){   // 입력하지 못하게 만듬.
		tfVideoNum.setEditable(false);
		tfInsertCount.setEditable(false);	
		//tfInsertCount.setEnabled(false);	// 완전히 막음
		tfInsertCount.setHorizontalAlignment(JTextField.RIGHT);
	}
	
	// 수정 클릭시 - 비디오 정보 수정
	
	// 비디오 수정
	public void modifyVideo(){
		
		try {
			// 1. 사용자 입력값 얻어오기
			String 	title 		= tfVideoTitle.getText();
			String 	director 	= tfVideoDirector.getText();
			String 	actor 		= tfVideoActor.getText();
			String 	exp 		= taVideoContent.getText();
			String 	genre 		= (String)comVideoGanre.getSelectedItem();
			int	vnum 			= Integer.parseInt(tfVideoNum.getText());

			// 2. 여러 입력값들을 하나의 VO 객체로 지정
			Video video = new Video();
			video.setVideoName(title);
			video.setDirector(director);
			video.setActor(actor);
			video.setExp(exp);
			video.setVideoNo(vnum);
			video.setGenre(genre);

			model.updateVideo(video);
			JOptionPane.showMessageDialog(null, "수정 완료");
			clearTexts();
			
		} catch (Exception ex) {
			System.out.println("수정 실패 : " + ex.getMessage());
		}
		
	}
	
	// 삭제 클릭시 - 비디오 정보 삭제
	public void deleteVideo(){
		
		JOptionPane.showMessageDialog(null, "삭제 완료");
		
		String videoNum = tfVideoNum.getText();
		try {
			model.deleteVideo(videoNum);
		} catch (Exception ex) {
			System.out.println("삭제 실패 : " + ex.getMessage());
		}
		
		clearTexts();
		
	}
	
	// 비디오현황검색
	public void searchVideo(){
		
		int index = comVideoSearch.getSelectedIndex();
		String keyword = tfVideoSearch.getText();
		
		if(keyword.isEmpty()) {
			JOptionPane.showMessageDialog(null, "전체 검색");
		} else {
			if(index == 0) {
				JOptionPane.showMessageDialog(null, "제목으로 검색");
			} else {
				JOptionPane.showMessageDialog(null, "감독명으로 검색");
			}
		}
		
		try {
			ArrayList data = model.searchVideo(index,keyword);
			tbModelVideo.data = data;
			tableVideo.setModel(tbModelVideo);
			tbModelVideo.fireTableDataChanged();
		} catch (Exception e) {
			System.out.println("검색 실패 : " + e.getMessage());
			e.printStackTrace();
		}
	}
		
	//  화면설계 메소드
	
	public void addLayout(){
		//멤버변수의 객체 생성
		tfVideoNum = new JTextField();
		tfVideoTitle = new JTextField();
		tfVideoDirector = new JTextField();
		tfVideoActor = new JTextField();
		
		String []cbJanreStr = {"멜로","액션","스릴","코미디"};
		comVideoGanre = new JComboBox(cbJanreStr);
		taVideoContent = new JTextArea();
		
		cbMultiInsert = new JCheckBox("다중입고");
		tfInsertCount = new JTextField("1",5);
	
		bVideoInsert = new JButton("입고");
		bVideoModify = new JButton("수정");
		bVideoDelete = new JButton("삭제");
		
		String []cbVideoSearch = {"제목","감독"};
		comVideoSearch = new JComboBox(cbVideoSearch);
		tfVideoSearch = new JTextField(15);
		
		tbModelVideo = new VideoTableModel();
		tableVideo = new JTable(tbModelVideo);

		//*********************************************************************
		// 화면 구성
		
		//왼쪽영역
		JPanel p_west = new JPanel();
		p_west.setLayout(new BorderLayout());
		
		// 왼쪽 가운데
		JPanel p_west_center = new JPanel();	
		p_west_center.setLayout(new BorderLayout());
		
		// 왼쪽 가운데의 윗쪽
		JPanel p_west_center_north = new JPanel();
		p_west_center_north.setLayout(new GridLayout(5,2));
		p_west_center_north.add(new JLabel("비디오번호"));
		p_west_center_north.add(tfVideoNum);
		p_west_center_north.add(new JLabel("장르"));
		p_west_center_north.add(comVideoGanre);
		p_west_center_north.add(new JLabel("제목"));
		p_west_center_north.add(tfVideoTitle);
		p_west_center_north.add(new JLabel("감독"));
		p_west_center_north.add(tfVideoDirector);
		p_west_center_north.add(new JLabel("배우"));
		p_west_center_north.add(tfVideoActor);

		// 왼쪽 가운데의 가운데
		JPanel p_west_center_center = new JPanel();
		p_west_center_center.setLayout(new BorderLayout());
		
		// BorderLayout은 영역 설정도 해야함
		p_west_center_center.add(new JLabel("설명"),BorderLayout.WEST);
		p_west_center_center.add(taVideoContent,BorderLayout.CENTER);

		// 왼쪽 화면에 붙이기
		p_west_center.add(p_west_center_north,BorderLayout.NORTH);
		p_west_center.add(p_west_center_center,BorderLayout.CENTER);
		p_west_center.setBorder(new TitledBorder("비디오 정보입력"));

		// 왼쪽 아래
		JPanel p_west_south = new JPanel();		
		p_west_south.setLayout(new GridLayout(2,1));
		JPanel p_west_south_1 = new JPanel();
		p_west_south_1.setLayout(new FlowLayout());
		p_west_south_1.add(cbMultiInsert);
		p_west_south_1.add(tfInsertCount);
		p_west_south_1.add(new JLabel("개"));
		p_west_south_1.setBorder(new TitledBorder("다중입력시 선택하시오"));
		
		// 입력 수정 삭제 버튼 붙이기
		JPanel p_west_south_2 = new JPanel();
		p_west_south_2.setLayout(new GridLayout(1,3));
		p_west_south_2.add(bVideoInsert);
		p_west_south_2.add(bVideoModify);
		p_west_south_2.add(bVideoDelete);
		p_west_south.add(p_west_south_1);
		p_west_south.add(p_west_south_2);
		p_west.add(p_west_center,BorderLayout.CENTER);
		p_west.add(p_west_south, BorderLayout.SOUTH);   // 왼쪽부분완성

		//---------------------------------------------------------------------
		// 화면구성 - 오른쪽영역
		JPanel p_east = new JPanel();
		p_east.setLayout(new BorderLayout());
		JPanel p_east_north = new JPanel();
		p_east_north.add(comVideoSearch);
		p_east_north.add(tfVideoSearch);
		p_east_north.setBorder(new TitledBorder("비디오 검색"));
		p_east.add(p_east_north,BorderLayout.NORTH);
		p_east.add(new JScrollPane(tableVideo),BorderLayout.CENTER);
		// 테이블을 붙일때에는 반드시 JScrollPane() 이렇게 해야함 


		// 전체 화면에 왼쪽 오른쪽 붙이기
		setLayout(new GridLayout(1,2));

		add(p_west);
		add(p_east);
		
	}
	
	//화면에 테이블 붙이는 메소드 
	class VideoTableModel extends AbstractTableModel { 
		  
		ArrayList data = new ArrayList();
		String [] columnNames = {"비디오번호","제목","장르","감독","배우"};

		//=============================================================
		// 1. 기본적인 TabelModel  만들기
		// 아래 세 함수는 TabelModel 인터페이스의 추상함수인데
		// AbstractTabelModel에서 구현되지 않았기에...
		// 반드시 사용자 구현 필수!!!!

		    public int getColumnCount() { 
		        return columnNames.length; 
		    } 
		     
		    public int getRowCount() { 
		        return data.size(); 
		    } 

		    public Object getValueAt(int row, int col) { 
				ArrayList temp = (ArrayList)data.get( row );
		        return temp.get( col ); 
		    }
		    
		    public String getColumnName(int col){
		    	return columnNames[col];
		    }
	}	//end VideoTableModel
	
}


