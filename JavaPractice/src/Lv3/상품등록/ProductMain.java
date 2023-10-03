package Lv3.상품등록;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
//		ProductMain class 생성
//		Product 배열 생성[10]
//		상품 등록 후 상품리스트 출력
//		상품을 등록하시겠습니까? (y/n)  y
//		y=등록, n=취소
//		상품이름과 가격을 등록받아 배열에 등록
//		n => 등록된 제품 리스트 출력
		
		Product[] p = new Product[10];
		Scanner scan = new Scanner(System.in);
		
		String menu = "y";
		int cnt = 0;
		while(!menu.equals("n")) {
			System.out.print("상품을 등록하시겠습니까? (y/n)> ");
			menu = scan.next();
			
			if(menu.equals("y")) {
				System.out.print("상품명> ");
				String name = scan.next();
				System.out.print("가격> ");
				int price = scan.nextInt();
				
				 
				p[cnt] = new Product();
				p[cnt].insertMenu(name, price);
				cnt++;
			}else {
				if( menu.equals("n")) {
					System.out.println("상품등록 취소");
				} else {
					System.out.println("y/n만 입력 가능");
				}
			}
		}
		
		System.out.println("--- 등록된 상품 리스트 ---");
		for(int i = 0; i < cnt; i++) {
			System.out.println((i+1)+". "+p[i]);
		}
		scan.close();
	}

}
