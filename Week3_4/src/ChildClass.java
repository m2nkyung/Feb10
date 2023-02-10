public class ChildClass extends ParentClass{
	public void print() {
		System.out.println("서브클래스 메소드");
	}
	
	public ChildClass() {
		System.out.println("child 생성자");
	}
	
	public static void main(String[] args) {
		ChildClass a = new ChildClass();
		a.print();		
	}
}