package Lv7.단어장;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordManager {

	private ArrayList<Word> list = new ArrayList<Word>();
	
	public WordManager() {
		add();
	}
	//메뉴출력
	public void printMenu() {
		System.out.println("--단어장 프로그램--");
		System.out.println("1.단어등록|2.단어검색|3.단어수정\r\n"
				+"4.단어출력|5.단어삭제|6.단어파일출력|7.종료");
		System.out.println("------------------------");
		System.out.println("메뉴선택 > ");
	}
	//기본단어 등록
	public void add() {
		list.add(new Word("hola", "안녕"));
		list.add(new Word("agua", "물"));
		list.add(new Word("gracias", "감사합니다"));
		list.add(new Word("tomar", "마시다"));
		list.add(new Word("comer", "먹다"));
	}
	
	//단어 추가
	public void insertWord(Scanner scan) {
		System.out.println("단어: ");
		String word = scan.next();
		System.out.println("의미: ");
		String mean = scan.next();
		
		list.add(new Word(word, mean));
		
	}
	
	public void searchWord(Scanner scan) {
		System.out.println("검색단어 > ");
		String word = scan.next();
		for(Word w : list) {
			if(w.getWord().equals(word)) {
				System.out.println("--검색결과--");
				System.out.println(w);
				//return;
			}
		}
		System.out.println("검색 단어가 없음.");
	}
	public void modifyWord(Scanner scan) {
		// 단어수정
		System.out.println("검색단어 > ");
		String word = scan.next();
		boolean result = list.remove(new Word(word,null));
		if(!result) {
			System.out.println("검색 단어 없음.");
			return;
		}
		System.out.println("수정단어 :");
		String newWord = scan.next();
		System.out.println("수정의미 :");
		String newMean = scan.next();
		
		Word w = new Word(newWord,newMean);
		list.add(w);			

	}
	public void printWord() {
		// 단어출력
		System.out.println("--단어장--");
		Collections.sort(list);
		for(Word w : list) {
			System.out.println(w);
		}
		System.out.println("---------");
		
	}
	public void deleteWord(Scanner scan) {
		// 단어삭제
		System.out.println("삭제단어 > ");
		String word = scan.next();
		boolean result = list.remove(new Word(word,null));
		if(!result) {
			System.out.println("검색 단어 없음.");
			return;
		}
		
	}
	public void fileWord() throws IOException {
		// 파일출력
		FileWriter fs = new FileWriter("word.txt");
		BufferedWriter bw = new BufferedWriter(fs);
		
		StringBuffer sb = new StringBuffer();
		//.append : 데이터 추가
		String data = null;
		sb.append("--단어장--");
		sb.append("\r\n");  //줄바꿈
		Collections.sort(list);
		int cnt = 0;
		while(cnt < list.size()) {
			sb.append(list.get(cnt));
			sb.append("\r\n");  //줄바꿈
			cnt++;
		}
		data = sb.toString();
		System.out.println(data);
		bw.write(data);
		
		bw.close();
		fs.close();

	}
}
