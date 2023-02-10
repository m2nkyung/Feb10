public class Week3_7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Melon m1 = new Melon(120, 5000, 1, "naju");
		Melon m2 = new Melon(1, 1, 1, "0");
		
		m2.setCal(100);
		m2.setCost(7000);
		m2.setKg(2);
		m2.setInfo("jeju");
		
		System.out.println(m1.toString() + "\n");
		System.out.println(m2.toString());
	}
}