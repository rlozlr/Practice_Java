package Lv5.퀘스트;

public class IndexOf01 {

	public static void main(String[] args) {
		IndexOf01 ex = new IndexOf01();
		String[] fileName = { "java.txt", "String.jpg", "method.png", "String.pdf", "java.pdf", "jpg.text" };
		// fileName 배열에서 img형식의 파일들을 찾아 '파일명.형식' 출력
		String[] img = { "jpg", "png", "gif", "jpeg" };

		try {
			for(String tmpFile : fileName) {
				String search = tmpFile.substring(tmpFile.lastIndexOf(".")+1);
//				System.out.println(search);
				if(ex.isContains(img, search)) {
					System.out.println(tmpFile);
				}
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

	// isContains
	// 배열에서 찾는 문자열이 있는지 체크 true / false
	public boolean isContains(String arr[], String search) {
		if (arr == null || arr.length == 0) {
			throw new RuntimeException("배열이 null 입니다.");
		}
		if (search == null) {
			throw new RuntimeException("검색어가 없습니다.");
		}
		for (String tmp : arr) {
			if (tmp.equals(search)) {
				return true;
			}
		}
		return false;
	}

}
