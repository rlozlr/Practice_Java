package quest1;

public class Array02 {

	public static void main(String[] args) {
		/* arr5 배열을 생성하고 짝수만 저장하고, 출력
		 * */
		int arr[] = new int[5];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (i+1)*2;
			System.out.print(arr[i]+" ");
		}
	}

}
