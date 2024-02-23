package hw5;

/* hw5_04_02
 * 
*/

public class MyRectangleMain {
	
	public static void main(String[] arge) {
		MyRectangle obj = new MyRectangle();
		obj.setWidth(10);
		obj.setDepth(20);
		
		MyRectangle obj2 = new MyRectangle(10, 20);
		
		System.out.println("(1) 使用無參數的建構子得出的結果：" + obj.getArea());
		System.out.println("(2) 使用有參數的建構子得出的結果：" + obj2.getArea());
	}

}
