package hw2;

/*
 * hw2_06
 * 阿文很熱衷大樂透(1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
 * 輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
 */

public class BigLottery {

	public static void main(String[] args) {
		int unitsDigit = 0, tensDigit = 0; //宣告個位數、十位數的變數
		int numbers = 0; //宣告算個數的變數
		
		System.out.println("阿文可以選擇的數字有：");
		for(int i=1 ; i<=49 ; i++) {
			unitsDigit = i%10;
			tensDigit = i/10;
			if (unitsDigit != 4 && tensDigit != 4) {
				System.out.print(i + " ");
				numbers++;
			}
		}
		
		System.out.println();
		System.out.println("總共有： "+numbers+" 個");
	}

}
