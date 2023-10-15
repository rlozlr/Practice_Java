package 람다;

import java.util.ArrayList;

public class Lambda01 {

	public static void main(String[] args) {
		/* Lambda Expression : 람다식
		 * 함수형 프로그래밍(Functional Programming : FP)
		 * 순수한 함수를 구현하고 호출함으로써 외부 자료에
		 * 부수적인 영향(side effect)을 주지 않도록 구현하는 방식
		 * 순수함수(pure function) : 매개변수만을 사용하여 만드는 함수
		 * 즉, 함수 내부에서 함수 외부의 변수를 사용하지 않아
		 * 함수가 실행되더라도 외부의 영향을 전혀 주지 않는 형태
		 * */
		
		/* 리턴이 있으면 중괄호 필요.
		 * (int x, int y) -> {return x+y}
		 * 리턴이 없고, 처리가 하나면 중괄호 필요 없음.
		 * str -> System.out.println(str);
		 * */
		
		ArrayList<Integer> number = new ArrayList<>();
		
		number.add(45);
		number.add(20);
		number.add(5);
		number.add(30);
		number.add(15);
		System.out.println("--일반 for문을 이용한 출력--");
		for(Integer i : number) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.println("--람다식을 이용한 출력--");
		// forEach
		number.forEach((n)->System.out.print(n+" "));
		System.out.println();
		
		// 메서드에 직접 참조
		System.out.println("--메서드에 직접 참조--");
		number.forEach(System.out::println);
		
		// number의 총개수
		System.out.println("--스트림 이용한 총개수--");
		System.out.println(number.stream().count());

	}

}
