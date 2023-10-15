package Lv7.퀘스트;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class BufferedReader01 {

	public static void main(String[] args) throws IOException {
		/* BufferedReader, FileReader를 이용하여 out.txt 파일을
		 * map에 저장하고, 합계와 총 인원수를 출력
		 * 입력한 값을 읽어들이면 값은 같은 String
		 * 계산을 위해서는 int 자료형으로 변환이 필요
		 * Integer.parseInt(값) : String => int*/
		
		BufferedReader br = new BufferedReader(new FileReader("out.txt"));
		HashMap<String, Integer> map = new HashMap<>();
		
		while(true) {
			String line = br.readLine();
			if(line == null) {
				break;
			}
//			substring(포함, 미포함)
			String name = line.substring(0, line.indexOf(" "));
//			Integer.parseInt(값) : String => int
			int score = Integer.parseInt(line.substring(line.indexOf(" ")+1));
			map.put(name, score);
		}
		System.out.println(map);
		int sum = 0;
		for(String key : map.keySet()) {
			System.out.println(key+":"+map.get(key));
			sum += map.get(key);
		}
		System.out.println("인원수: "+map.size()+" 합계: "+sum);

	}

}
