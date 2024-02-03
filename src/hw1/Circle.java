package hw1;

/* hw1_04
 * 請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
 */

public class Circle {

	public static void main(String[] args) {
		final double PI = 3.1415;	//圓周率
		double radius = 5;	//半徑
		
		System.out.printf("半徑為5的圓面積為：%.4f%n",(PI*Math.pow(radius, 2)));
		System.out.printf("半徑為5的圓周長為：%.4f", radius*2*PI);

	}

}
