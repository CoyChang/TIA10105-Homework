package hwext;

public class InkBrush extends Pen {
	
	public InkBrush(String brand, double price) {
		super(brand, price);
	}
	
	public double getPrice() {
		double price = super.getPrice() * 0.9;
		return price;		
	}
	
	public void write() {
		System.out.println("沾墨汁再寫");
	}

}
