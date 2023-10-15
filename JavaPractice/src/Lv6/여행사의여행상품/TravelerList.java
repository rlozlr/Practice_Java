package Lv6.여행사의여행상품;

import java.util.ArrayList;

public class TravelerList {

	public static void main(String[] args) {
		/* 여행상품이 있습니다.
		 * 여행 비용은 15세 이상은 100만원, 15세 미만은 50만원
		 * 고객 3명이 패키지 여행을 떠나려고 할 때
		 * 1. 여행비용 계산
		 * 2. 고객명단 출력
		 * 
		 * 고객은 class로 생성. ArrayList로 고객 3명 추가
		 * 고객 정보
		 * 이름 : 이순신, 나이 : 40, 비용 : 100
		 * 이름 : 김순이, 나이 : 35, 비용 : 100
		 * 이름 : 이아들, 나이 : 10, 비용 : 50
		 * 총 여행경비: 250만원
		 * */
		
		ArrayList<Traveler> customer = new ArrayList<>();
		customer.add(new Traveler("헐크",40));
		customer.add(new Traveler("아이언맨",35));
		customer.add(new Traveler("그루트",10));
		
		// 가격
		for(int i =0; i < customer.size(); i++) {
			if(customer.get(i).getAge()>= 15) {
				customer.get(i).setPrice(100);
			}else {
				customer.get(i).setPrice(50);
			}
			
		}
		
		// 어른 몇 명
		Long adultCount = customer.stream()
				.mapToInt(a-> a.getAge())
				.filter(b-> b>=15)
				.count();
		// 아이 몇 명
		Long kidCount = customer.stream()
				.mapToInt(a-> a.getAge())
				.filter(b-> b<15)
				.count();
		
		// 여행비용 계산
		int totalPrice = (int)(adultCount*100)+(int)(kidCount*50);
		System.out.println("총 여행경비: "+totalPrice+"만원");
		
		// 고객명단 출력
		System.out.println("----고객 명단----");
//		customer.stream().forEach(System.out::println);
		customer.stream().forEach(p->{
			String name = p.getName();
			int age = p.getAge();
			int price = p.getPrice();
			System.out.println("이름: "+name+", 나이: "+age+"세, 비용: "+price+"만원");
		});
		
		// 20세 이상 성인만 이름을 정렬하여 출력
		System.out.println("----20세 이상 정렬----");
		customer.stream().filter(n-> n.getAge()>=20)
		.sorted().forEach(n-> {
			String name = n.getName();
			int age = n.getAge();
			int price = n.getPrice();
			System.out.println("이름: "+name+", 나이: "+age+"세, 비용: "+price+"만원");
		});

	}
}
