package Lv6.학생성적;

import java.util.ArrayList;

public class GradeCard {

	public static void main(String[] args) {
		// Student 클래스를 가지는 List 생성
		// 5명 정도의 값을 추가
		ArrayList<Student> std = new ArrayList<>();
		std.add(new Student("아이언맨",90));
		std.add(new Student("헐크",76));
		std.add(new Student("스파이더맨",48));
		std.add(new Student("스트레인지",89));
		std.add(new Student("슈퍼맨",45));
		
		// stream 구성 후 출력
		// toString 존재할 경우
		std.stream().forEach(System.out::println);
		System.out.println("---------------");
		
		// toString이 없을 경우
		// {} 처리 구문이 많을 경우
		std.stream().forEach(n ->{
			String name = n.getName();
			int score = n.getScore();
			System.out.println(name+" : "+score);
		});
		System.out.println("---------------");
		
		// 성적 합계 출력
		int scoreSum = std.stream()
				.mapToInt(t->t.getScore())
				.sum();
		System.out.println("성적합계: "+scoreSum);
		
		// 점수가 70점 이상인 인원수 출력
		Long count = std.stream()
				.mapToInt(t->t.getScore())
				.filter(n-> n>=70)
				.count();
		System.out.println("70점 이상: "+count+"명");
	}

}
