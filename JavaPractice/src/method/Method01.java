package method;

public class Method01 {
	
	//메서드 선언위치

	public static void main(String[] args) {
		/* 메서드 : 가능 / 함수
		 * 접근제어자(제한자) : 접근할 수 있는 주체의 제한범위
		 * 리턴타입 : 메서드의 실행 결과로 받을 수 있는 정보의 값(자료형)
		 * 메서드명 : 메서드의 이름 => 소문자로 시작
		 * 매개변수 : 메서드를 실행하기 위해서 필요로 하는 값(자료형 변수명)
		 * 메서드 선언구현
		 * 접근제어자 리턴타입 메서드명(매개변수, 매개변수){
		 * 구현
		 * }
		 * 메서드 선언 위치
		 * 클래스 안, 다른 메서드 밖
		 * 메인 메서드랑 중복되면 안됨
		 * 결과를 호출할 수 있는건 main
		 * */
		
		// Ctrl+마우스로 가져다대면 정의나 소스를 볼 수 있다
		int sum = sum(3,5);
		System.out.println(sum);
		
		int sum1 = sum(sum,10);
		System.out.println(sum1);

		int mul = mul(3,5);
		System.out.println(mul);
		System.out.println(mul(5,8));
		
		sum2(10,20);
	}
	
	//메서드 선언위치
	/*기능 : 두 정수가 주어지면 두 정수의 합을 알려주는 메서드
	 * 리턴타입 : 알려줘야 하는 값 => 합 (int)
	 * 매개변수 : 두 정수 => int num1, int num2
	 * 메서드명 : sum
	 * */
	// 결과 값을 활용하려고할 때
	public static int sum(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	/* 기능 : 두 정수가 주어지면 두 정수의 곱을 알려주는 메서드
	 * 리턴타입 : 곱 (int)
	 * 매개변수 : 두 정수 (int num1, int num2)
	 * 메서드명 : mul
	 * */
//	public static int mul(int num1, int num2) {
//		int result = num1 * num2;
//		return result;
//	}
	
	// 선생님 코드
	public static int mul(int num1, int num2) {
		return 	num1 * num2;
	}
	
	/* 기능 : 두 정수가 주어지면 두 정수의 합을 출력
	 * 리턴타입 : 없음 (void)
	 * 매개변수 : 두 정수(int num1, int num2)
	 * 메서드명 : sum2
	 * */
	// 출력만하고 끝낼 때
	public static void sum2(int num1, int num2) {
		System.out.println(num1+num2);
		return; //메서드를 빠져나갈 때 
	}
	
}