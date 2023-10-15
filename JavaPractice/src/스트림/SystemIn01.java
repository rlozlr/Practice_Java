package 스트림;

import java.io.IOException;

public class SystemIn01 {

	public static void main(String[] args) throws IOException {
		/* System.in을 이용하여 알파벳 하나를 쓰고 Enter를 누르면 알파벳을 콘솔에 찍기
		 * */
		System.out.print("알파벳 입력> ");
		int i;
		while((i = System.in.read()) != '\n') {
			System.out.print((char)i);
		}
		
	}

}
