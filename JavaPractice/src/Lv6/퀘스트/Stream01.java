package Lv6.퀘스트;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Stream01 {

	public static void main(String[] args) {
		/* 성적 배열에서 70이상인 점수만 합계를 출력*/
		int[] numArr = {50, 78, 96, 85, 45, 35, 12};
		
		// stream으로 출력
		int sum3 = Arrays.stream(numArr).filter(n->n>=70).sum();
		System.out.println("Stream으로 구현 : " + sum3);
		
		// 리스트로 스트림 생성
		// 리스트로 성적 리스트 생성 70 이상인 점수만 합계
		ArrayList<Integer> list = new ArrayList<>();
		list.add(78);
		list.add(98);
		list.add(45);
		list.add(85);
		list.add(64);
		list.add(52);
		
		// sum int스트림에서만 사용가능
		int listSum = list.stream()
				.filter(n->n>=70)
				.mapToInt(t->t.intValue())
				.sum();
		System.out.println("Integer stream : "+listSum);
		
		Stream<Integer> s = list.stream();
		s.filter(b -> b>=70).forEach(n -> System.out.print(n+" "));
		System.out.println();
		System.out.println("==============================");
		
		System.out.println("list 개수 : "+ list.stream()
				.mapToInt(n-> n.intValue())
				.count()+"개");
	}

}
