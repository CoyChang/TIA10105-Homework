package hw10;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DateFormat {

	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);
		boolean left = false;
				
		while(!left) {
			System.out.println("請輸入日期(年月日，例如：20110131)");			
			String regex = "\\d{4}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])";
			String date = input.next();
			String y, m, d;
			
			if(date.matches(regex)) {
				y = date.substring(0, 4);	//year
				m = date.substring(4, 6);	//month
				d = date.substring(6);	//day
				
				GregorianCalendar calendar = new GregorianCalendar();
				calendar.set(Calendar.YEAR, Integer.parseInt(y));
				calendar.set(Calendar.MONTH, Integer.parseInt(m)-1);
				
				int maxDayOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);	//輸入月份最大天數		
				boolean isLeapYear =  calendar.isLeapYear(Integer.parseInt(y));	 //輸入年份是否為閏年
				
				
				//雖然有正規表示法擋住非日期輸入的格式，但無法擋住超出該月天數的數字，
				//所以利用取得月份的最大天數判斷，此方法同時也會幫忙判斷該年是否為閏年
				if(Integer.parseInt(d) > maxDayOfMonth) {	
					System.out.println("超出" + m + "月最大天數囉!!");
					if(!isLeapYear && m.equals("02")) {
						System.out.println(y + "不是閏年");
					}					
					continue;
				}
				
			}else {
				System.out.println("日期格式不正確，請再輸入一次！");
				continue;
			}
			
			System.out.println("欲格式化成(1)年/月/日 (2)月/日/年 (3)日/月/年：");
			int choose = input.nextInt();
			switch(choose) {
				case 1:
					System.out.printf("%s/%s/%s%n", y, m, d);
					break;
				case 2:
					System.out.printf("%s/%s/%s%n", m, d, y);
					break;
				case 3:
					System.out.printf("%s/%s/%s%n", d, m, y);
					break;
				default:
                    System.out.println("無效的選擇，請重新輸入");
                    continue;
						
			}			
			left = true;			
		}
		input.close();
	}
}
