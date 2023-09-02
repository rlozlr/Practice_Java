package forwhile;

public class 이중For {

	public static void main(String[] args) {
		/*      *  i=1, 공백=4, *=1
		 *     **  i=2, 공백=3, *=2
		 *    ***  i=3, 공백=2, *=3
		 *   ****  i=4, 공백=1, *=4
		 *  *****  i=5, 공백=0, *=5  
		 * */
		// 선생님 코드
		// if문
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(j<=5-i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		

	}

}
