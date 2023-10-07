package Lv4.로또;

import java.util.Scanner;

public class LottoMain {

	public static void main(String[] args) {

		LottoManager lm = new LottoManager();
		Scanner scan = new Scanner(System.in);
		
		int menu = 0;
		do {
			lm.printMenu();	//메뉴 출력 메서드화(호출)
			menu = scan.nextInt();
			
			switch(menu) {
			case 1: lm.createLotto(scan);
				break; 
			case 2: lm.createLottoAuto();
				break;
			case 3: lm.insertLottoAuto();
				break;
			case 4: lm.checkLotto();
				break;
			case 5: lm.printLotto();
				break;
			case 6: break;
			default:
				System.out.println("잘못된 메뉴입니다.");
			}
			
		}while(menu !=6);
		System.out.println("프로그램 종료");
		scan.close();

	}

}
