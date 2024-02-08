package hw4;

/* hw4_05
 * 請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
 * 例：輸入1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
 * 
 * (提示1：Scanner，陣列)
 * (提示2：需將閏年條件加入)
 * (提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)
 * 
*/

import java.util.Scanner;

public class HowManyDays {

	public static void main(String[] args)  {
		HowManyDays obj = new HowManyDays();
		int[] date =  new int[3];	//宣告存放輸入三個整數的陣列代表年、月、日
		int days = 0, dayOfMonth = 0;	//宣告總天數、某月有幾天的變數
		boolean isLeapYear = false, hasProblem = false;	//宣告判斷是否為閏年、是否輸入上有問題的變數

		System.out.println("輸入年(yyyy)、月(mm)、日(dd)後會輸出該日期為該年的第幾天");		
		System.out.println("請輸入三個整數(格式為：yyyy mm dd)：");
		date = obj.inputMethod(new Scanner(System.in));	//取得第一次使用者輸入的內容
		
		do {	//使用者輸入內容判斷及計算總天數
			isLeapYear = obj.leapYear(date[0]);	//從使用者輸入的年判斷是否為閏年
			dayOfMonth = obj.getDayOfMonth(date[1]);	//從使用者輸入的月取得某月該有的天數
			
			if(dayOfMonth == -1) {	//輸入的月份不在1~12的範圍
				obj.errorMessage(date[1], 0, 1);
				date = obj.inputMethod(new Scanner(System.in));	//重新取得使用者輸入的內容
				hasProblem = true;
			}else {
				if(date[1] == 2) {	//如果為2月
					if(isLeapYear) {	//是閏年
						if(date[2] <= dayOfMonth+1) {	//輸入值應小於等於29
							days = obj.getDays(date[1], date[2], isLeapYear); //計算總天數
							hasProblem = false;	//判定無問題
						}else {	//否則有問題
							obj.errorMessage(date[1], dayOfMonth+1, 2);
							date = obj.inputMethod(new Scanner(System.in));	//重新取得使用者輸入的內容
							hasProblem = true;
						}
					}else if(date[2] <= dayOfMonth) {	//2月非閏年，天數輸入值在範圍內
						days = obj.getDays(date[1], date[2], isLeapYear);
						hasProblem = false;
					}else {	//非閏年，天數輸入值超出範圍
						obj.errorMessage(date[1], dayOfMonth, 2);			
						date = obj.inputMethod(new Scanner(System.in));
						hasProblem = true;
					}
				}else if(date[2] <= dayOfMonth) {	//判斷非2月份的輸入值，天數都在範圍內
					days = obj.getDays(date[1], date[2], isLeapYear);
					hasProblem = false;
				}else { 	//非2月份的輸入值，天數且超出範圍
					obj.errorMessage(date[1], dayOfMonth, 2);
					date = obj.inputMethod(new Scanner(System.in));
					hasProblem = true;
				}
			}
		}while(hasProblem);
			
		System.out.println(date[0] + " " + date[1] + " " + date[2]);
		System.out.println("輸入的日期為該年第"+ days + "天");
	}
	
	public int[] inputMethod(Scanner inputData) {	//輸入的method
		int count = 0;
		int[] date =  new int[3];
		while(count < date.length) {	//跳出迴圈的條件：當count大於date陣列的長度
			if (inputData.hasNextInt()) {	//判斷輸入的是否為整數
				date[count] = inputData.nextInt();
				count++;
			}else {
				System.out.println("輸入有誤，請重新輸入三個整數(格式為：yyyy mm dd)：");	
				count = 0;	//重置count
				inputData = new Scanner(System.in);
			}
		}
		return date;
	}
	
	
	public boolean leapYear(int year) {	//判斷是否為閏年
		boolean yesOrNot = false;
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					yesOrNot = true;	//能被4整除，又是100的倍數，且又能被400整除，所以為閏年
				}else {
					yesOrNot = false;
				}
			}else {
				yesOrNot = true;	//能被4整除，不能被100整除，所以為閏年
			}
		}
		return yesOrNot;
	}
	
	public int getDayOfMonth(int month) {	//判斷該月有幾天的method，2月預設為28天
		int day = 0;
		switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				day = 31;
				break;
			case 2:
				day = 28;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				day = 30;
				break;
			default:	//輸入不在1~12月的範圍
				day = -1;
		}		
		return day;
	}
	
	public int getDays(int month, int day, boolean yesOrNot) {	//計算總天數的method
		int[] dayOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31}; //每月天數的陣列，2月預設為28天
		int days = 0;
		for(int i=0 ; i < month-1 ; i++) {	//計算傳入月份-1的天數
			days += dayOfMonth[i];
		}
		if(yesOrNot && month>2) {	//如果為閏年且要計算的月份大於2月，則多+1天
			days += day + 1;
		}else {	//不為閏年、小於等於2月則不用多加天數
			days += day;
		}
		
		return days;
	}
	
	public void errorMessage(int month, int day, int errNumber) {	//輸出錯誤訊息內容
		switch(errNumber) {
			case 1:
				System.out.printf("沒有 %d 月，請再重新輸入三個整數(格式為：yyyy mm dd)：%n", month);
				break;
			case 2:
				System.out.printf("你所輸入的月份為 %d 月，日期不該超過 %d 天，請再重新輸入三個整數(格式為：yyyy mm dd)：%n", month, day);
				break;
		}
		
	}
}
