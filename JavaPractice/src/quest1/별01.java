package quest1;

public class 별01 {

	public static void main(String[] args) {
		/* 별 찍기
		 * 
		 * *****
		 * *****
		 * *****
		 * *****
		 * *****
		 * 
		 * 5*5로 별찍기
		 * 
		 * */
		for(int i = 1; i < 6; i++) {
			for(int j = 1; j < 6; j++) {
				System.out.print("*");
				if(j == 5) {
					System.out.println();
				}
			}
		}
	}

}
