package 파일;

import java.io.File;
import java.util.ArrayList;

public class FileObject {

	public static void main(String[] args) {
		// 파일이 가지고 있는 정보 출력
		File f = new File("C:\\Users\\annzyee\\git\\JavaPractice\\JavaPractice\\out.txt");
		System.out.println(f.getName());	// 경로를 제외한 이름
		System.out.println(f.getPath());	// 경로 + 이름
		System.out.println(f.getParent());	// 경로만
		System.out.println(File.separator);	// 파일구분자 (많이 사용)
		System.out.println("--------------------------");
	}

}
