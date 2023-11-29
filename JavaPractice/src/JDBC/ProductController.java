package JDBC;

import java.util.List;
import java.util.Scanner;

public class ProductController {
	/* 상품등록, 상품리스트보기, 상품상세보기, 상품수정, 상품삭제 
	 * Controller <-> Service  <-> DAO <-> DB 
	 * Controller에서 분기처리 모든 메뉴를 처리 */
	
	private Scanner scan;
	private Service svc;	// package에 inteface로 생성
	private Boolean flag;	// 종료변수
	
	public ProductController() {
		scan = new Scanner(System.in);
		svc = new ProductServiceImpl();	// service 구현체 class로 생성
		flag = true;
		printMenu();
	}

	private void printMenu() {
		// flag가 true면 계속 메뉴출력
		while(flag) {
			System.out.println("--상품관리프로그램--");
			System.out.println("1.상품등록 | 2. 상품목록 | 3. 상품검색(상세)");
			System.out.println("4.상품수정 | 5. 상품삭제 | 6. 종료");
			System.out.print(">> ");
			
			int menu = scan.nextInt();
			
			switch(menu) {
			case 1: register(); break;
			case 2: list(); break;
			case 3: detail(); break;
			case 4: modify(); break;
			case 5: remove(); break;
			default : flag = false; break;
			}
		}
		
	}

	private void remove() {
		System.out.print("삭제할 상품번호 >> ");
		int pno = scan.nextInt();
		int isOk = svc.remove(pno);
		System.out.println(" >>> 상품삭제 " + ((isOk > 0) ? "OK" : "Fail"));
	}

	private void modify() {
		// 상품번호를 받아서 해당 상품의 내용을 수정 => 번호, 이름, 가격, 설명 수정
		// update 구문 사용 
		System.out.print("수정할 상품번호 >> ");
		int pno = scan.nextInt();
		System.out.print("상품명 >> ");
		scan.nextLine();
		String name = scan.nextLine();
		System.out.print("가격 >> ");
		int price = scan.nextInt();
		System.out.print("상품상세내역 >> ");
		scan.nextLine();
		String madeby = scan.nextLine();
		
		Product p = new Product(pno, name, price, madeby);
		// update 구문사용 => 리턴은 1 또는 0
		int isOk = svc.modify(p);
		System.out.println(" >>> 상품수정 " + ((isOk > 0) ? "OK" : "Fail"));
	}

	private void detail() {
		System.out.print("상품번호 >> ");
		int pno = scan.nextInt();
		Product p = svc.detail(pno);
		System.out.println(p);
	}

	// 상품목록
	private void list() {
		List<Product> list = svc.list();
		
		for(Product p : list) {
			System.out.println(p);
		}
		
	}

	// 상품등록
	private void register() {
		System.out.print("상품명 >> ");
		scan.nextLine();
		String name = scan.nextLine();
		System.out.print("가격 >> ");
		int price = scan.nextInt();
		System.out.print("상품상세내역 >> ");
		scan.nextLine();
		String madeby = scan.nextLine();
		
		Product p = new Product(name, price, madeby);
		// svc에게 등록을 요청하는 메서드를 작성
		// insert를 하게되면 리턴되는 값은 몇개의 행이 insert되었는지 값이 리턴
		// isOk insert 후 리턴되는 값을 저장 잘되면 1이 리턴, 안되면 0이 리턴
		int isOk = svc.register(p);
		System.out.println(" >>> 상품등록 " + ((isOk > 0) ? "OK" : "Fail"));
		
	}
}
