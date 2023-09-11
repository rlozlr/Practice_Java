package 배열;

public class ArrayCopy {

	public static void main(String[] args) {
		/* arraycopy : 배열 복사
		 * 객체를 다시 생성해서 값을 복사
		 * 배열은 길이를 가지고 있음.
		 * 한 번 정해진 길이는 늘이거나 줄일 수 없음.
		 * 이후 추가/삭제 불가능.
		 * 배열의 길이를 늘이거나 줄이고 싶은 경우 배열 복사를 통해
		 * 길이를 조절.
		 * */
		int arr[] = new int[3];
		arr[0] = 10;
		arr[1] = 15;
		arr[2] = 20;
		
		for(int tmp : arr) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		System.out.println("----------------");
		
		//수동으로 배열을 복사
		int arr1[] = new int[5];
//		for(int i=0; i<arr.length; i++) {
//			arr1[i]= arr[i];
//		}
		
		//arraycopy를 이용
		System.arraycopy(arr, 0, arr1, 0, arr.length);
		
		for(int tmp : arr) {
			System.out.print(tmp+" ");
		}
	}

}
