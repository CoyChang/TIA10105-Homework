package hw3;

/*
 * hw3_03
 * 阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，
 * 但這次他想要依心情決定討厭哪個數字，請您設計一隻程式，
 * 讓阿文可以輸入他不想要的數字(1～9)，
 * 畫面會顯示他可以選擇的號碼與總數，如圖：
 * ----------------------------------------------------------------
 * 阿文...請輸入你討厭哪個數字？
 * 3
 * 
 * 1	2	4	5	6	7
 * 8	9	10	11	12	14
 * 15	16	17	18	19	20
 * 21	22	24	25	26	27
 * 28	29	40	41	42	44
 * 45	46	47	48	49	總共有35數字可選
 * 
 * 
 * (提示：Scanner)
 * (進階挑戰：輸入不要的數字後，直接亂數印出6個號碼且不得重複)
 */

import java.util.Scanner;

public class BigLottery2 {

	public static void main(String[] args) {
		Scanner inputData = new Scanner(System.in);
		int hateNumber, unitsDigit = 0, tensDigit = 0; //宣告討厭的數字、個位數、十位數的變數
		int numbers = 0; //宣告算個數的變數		
		
		System.out.println("阿文…請輸入你討厭哪個數字？");
		if(inputData.hasNextInt()) {	//判斷輸入的是否為整數
			hateNumber = inputData.nextInt();
			
			System.out.println("阿文可以選擇的數字有：");
			for(int i=1 ; i<=49 ; i++) {
				unitsDigit = i%10;
				tensDigit = i/10;
				if (unitsDigit != hateNumber && tensDigit != hateNumber) {
					System.out.print(i + " ");
					numbers++;
					if (numbers%10 == 0) {  //單純排版用，一排10個
						System.out.println();
					}
				}
			}		
			System.out.println();
			System.out.println("總共有： "+numbers+" 個");
		}
		inputData.close();
	}

}
