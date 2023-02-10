public class Melon extends Food{
	private String info;

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
	public String toString() {
		return "Melon의 정보\n" + "칼로리 : " + getCal() + "\n가격 : " + getCost() + "\n중량 : " + getKg() + "\n정보 : " + info;
	}
	
	public Melon (int cal, int cost, int kg, String info) {
		super(cal, cost, kg);
		this.info = info;
	}
}