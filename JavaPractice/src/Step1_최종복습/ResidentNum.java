package Step1_최종복습;

public class ResidentNum {

	public static void main(String[] args) {
		/* 홍길동 주민등록번호는 881122-1234567이다
		 * 출력형태 => 생년월일 : 881122, 성별 : 남(1,3) 여 (2,4)
		 * */
		String pin = "881122-42234567";
		int birth = Integer.parseInt(pin.substring(0,6));	// 생년월일
		int gender = Integer.parseInt(pin.substring(7,8));	// 성별
		
		System.out.println("생년월일 : "+birth);
		if(gender == 1 || gender == 3) {
			System.out.println("성별 : " + "남");
		}else if(gender == 2 || gender == 4 ) {
			System.out.println("성별 : "+ "여");
		}
	}

}
