package hw4;

/* hw4_01
 * 有個一維陣列如下：
 * {29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
 * 請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
 * 
 * (提示：陣列，length屬性)
*/

public class OneDimArray {

	public static void main(String[] args) {
		int[] data = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		int sum = 0, average = 0; //加總變數，平均值變數
		
		System.out.println("陣例元素有：");
		for(int i : data) {
			System.out.print(i + " ");
			sum+=i;	//計算加總
		}
		System.out.println();		
		
		average = sum/data.length;	//計算平均值
		System.out.println("平均值為：" + average);
		System.out.println("大於平均值的元素有：");
		for(int i : data) {
			if (i > average) //判斷大於平均值的元素
				System.out.println(i + " ");
		}
	}
}
