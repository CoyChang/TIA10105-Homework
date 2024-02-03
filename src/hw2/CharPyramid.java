package hw2;

/*
 * hw2_08
 * 請設計一隻Java程式，輸出結果為以下：
 * A
 * BB
 * CCC
 * DDDD
 * EEEEE
 * FFFFFF
 */

public class CharPyramid {

	public static void main(String[] args) {
		for(char c='A' ; c <= 'F' ; c++) {	//method 1
			for(char j = 'A' ; j <= c ; j++) {
				System.out.print(c);
			}
			System.out.println();
		}	
		
//		char letter = 'A';	//method 2
//		for(int i=letter ; i<=letter+5 ; i++) {	//將letter變數指定給i取得ASCII碼
//			for (int j=letter ; j<=i ; j++) {
//				System.out.print((char)i);
//			}		
//			System.out.println();
//		}
//		
//		for(int i=1 ; i<=6 ; i++) {		//method 3
//			for (int j=1 ; j<=i ; j++) {
//				System.out.print(letter);
//			}
//			letter++;
//			System.out.println();
//		}
		
		
	}
}
