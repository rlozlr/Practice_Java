package Lv1.퀘스트;

public class Array06 {

	public static void main(String[] args) {
		// 정렬(오름차순) 교환
		// 선택정렬
		// 4 37 23 9 43
		// 4 37 23 9 43 PASS1
		// 4 9 37 23 43 PASS2
		// 4 9 23 37 43 PASS3
		// 4 9 23 37 43 PASS4

		// 버블정렬
		// 4 23 9 37 43 PASS1
		// 4 9 23 37 43 PASS2

		// tmp : 임시 변수
		// int tmp = a;
		// a = b;
		// b = tmp;

		int arr[] = new int[] { 4, 37, 23, 9, 43 };

		for (int i = 0; i < arr.length-1; i++) {	// 배열의 마지막에는 어차피 큰 수가 들어가므로
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) { //오름차순
					//교환
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		for(int tmp : arr ) {
			System.out.print(tmp+" ");
		}
		

	}

}
