public class Lion extends Animal {
	public Lion() {
		System.out.println("사자입니다");
	}
	
	public Lion (String name) {
		super(name);
		System.out.println("매개변수 - 사자입니다.");
	}
}