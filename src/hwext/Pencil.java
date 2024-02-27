package hwext;

public class Pencil extends Pen {
	
	public Pencil(String brand, double price) {
		super(brand, price);
	}
	
	public double getPrice() {
		double price = super.getPrice() * 0.8;
		return price;
	}

	public void write() {
		System.out.println("削鉛筆再寫");
	}
}
