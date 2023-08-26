package quest;

public class Operator {

	public static void main(String[] args) {
		/* num가 짝수인지 홀수인지 출력
		 * 조건선택 연산자를 사용
		 * 짝수란 2로 나누어서 나머지가 0인 값
		 * */
		
		int num = 3; //임의로 정해준 숫자
		
		/* num를 2로 나누어서 나머지가 0
		 * true : 짝수
		 * flase : 홀수
		 */
		System.out.println((num%2==0)? "짝수":"홀수");

	}

}
