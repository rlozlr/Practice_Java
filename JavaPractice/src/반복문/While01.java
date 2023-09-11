package 반복문;

public class While01 {

	public static void main(String[] args) {
		/* while : 반복문 중 하나
		 * while(조건식) { // true일 때 반복
		 * 	실행문;
		 * 	증감식;
		 * }
		 */
		
		/*1~10까지 출력
		 * */
		for(int i=1; i<=10; i++) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("-------------------------------");
		
		int i=0; // 초기화
		while(i<=10) {
			System.out.print(i+" ");
			i++;		
		}
		System.out.println();
		System.out.println("-------------------------------");

	}

}
