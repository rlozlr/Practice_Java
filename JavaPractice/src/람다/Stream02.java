package 람다;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Stream02 {

	public static void main(String[] args) {

		int arr[] = {5, 6, 1, 2, 4, 7, 8, 9, 3, 2, 4, 7, 8};

//		::println => toString 존재할 경우 유용
//		IntStream arrStream = Arrays.stream(arr);
//		arrStream.filter(n-> n % 2 == 0)
//		.sorted()
//		.forEach(System.out::println);
		
		// reduce() : 계산 ex a = a - b
//		int a = 0; // 초기값
		int sum = Arrays.stream(arr).reduce(0, (a,b)-> a+b);
		int mul = Arrays.stream(arr).reduce(1, (a,b)-> a*b);
		int mul2 = Arrays.stream(arr)
				.filter(n-> n % 2 == 0)
				.distinct()
				.reduce(1, (a,b)-> a*b);
		System.out.println("합계: "+sum);
		System.out.println("곱셈: "+mul);
		System.out.println("짝수곱셈: "+ mul2);
	}

}
