package hw1;

/* hw1_03
 * 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
 */

public class DayTime {

	public static void main(String[] args) {
		int inputSecond = 256559;
		int day = inputSecond / (24*60*60);	//除以一天換算成的秒數
		int hour = (inputSecond / (60*60)) % 24; //除以一小時換算成的秒數，取除以24小時後的餘數即是不足一天的小時數
		int minute = (inputSecond / 60) % 60;	//除以一分鐘換算成的秒教，取除以60分鐘後的餘數即是不足1小時的分鐘數
		int second = inputSecond % 60; //取除以1分鐘60秒後的餘數即是不足1分鐘的秒數
		
		System.out.printf("%d秒為：%d天%d小時%d分%d秒", inputSecond, day, hour, minute, second);

	}

}
