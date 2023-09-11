package Lv2.퀘스트;

public class MethodPractice02 {

	public static void main(String[] args) {
		/* 배열이 주어졌을 때, 배열을 출력하는 메서드 생성
		 * */
		int arr[] = new int[] {1,2,9,13,7,5,6,10,4,8,3,11,12,14,15};
		System.out.println("----배열----");
		printArray(arr);
		System.out.println("----배열정렬----");
		sortArray(arr);
		printArray(arr);
		System.out.println("----랜덤배열----");
		printArray(randomArray(10));
	}
	/* 배열을 받아서 콘솔에 출력하는 메서드
	 * 매개변수 : int arr[]
	 * 리턴타입 : void
	 * 메서드명 : printArray()
	 * 옆으로 출력 / 5개씩 한출로 나열
	 * */
	public static void printArray(int arr[]) {
		int cnt = 0;
		for(int tmp : arr) {
			System.out.print(tmp+" ");
			cnt++;
			if( cnt % 5 == 0) {
				System.out.println();
			}
		}
	}
	
	/* 주어진 정수 배열을 정렬하는 기능
	 * 매개변수 : int arr[]
	 * 리턴타입 : void
	 * 메서드명 : sortArray()
	 * */
	public static void sortArray(int arr[]) {
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	
	/* 새로운 배열을 만들어서 랜덤 수를 채워 리턴하는 메서드 
	 * 랜덤 수 범위 (1~100까지)
	 * 배개변수 : 배열 개수
	 * 리턴타입 : 배열 
	 * 메서드명 : randomArray()
	 * */
	public static int[] randomArray(int size) {
		int arr[] = new int [size];
		for(int i = 0; i < size; i ++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		return arr;
	}
}
