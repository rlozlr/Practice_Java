package 날짜;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTime01 {

	public static void main(String[] args) {
		/* LocalDateTime : 현재 날짜 시간 처리
		 * LocalTime : 시간만
		 * LocalDate : 날짜만
		 * */
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
		System.out.println(today.getYear());
		System.out.println(today.toString());
		
		String curr = today.toString();
		// T 기준으로 앞에 있는 연월일 추출
		String nowDate = curr.substring(0, curr.indexOf("T"));
		System.out.println(nowDate);
		// T 기준으로 뒤에 있는 시분초 추출
		String nowTime = curr.substring(curr.indexOf("T")+1,curr.lastIndexOf("."));
		System.out.println(nowTime);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyy/MM/dd(E) (a)HH:mm:ss");
		System.out.println(dtf.format(today));
		
		LocalDateTime sDate = LocalDateTime.of(1994, 8, 27, 15, 25);	// 날짜 생성
		System.out.println(sDate.format(dtf));
	}

}
