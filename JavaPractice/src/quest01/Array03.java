package quest01;

public class Array03 {

	public static void main(String[] args) {
		/* 1~10까지 담고 있는 배열 arr를 생성 후 내림차순으로 정렬하여 출력
		 * */
		int arr[] = new int[10];
		for(int i = 0; i < arr.length; i++) {
			for (int j = i+1; j<=i+1; j++) {
				arr[i] = j;
			}
		}
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					int tmp = arr[i];	// tmp는 임시로 만들어준 변수
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
