package quest02;

public class MethodPractice {

	public static void main(String[] args) {
		/* 1. 랜덤(1~100) 정수 5개를 배열에 담는 메서드 (정수 배열을 리턴)
		 * 2. 배열을 전달받아서 평균을 연산하는 메서드 (평균을 리턴)
		 * 3. 배열의 정수 5개와 평균을 출력하는 메서드 (출력)
		 * 
		 * 메인에서는 연산식이 있으면 안됨.
		 * 메서드 간의 데이터 전달 및 호출만 있어야 함.
		 * 
		 * */
		int arr[] =random();
		double avg = average(arr);
		average();
		print(arr, avg);

	}
	/* 1. 랜덤(1~100) 정수 5개를 배열에 담는 메서드 (정수 배열을 리턴)
	 * 리턴타입 : 정수 배열 => int[]
	 * 매개변수 : X
	 * 메서드명 : random
	 */
	public static int[] random() {
		int arr[] = new int[5];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		return arr;
	}
	
	/* 2. 배열을 전달받아서 평균을 연산하는 메서드 (평균을 리턴)
	 * 리턴타입 : 평균을 리턴 => double
	 * 매개변수 : 배열 => int arr[]
	 * 메서드명 : average
	 * */
	public static double average(int[] arr) {
		int sum = 0;
		for(int tmp : arr) {
			sum+= tmp;
		}
		return (double)sum/arr.length;
	}
	
	/* 2. 배열을 전달받아서 평균을 연산하는 메서드 (평균을 리턴)
	 * 리턴타입 : X
	 * 매개변수 : X
	 * 메서드명 : average
	 * */
	//메서드 오버로딩 : 같은 메서드명을 쓰더라도, 매개변수의 종류나, 개수가 다르면 사용가능
	public static double average() {
		int arr[] = random();
		int sum = 0;
		for(int tmp : arr) {
			sum+= tmp;
		}
		double avg = (double)sum/arr.length;
		return avg;
		
	}
	
	/* 3. 배열의 정수 5개와 평균을 출력하는 메서드 (출력)
	 * 리턴타입 : void 없음
	 * 매개변수 : 정수배열, 평균 => int arr[], double avg
	 * 메서드명 : print
	 * */
	public static void print(int arr[], double avg) {
		System.out.print("5개의 랜덤 정수> ");
		for(int tmp : arr) {
			System.out.print(tmp+" ");
		}
		System.out.println("평균 : "+avg);
	}

}
