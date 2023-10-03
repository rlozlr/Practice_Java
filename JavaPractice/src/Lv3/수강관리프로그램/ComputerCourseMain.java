package Lv3.수강관리프로그램;

import java.util.Scanner;

public class ComputerCourseMain {

	public static void main(String[] args) {
		// ComputerCourse의 객체 생성 후 출력
		ComputerCourse std1 = new ComputerCourse("야도란","010-1111-1111","서울점") ;
		std1.printInfo();
		std1.printCompany();
		std1.insertCourse("java", "6개월");
		std1.printCourse();
		System.out.println("-------------");
		
		/* 학생클래스를 담을 수 있는 배열[7]을 생성 후 
		 * 7명의 학생을 등록
		 * */
		ComputerCourse[] std = new ComputerCourse[7];
		std[0] = std1;
		std[1] = new ComputerCourse("피카츄","990101",24,"1111","서울");
		std[2] = new ComputerCourse("꼬부기","990112",25,"2222","경기");
		std[3] = new ComputerCourse("토게피","990123",26,"3333","인천");
		std[4] = new ComputerCourse("파이리","990104",27,"4444","서울");
		std[5] = new ComputerCourse("망나뇽","990204",21,"5555","서울");
		std[6] = new ComputerCourse("롱스톤","990304",23,"6666","인천");
		std[0].insertCourse("DB", "1개월");
		std[1].insertCourse("html", "2개월");
		std[1].insertCourse("java", "6개월");
		
		// 학생이름으로 검색 => 모든정보 출력
		Scanner scan = new Scanner(System.in);
		int cnt =0;
		System.out.print("학생명> ");
		String searchName = scan.next();
		System.out.println(searchName+" 님의 정보----------");
		for(int i =0; i<std.length; i++) {
				if(std[i].getName().equals(searchName)) {
					std[i].printInfo();
					std[i].printCompany();
					std[i].printCourse();
					cnt++;
				}
		}
		if(cnt == 0) {
			System.out.println("존재하지 않는 학생입니다.");
		}
		System.out.println("--------------------------");
		System.out.println();
		
		// 과목을 수강하는 학생만 검색 => 학생정보, 수강정보 출력
		System.out.print("지점명> ");
		String searchBranch = scan.next();
		System.out.println(searchBranch +"지점의 학생들 정보--------");
		for(ComputerCourse str : std) {
			if(str.getBranch().equals(searchBranch)) {
				str.printInfo();
			}
		}
		
		System.out.println("--------------------------");
		System.out.println();


		 // 지점정보로 검색 => 학생정보만 출력
		System.out.print("과목명> ");
		String searchCourse = scan.next();
		System.out.println(searchCourse +"를 수강하는 학생들 정보--------");
		for(ComputerCourse str : std) {
			for(int i = 0; i <str.getCnt(); i++) {
				if(str.getCourse()[i].equals(searchCourse)) {
					System.out.println("==========================");
					str.printInfo();
					str.printCourse();
				}
			}
		}
		System.out.println("--------------------------");
		System.out.println();
		
		scan.close();
	}

}
