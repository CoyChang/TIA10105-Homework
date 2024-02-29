package hwext;

public class Pencil extends Pen {
	private double discount;	

	public Pencil() {
		super();
	}
	
	public Pencil(String brand, double price, double discount) {
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
		double price = super.getPrice() * discount;
		return price;
	}

	public void write() {
		System.out.println("削鉛筆再寫");
	}
}
