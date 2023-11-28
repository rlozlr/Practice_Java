package Step2_word;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordManager {
	List<Word<String, String>> list = new ArrayList<>();

	public WordManager() {
		addWord();
		
	}

	public void addWord() {
		// 기본 단어
		list.add(new Word("hola", "안녕하세요"));
		list.add(new Word("gracias", "감사합니다"));
		list.add(new Word("beber", "마시다"));
	}

	// 등록
	public void insert(Scanner scan) {
		System.out.print("입력 단어 개수 > ");
		int num = scan.nextInt();

		for(int i =1; i <= num; i++) {
			System.out.print("단어 > ");
			String word = scan.next();
			System.out.print("의미 > ");
			String mean = scan.next();

			list.add(new Word(word, mean));
		}

		System.out.println("--단어 [" + num + "]개 등록완료--");
		System.out.println();

	}

	// 검색
	public void search(Scanner scan) {
		System.out.print("찾는단어 > ");
		String word = scan.next();
		
		for(Word tmp : list) {
			if(tmp.getWord().equals(word)) {
				System.out.println(tmp);
				return;
			}
		}
		System.out.println("찾는 단어가 없습니다.");

	}

	// 수정
	public void modify(Scanner scan) {
		System.out.print("의미를 수정할 단어 > ");
		String word = scan.next();
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getWord().equals(word)) {
				System.out.print("수정할 의미 > ");
				String mean = scan.next();
				Word w = new Word(word, mean);
				list.set(i, w);
				return;
			}
		}
		System.out.println("찾는 단어가 없습니다.");

	}

	// 출력
	public void print(Scanner scan) {
		for (Word tmp : list) {
			System.out.println(tmp);
		}

	}

	// word.txt로 만들기
	public void textFile() throws IOException {
		FileWriter fw = new FileWriter("word.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		StringBuffer sb = new StringBuffer();
		
		String data = "";
		int idx = 0;
		
		while(idx < list.size()) {
			sb.append(list.get(idx).toString());
			sb.append("\r\n");	// 줄바꿈
			idx++;
		}
		
		data = sb.toString();
		System.out.println(data);
		fw.write(data);
		fw.close();
		bw.close();
		
	}
	
}
