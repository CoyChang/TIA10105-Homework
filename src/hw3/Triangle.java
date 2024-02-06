package hw3;

/*
 * hw3_01
 * 請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰
 * 三角形、其它三角形或不是三角形，如圖示結果：
 * --------------			---------------			---------------			---------------
 * 請輸入三個整數：			請輸入三個整數：			請輸入三個整數：			請輸入三個整數：
 * 5 5 5 					5 8	5					5 6 7					0 0 0
 * 正三角形					等腰三角形				其它三角形				不是三角形
 * 
 * (提示：Scanner，三角形成立條件，判斷式if else)
 *	→ 三角形成立條件：比較短的二邊和大於最長邊
 *
 * (進階功能：加入直角三角形的判斷)
 * → 判斷直角三角形：a^2 + b^2 = c^2 (c為最長邊)
 */

import java.util.Arrays;
import java.util.Scanner;

public class Triangle {
	
	public static void main(String[] args) {
		int[] edgeLength =  new int[3];	//宣告存放輸入三個整數的陣列		
		Scanner inputData;
		int count = 0;
		
		System.out.println("請輸入三個整數：");		
		while(count < edgeLength.length) {	//跳出迴圈的條件：當count大於edgeLength陣列的長度
			inputData = new Scanner(System.in);
			if (inputData.hasNextInt()) {	//判斷輸入的是否為整數
				edgeLength[count] = inputData.nextInt();
				count++;
			}else {
				System.out.println("輸入有誤，請輸入整數：");	
			}
		}
		
		for(int i: edgeLength) {	//輸出輸入的資料
			System.out.print(i + " ");
		}
		
		System.out.println();
		Arrays.sort(edgeLength);	//將輸入資料由小到到排序
		if(edgeLength[0]+edgeLength[1] > edgeLength[2]) {
			if(edgeLength[0] == edgeLength[1] && edgeLength[1] == edgeLength[2]){
				System.out.println("正三角形");
			}else if(edgeLength[0] == edgeLength[1] || edgeLength[1] == edgeLength[2]){				
				System.out.println("等腰三角形");				
			}else {
				System.out.println("其它三角形");
			}			
		}else {
			System.out.println("不是三角形");
		}
	}
}
