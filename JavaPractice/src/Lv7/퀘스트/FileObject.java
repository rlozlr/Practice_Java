package Lv7.퀘스트;

import java.io.File;

public class FileObject {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\folder1\\folder2\\JavaPractice\\JavaPractice\\out.txt");
		
		// 파일명과 경로가 String 형태로 들어온다면... 구분
		String fstr = file.toString();
		System.out.println(fstr);
		System.out.println("--------------------------");
		// fstr에서 드라이브만 추출
		System.out.println("--드라이브만 추출--");
		System.out.println(fstr.substring(0, fstr.indexOf(File.separator)));
		// fstr에서 파일명만 추출
		System.out.println("--파일형식까지 추출--");
		System.out.println(fstr.substring(fstr.lastIndexOf(file.getName())));	// .txt까지
		System.out.println("--파일형식제외 추출--");
		System.out.println(fstr.substring(fstr.lastIndexOf(File.separator)+1, fstr.indexOf(".")));	// 파일형식 제외
		
		// fstr에서 파일 경로만 추출
		System.out.println("--파일경로 추출--");
		System.out.println(fstr.substring(0, fstr.lastIndexOf(File.separator)));
	}

}
