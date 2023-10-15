package Lv6.여행사의여행상품;

class Traveler implements Comparable<Traveler>{
	private String name;
	private int age;
	private int price;
	
	public Traveler() { }
	public Traveler(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Traveler(String name, int age, int price) {
		this.name = name;
		this.age = age;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "이름: "+name + ", 나이: " + age + ", 비용: " + price+"만원";
	}
	@Override
	public int compareTo(Traveler o) {
		return this.name.compareTo(o.name);
	}
}
