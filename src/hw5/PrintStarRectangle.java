package hw5;

import java.util.Scanner;

/* hw5_01
 * 請設計一個方法為starSquare(int width, int height)，
 * 當使用者鍵盤輸入寬與高時，即會印出對應的*長方形
 * 
*/

public class PrintStarRectangle {

	public static void main(String[] args) {
		PrintStarRectangle obj = new PrintStarRectangle();
		int[] data =  new int[2];
		
		System.out.println("請輸入寬與高：");
		data = obj.inputMethod(new Scanner(System.in));
		obj.starSquare(data[0], data[1]);
	}
	
	public int[] inputMethod(Scanner inputData) {	//輸入的method
		int count = 0, temp = 0;
		int[] data =  new int[2];
		while(count < data.length) {	//跳出迴圈的條件：當count大於data陣列的長度
			if (inputData.hasNextInt()) {	//判斷輸入的是否為整數
				temp = inputData.nextInt();
				if (temp > 0) {
					data[count] = temp;
					count++;
				}else {
					System.out.println("輸入有誤，請重新輸入寬與高：");	
					count = 0;	//重置count
					inputData = new Scanner(System.in);
				}
			}else {
				System.out.println("輸入有誤，請重新輸入寬與高：");	
				count = 0;	//重置count
				inputData = new Scanner(System.in);
			}
		}
		return data;
	}
	
	public void starSquare(int width, int height) {
		for(int i=0 ; i<height ; i++) {
			for(int j=0 ; j<width ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
