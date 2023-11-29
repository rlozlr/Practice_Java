package JDBC;

public class Product {

	private int pno;
	private String pname;
	private int price;
	private String regdate;
	private String madeby;
	private int readCount;
	
	public Product() {}
	
	// 상품등록 -> pname, price, madeby
	public Product(String pnme, int price, String madeby) {
		this.pname = pnme;
		this.price = price;
		this.madeby = madeby;
	}
	
	// 상품리스트 -> pno, pname, price + readcount 추가
	public Product(int pno, String pnme, int price, int readCount) {
		this.pno = pno;
		this.pname = pnme;
		this.price = price;
		this.readCount = readCount;
	}
	
	// 상품상세 -> all  + readcount 추가
	public Product(int pno, String pnme, int price, String regdate, String madeby, int readCount) {
		this.pno = pno;
		this.pname = pnme;
		this.price = price;
		this.regdate = regdate;
		this.madeby = madeby;
		this.readCount = readCount;
	}
	
	// 상품수정 -> pno, pname, price, madeby
	public Product(int pno, String pnme, int price, String madeby) {
		this.pno = pno;
		this.pname = pnme;
		this.price = price;
		this.madeby = madeby;
	}

	public int getReadCount() {
		return readCount;
	}

	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}

	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getMadeby() {
		return madeby;
	}

	public void setMadeby(String madeby) {
		this.madeby = madeby;
	}

	@Override
	public String toString() {
		return "Product [pno=" + pno + ", pname=" + pname + ", price=" + price + ", regdate=" + regdate + ", madeby="
				+ madeby + ", readCount=" + readCount + "]";
	}

}
