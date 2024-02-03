package hw2;

/*
 * hw2_05
 * 請設計一隻Java程式，輸出結果為以下：
 *	1 4 9 16 25 36 49 64 81 100
 */


public class PrintResult {

	public static void main(String[] args) {
		
		for(int i=1, j=3 ; i<=100 ; i+=j, j+=2) {			
			System.out.print(i + " ");
		}
	}
}
