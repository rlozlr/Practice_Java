package 기초;

public class print {

	public static void main(String[] args) {
		/* System.out.println : 줄바꿈을 포함하는 출력
		 * System.out.print : 줄바꿈이 없는 출력 // 값이 없으면 error
		 * System.out.printf : 지시자를 이용한 출력
		 * 
		 * 서식 지정자를 통해 출력할 데이터의 서식을 지정할 수 있음
		 * %n(\n 줄바꿈), %d(정수형), %f(실수형), %c(문자), %s(문자열)
		 * 소수점 설정, 공백(띄어쓰기)
		 * */
		
		System.out.printf("%.2f%n",1.23456);
		
		int num1 =5;
		int num2 =3;
		// 5 + 3 = 8
		System.out.printf("%d + %d = %d%n",num1,num2,(num1+num2));
		
		double num3 = 1.23;
		double num4 = 5;
		// 1.23 / 5 = 값
		System.out.printf("%.1f / %.1f = %.1f%n",num3,num4,(num3/num4));

	}

}
