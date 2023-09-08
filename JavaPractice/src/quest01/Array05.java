package quest01;

public class Array05 {

	public static void main(String[] args) {
		/* Array 예제
		 * 5개의 값을 가지는 배열을 생성
		 * 1~50사이의 랜덤값을 저장한 후 출력
		 * */
		// 5개의 값을 가지는 배열 생성
		int arr[] = new int[5];
		
		//1~50사이의 랜덤값을 저장
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*50)+1;
		}
		//향상된 for문으로 출력
		for(int tmp : arr) {
			System.out.print(tmp+" ");
		}

	}

}
