package quest;

import java.util.Scanner;

public class 약수 {

	public static void main(String[] args) {
		/* num = 6의 약수를 출력
		 * 약수 : 나누어서 떨어지는 수
		 * 6의 약수 : 1 2 3 6
		 * 12의 약수 : 1 2 3 4 6 12
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("약수를 구하고자 하는 숫자> ");
		int num = sc.nextInt();
		
		System.out.print(num+"의 약수> ");
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}
		sc.close();
	}

}
