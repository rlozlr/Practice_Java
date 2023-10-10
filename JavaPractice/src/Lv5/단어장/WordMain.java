package Lv5.단어장;

import java.util.Scanner;

public class WordMain {

	public static void main(String[] args) {
		/* 단어장
		 * Word 클래스 생성
		 * 단어 : 의미
		 * hello : 안녕
		 * apple : 사과
		 * banana : 바나나
		 * 
		 * 단어를 추가, 출력(정렬해서 출력), 검색, 삭제
		 * */
		Scanner scan = new Scanner(System.in);
		WordManager wm = new WordManager();
		
		//출력
		wm.printList();
		System.out.println(); // 줄바꿈
		
		System.out.println("--단어추가--");
		wm.add(scan);
		System.out.println(); // 줄바꿈
		wm.printList();
		System.out.println(); // 줄바꿈
		
		System.out.println("--단어장 정렬--");
		wm.printAsc();
		System.out.println(); // 줄바꿈
		
		System.out.println("--검색--");
		wm.searchWord(scan);
		System.out.println(); // 줄바꿈
		
		System.out.println("--삭제--");
		wm.deleteWord(scan);
		wm.printList();
		System.out.println("--삭제된 단어장 정렬--");
		wm.printAsc();
	}

}
