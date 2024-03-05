package hwext;

public class InkBrush extends Pen {
	private double discount;
		
	public InkBrush() {
		super();
	}
	
	public InkBrush(String brand, double price, double discount) {
		super(brand, price);
		this.discount = discount;
	}
	
	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}	
	
	public double getPrice() {
		return super.getPrice() * discount;		
	}
	
	public String toString() {
		String price = "定價：" + super.getPrice();
		return price;
	}
	
	public void write() {
		System.out.println("沾墨汁再寫");
	}
}
