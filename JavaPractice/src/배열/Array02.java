package 배열;

public class Array02 {

	public static void main(String[] args) {
		int a[] = {100,200};
		int b=200;
		add(a);
		System.out.println(a[0]);
		System.out.println(a[1]);
		b = add2(b); // 변경이 필요
		System.out.println(b);

	}
	public static void add(int a[]) {
		a[a.length-1] = 300;
	}
	public static int add2 (int b) {
		return (b=500);
		//매개변수와 일반변수는 지역변수
		//리턴을 통해서 값을 변경.
	}

}
