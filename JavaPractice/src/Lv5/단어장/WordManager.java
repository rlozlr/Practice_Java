package Lv5.단어장;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class WordManager {
	ArrayList<Word<String, String>> words = new ArrayList<>();

	
	public WordManager() {
		addWord();
	}

	public void addWord() {
		words.add(new Word("hello", "안녕" ));
		words.add(new Word("apple", "사과" ));
		words.add(new Word("banana", "바나나" ));
	}
	
	//메뉴 추가
	public void add(Scanner scan) {
		System.out.print("단어> ");
		String w = scan.next();
		System.out.print("의미> ");
		String m = scan.next();
		
		words.add(new Word(w,m));
		System.out.println("***** 메뉴 추가 완료 *****");
	}
	
	// 출력
	public void printList() {
		System.out.println("---Word List---");
		for (int i = 0; i < words.size(); i++) {
			System.out.println((i + 1) + ". " + words.get(i));
		}
		System.out.println("------------------");
	}
	
	// TreeSet 오름차순
	public void printAsc() {
		TreeSet<String> wordList = new TreeSet<>();
		int index = 1;
		for(int i = 0; i < words.size(); i++) {
			wordList.add(words.get(i).getWord()+": "+words.get(i).getMean());
		}
		for(String str : wordList) {
			System.out.println(index + ". " + str);
			index++;
		}
	}
	
	// 검색
	public void searchWord(Scanner scan) {
		System.out.print("검색단어> ");
		String search = scan.next();
		for(int i = 0; i < words.size(); i++) {
			if(words.get(i).getWord().equals(search)) {
				System.out.println(words.get(i));
			}
		}
			
	}
	
	//삭제
	public void deleteWord(Scanner scan) {
		System.out.print("삭제단어> ");
		String delWord = scan.next();

		for(int i = 0; i < words.size(); i++) {
			if(words.get(i).getWord().equals(delWord)) {
				System.out.println("["+delWord+"] 삭제합니다.");
				words.remove(i);
			}
		}
	}
}