package ifswitch;

public class Switch {

	public static void main(String[] args) {
		/* switch문 : 값에 따라 케이스를 달리주는 형식
		 * 
		 * switch(변수/식){
		 * case 값1 : 실행문1; break;
		 * case 값2 : 실행문2; break;
		 * case 값3 : 실행문3; break;
		 * default : 나머지 실행문;
		 * }
		 * break; : switch문을 빠져나갈 떄 사용
		 * */
		
		int num = 3;
		switch(num) {
		case 1:
			System.out.println("num는 1입니다.");
			break;
		case 2:
			System.out.println("num는 2입니다.");
			break;
		case 3:
			System.out.println("num는 3입니다.");
			break;
			default:
				System.out.println("잘못된 입력입니다.");
		}
	}
}
