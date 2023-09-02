package quest1;

public class 별03 {

	public static void main(String[] args) {
		/*      *  i=1, 공백=4, *=1
		 *     **  i=2, 공백=3, *=2
		 *    ***  i=3, 공백=2, *=3
		 *   ****  i=4, 공백=1, *=4
		 *  *****  i=5, 공백=0, *=5  
		 * */

		for (int i = 1; i <= 5; i++) {	// 총 5줄 출력
			for (int j = 1; j <= 5-i; j++) {	// 왼쪽에서 오른쪽으로 찍어야하니까 i숫자만큼 뺀 공백(" ")을 먼저 찍기 
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) {	// 공백이 찍히고 나면 *을 i숫자만큼 찍기
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
