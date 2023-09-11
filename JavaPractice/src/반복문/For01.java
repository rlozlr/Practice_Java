package 반복문;

public class For01 {

	public static void main(String[] args) {
		/* 반복문 : 규칙적인 작업을 반복적으로 할 때 사용하는 문법
		 * for, while, do~while
		 * - for, while문은 동작 방식이 같음. 
		 * 		=> 조건에 맞지 않으면 한번도 실행 안될 수도 있음.
		 * - do~while문은 두 방식과 동작 방식이 조금 다름.
		 * 		=> 조건에 맞지 않아도 무조건 1번은 실행.
		 * 
		 * for(1초기화 ; 258조건식 ; 47증감식) {
		 * 	36실행문;
		 * }
		 * 
		 * - 초기화 : 조건식이나 실행문에서 사용할 변수를 초기화 : 생략가능
		 * 			처음 1번만 실행
		 * - 조건식 : 반복문의 반복을 결정하는 식(true => 반복) : 생략가능
		 * - 증감식 : 조건식에서 사용되는 변수를 증가 / 감소시켜 반복횟수를 조절
		 * */ 
		
		// 1~10까지 출력하는 예제
		// 초기화 : i변수 사용 => int i=1;
		// 조건식 : 10이 될 때까지 => i<=10;
		// 증감식 : i가 1씩 증가 => i++; / (i=i+2) => 2씩 증가
		// 실행문 : i 출력
		for(int i=1; i<=10; i++) {
			System.out.print(i+" ");
		}
		System.out.println(); //줄바꿈용
		System.out.println("---------------------------");
		
		// 10부터 1까지 출력하는 예제
		for(int i=10; i>=1; i--) {	// 10 >= 1
			System.out.print(i+" ");
		}
		System.out.println(); //줄바꿈용
		System.out.println("---------------------------");
		
		// 2부터 10까지 짝수만 출력 예제
		for(int i=2; i<=10; i=i+2) {
			System.out.print(i+" ");
		}
		System.out.println(); //줄바꿈용
		System.out.println("---------------------------");
		
		// 1부터 20까지 중 짝수만 출력 예제
		// if문을 사용하여 조건에 맞는 자료만 출력
		for(int i=1; i<=20; i++) {
			if (i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println(); //줄바꿈용
		System.out.println("---------------------------");
		
		// 1부터 10까지 홀수만 출력 / 짝수일 때는 PASS 출력
		for(int i=1; i<=10; i++) {
			if (i%2==0) {
				System.out.print("PASS ");
			}else {
				System.out.print(i+" ");
			}
		}
		System.out.println(); //줄바꿈용
		System.out.println("---------------------------");
		
		// 1부터 10까지 합계 출력
		// 초기화 : 1부터, 조건식 : 10까지, 증감식 : 1씩증가
		// 실행문 : 누적 더하기
		// 실행 후 출력
		// 지역변수() {생성	소멸}
		int sum=0;
		for(int i=1; i<=10; i++) {
			sum+=i; // 0+1+2+3+4+5...+10
		}
		System.out.println("1부터 10까지의 합 : "+sum);
		System.out.println("---------------------------");
		
		// 1부터 10까지 짝수의 합과 홀수의 합을 출력
		/* for 1부터, 10까지 1씩 증가하여 값을 비교
		 * if 짝수인지 판단 => 짝수의 합계
		 *    홀수인지 판단 => 홀수의 합계
		 * for문 종료후 => 출력   
		 * */
		int evenSum=0;
		int oddSum=0;
		for(int i=1; i<=10; i++) {
			if (i%2==0) {
				//짝수 합계를 누적
				evenSum+=i;
			}else {
				oddSum+=i;
			}
		}
		System.out.println("짝수의 총합은 "+evenSum+", 홀수의 총합은 "+oddSum+" 입니다.");
		System.out.println("---------------------------");
		
		
		
	}

}


