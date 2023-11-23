package 싱글톤;

import java.util.Calendar;

class Counter{
	// 싱글톤 객체로 생성
	private static Counter instance;
	private int count;
	
	// 생성자 private
	private Counter() {}
	public static Counter getInstance() {
		if(instance == null) {	// 아직 객체가 생성되지 않았다면...
			instance = new Counter();
		}
		return instance;
	}
	
	public int CountMethod() {
		count++;
		return count;
	}
}

public class SingletonCount {

	public static void main(String[] args) {
		// counter 객체 2개 생성
		Counter c1 = Counter.getInstance();
		Counter c2 = Counter.getInstance();
		System.out.println(c1.CountMethod());	// 1
		System.out.println(c2.CountMethod());	// 2
		System.out.println(c1.CountMethod());	// 3
		System.out.println(c1.CountMethod());	// 4
		System.out.println(c2.CountMethod());	// 5
		
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		System.out.println(year);
	}
	
}
