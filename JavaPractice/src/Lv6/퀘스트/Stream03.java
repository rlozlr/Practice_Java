package Lv6.퀘스트;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Stream03 {

	public static void main(String[] args) {
		/* 배열에서 짝수만 출력(정렬)
		 * */
		int arr[] = {5, 6, 1, 2, 4, 7, 8, 9, 3, 2, 4, 7, 8};

		System.out.println("배열에서 짝수만 출력(정렬)");
		Arrays.stream(arr)
		.filter(n-> n % 2 == 0)
		.sorted()	//정렬
		.forEach(a-> System.out.printf(a+" "));
		System.out.println();
		System.out.println("-------------------");
		
		System.out.println("배열에서 홀수만 출력(정렬)");
		Arrays.stream(arr)
		.filter(n-> n % 2 == 1)
		.sorted()
		.distinct()	// 중복제거
		.forEach(a-> System.out.printf(a+" "));
		System.out.println();
		System.out.println("-------------------");
		
		System.out.print("짝수만 받은 배열 : ");
		int result[] = Arrays.stream(arr)
				.filter(n-> n % 2 == 0)
				.sorted()
				.distinct()
				.toArray(); // 배열로 리턴
		for(int tmp : result) {
			System.out.print(+tmp+" ");
		}
		System.out.println();

	}

}
