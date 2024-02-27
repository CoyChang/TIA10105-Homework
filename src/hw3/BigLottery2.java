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
import java.util.Arrays;
public class BigLottery2 {

	public static void main(String[] args) {
		BigLottery2 obj = new BigLottery2();
		Scanner inputData = new Scanner(System.in);
		int hateNumber, unitsDigit = 0, tensDigit = 0; //討厭的數字、個位數、十位數的變數
		int numbers = 0, random; //算個數的變數、亂數的變數
		int[] canChoose;	//能選擇的數字陣列
		String temp = "";
		int[] randomIndex = new int[6];	//存隨機挑選數字(索引值)的陣列
		
		
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
					temp = temp + i + " ";	//先把能選的數字暫以空白分隔存成字串
					if (numbers%10 == 0) {  //單純排版用，一排10個
						System.out.println();
					}
				}
			}		
			
			System.out.println();
			System.out.println("總共有： "+numbers+" 個");
			System.out.println("==================================");
			
			String[] temp2 = temp.split(" ");	//以空白分割成字串陣列
			canChoose = new int[numbers];	//將個數大小指定給能選擇的數字陣列
			for(int i=0 ; i<temp2.length ; i++) {
				canChoose[i] = Integer.parseInt(temp2[i]);	//將暫存的字串陣列轉換成整數陣列
			}			
			
			System.out.println("提供你隨機6個幸運的號碼：");	
				
			for(int i=0 ; i<randomIndex.length ; i++) {		//產生隨機6個號碼(索引值)
				random = (int)(Math.random()*numbers);	//產生亂數
				if(i==0) {	//存第一個產生的亂數
					randomIndex[i] = random;
				}else {	//第二個之後要進行比對是否有重複
					randomIndex[i] = random;
					for(int j=0 ; j<i ; j++) {
						if(randomIndex[i] != randomIndex[j]) {	//假設是第四個，要跟前三個進行比對
							continue;
						}else if(randomIndex[i] == randomIndex[j]) {	//比對結果如有重複
							i--;	//將目前的index先-1，之後會用新的值取代有重複的值
							break;
						}					
					}
				}
			}
			

			Arrays.sort(randomIndex);	//排序
			for(int i : randomIndex) {	
				System.out.print(canChoose[i] + " ");	//將亂數取得的6個號碼(索引值)，對照能選擇的數字陣列並輸出號碼
			}			
		}
		inputData.close();
	}
}
