package y_useful;
import java.time.DayOfWeek;
import java.util.*;

/*
 * 		날짜 관련 클래스 : java.util 패키지 안
 * 		
 * 			` Date
 * 			` Calendar
 * 			` LocalDate
 * 			` LocalDateTime
 */

public class Calendar샘플 {
	public static void main(String[] args) {
		
		Calendar c 	= Calendar.getInstance();
		
		int year 	= c.get(Calendar.YEAR);			//	년 불러오기
		int month 	= c.get(Calendar.MONTH) + 1;	//	월 불러오기	* 1월 == 0
		int date 	= c.get(Calendar.DATE);			//	일 불러오기
		
		System.out.println(year + "년 " + month + "월 " + date + "일");
		
		int hour 	= c.get(Calendar.HOUR);			//	시 불러오기
		int min		= c.get(Calendar.MINUTE);		//	분 불러오기
		int sec		= c.get(Calendar.SECOND);		//	초 불러오기
		
		System.out.println(hour + "시 " + min + "분 " + sec + "초");
		
		//요일 구하기
		//일요일 : 1
		String [] day_of_week = {"일","월","화","수","목","금","토"};
		int week_int = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(day_of_week[week_int-1] + "요일입니다.");
		
	}
}







































