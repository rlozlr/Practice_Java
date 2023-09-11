package Lv2.퀘스트;

public class 구구단 {

	public static void main(String[] args) {
		/* 구구단 출력
		 * 단 1개를 주고, 구구단 출력
		 * 구구단 전체 출력
		 * */
		System.out.println("--원하는 단 출력--");
		printGugudan(2);
		System.out.println();
		System.out.println("--구구단 전체출력--");
		for(int i = 2; i <= 9; i++) {
			printGugudan(i);
		}

	}
	/* 기능 : 단이 주어지면 그 단의 구구단을 출력 (리턴X)
	 * 2*2=4
	 * 2*3-6
	 * ...
	 * 2*9=18
	 * */
	public static void printGugudan(int num) {
		for(int i = 1; i<=9; i++) {
			// 한 단씩 가로로 출력
			System.out.print(num+"*"+i+"="+num*i+" ");
			if(i == 9) {
				System.out.println();
			}
		}
	}
}
