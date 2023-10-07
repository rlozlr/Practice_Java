package 예외처리;

public class 사용자지정Exception {

	public static void main(String[] args) {
		/* passwordException
		 * 
		 * - 비밀번호는 null일 수 없다.
		 * - 비밀번호의 길이는 5자 이상
		 * - 비밀번호는 문자로만 이루어지면 안됨. (문자+숫자+특수문자)
		 * */
		String password = "asdfsadfs";
		PasswordTest pt = new PasswordTest();
		
		try {
			pt.setPassword(password);
			System.out.println(pt.getPassword());
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		

	}

}

class PasswordTest {
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) throws PasswordException {
		if(password == null) {
			throw new PasswordException("비밀번호는 null일 수 없습니다.");
		}
		if(password.length() < 5) {
			throw new PasswordException("비밀번호는 5자리 이상이여야합니다.");
		}
		if(password.matches("[a-zA-z0-9]+"))
			throw new PasswordException("비밀번호는 숫자+특수문자 포함해야 합니다.");
		
		this.password = password;
	}
	
}
