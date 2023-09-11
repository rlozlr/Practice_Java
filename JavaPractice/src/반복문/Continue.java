package 반복문;

public class Continue {

	public static void main(String[] args) {
		/* Continue : pass, skip 키워드
		 * 1~10까지 출력 5만 빼고 
		 * */
		
		for(int i=1; i<=10; i++) {
			if(i==5) {
				continue; // 조건에 맞다면 건너뛰기
			}
			System.out.print(i+" ");
		}

	}

}
