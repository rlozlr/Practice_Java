package 예외처리;

public class Exception04 {

	public static void main(String[] args) {
		// 멀티 캐치
		/* try{
		 * 	 code...
		 * }catch(하위예외클래스 e){
		 * 		
		 * }catch(하위예외클래스 e){
		 * 
		 * }catch(Exception e){
		 * 
		 * }
		 * */
		try {
//			int res = 1/0;
//			System.out.println(res);
//			int arr1[] = null;
			int arr1[] = new int[3];
			arr1[5] = 10;
		} catch (ArithmeticException | NullPointerException e) {
			System.out.println("예외발생");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("배열의 범위가 넘어갔습니다.");
		} catch (Exception e) {	// 마지막은 최상위 exception default 느낌~!!
			e.printStackTrace();
		}
		System.out.println("종료~!!");

	}

}
