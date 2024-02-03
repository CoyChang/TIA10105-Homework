package hw1;

/* hw1_06
 * 請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
 * 5 + 5
 * 5 + ‘5’
 * 5 + “5”
 * 並請用註解各別說明答案的產生原因
 */

public class PrintResult {

	public static void main(String[] args) {
		int number = 5;
		char five = '5';
		String strFive = "5";
		
		System.out.println(number+number); //10 → 一般的數值相加，5+5=10
		System.out.println(number+five);	//58 → 在char的單引號裡代表一個Unicode的編碼，
											//而5的16進位編碼為：\u0035，換算成10進位後為：53，所以5+53=58
		System.out.println(number+strFive); //55 → 因為用雙引號包起來的為字串，所以跟數值相加會是串接相加

	}

}
