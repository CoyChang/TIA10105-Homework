package hw4;

/* hw4_02
 * 請建立一個字串，經過程式執行後，輸入結果是反過來的
 * 例如String s = “Hello World”，執行結果即為dlroW olleH
 * 
 * (提示：String方法，陣列)
*/

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		String str;
		Scanner inputData = new Scanner(System.in);
		System.out.println("請輸入要反轉的字串：");
		if(inputData.hasNextLine()) {
			str = inputData.nextLine();
			char[] revStr = new char[str.length()];			
			
			for(int i=0 ; i<str.length() ; i++) {
				revStr[i] = str.charAt((str.length()-1)-i);
			}
			System.out.println("反轉後的字串：");
			for(char j : revStr) {
				System.out.print(j);
			}
		}
	}

}
