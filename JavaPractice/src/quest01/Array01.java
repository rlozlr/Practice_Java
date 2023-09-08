package quest01;

public class Array01 {

	public static void main(String[] args) {
		/* 배열을 생성하고, 1 2 3 4 5로 저장하고, 출력
		 * int[] arr = new int[5]; // 일반적인 방법
		 * */
		
		int arr[] = new int[] {1, 2, 3, 4, 5};
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
