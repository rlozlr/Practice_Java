package 스트림;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BufferedReader02 {

	public static void main(String[] args) throws IOException {
		/* BufferedReader, PirntWriter
		 * 파일을 읽어들여, 복사하여 객체 생성
		 * test.txt -> test2.txt로 쓰기
		 * */
		
		BufferedReader br = null;
		PrintWriter pw = null;
		
		final String Path_OUT = "test2.txt"; // 복사할 객체명
		System.out.println("복사를 시작합니다.");
		
		br = new BufferedReader(new FileReader("test.txt"));
		pw = new PrintWriter(new FileWriter(Path_OUT));
		
		System.out.println("복사를 위한 객체 생성 완료!");
		
		String line = "";
		while((line = br.readLine())!=null) {
			System.out.println(line);	// 콘솔출력
			pw.println(line);	// 줄바꿈 포함
//			pw.write(line+"\r\n");	//줄바꿈 미포함
		}
		System.out.println("텍스트 복사 완료!");
		//br.close();
		//pw.close();
		if(br != null) { // 객체가 생성되었다면 끊기
			br.close();
		}
		if(pw != null) {
			pw.close();
		}
	}

}
