package hw10;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class DateFormat {

	public static void main(String[] args) {		
		
		boolean left = false;
				
		while(!left) {
			System.out.println("請輸入日期(年月日，例如：20110131)");
			Scanner input = new Scanner(System.in);
			String regex = "\\d{4}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])";
			String date = input.next();
			String y, m, d;
			
			if(date.matches(regex)) {
				y = date.substring(0, 4);	//year
				m = date.substring(4, 6);	//month
				d = date.substring(6);	//day
				
				GregorianCalendar obj = new GregorianCalendar();
				boolean isLeapYear =  obj.isLeapYear(Integer.parseInt(y));
				
				if(!isLeapYear && m.equals("02") && (Integer.parseInt(d) > 28)){
					System.out.println(y + "年不為閏年，2月不能超過28天");
					continue;
				}
				
				if(isLeapYear && m.equals("02") && (Integer.parseInt(d) > 29)) {					
					System.out.println(y + "年為閏年，2月不能超過29天");	
					continue;
				}
				
			}else {
				System.out.println("日期格式不正確，請再輸入一次！");
				continue;
			}
			
			System.out.println("欲格式化成(1)年/月/日 (2)月/日/年 (3)日/月/年：");
			Scanner input2 = new Scanner(System.in);
			int choose = input2.nextInt();
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
						
			}
			
			left = true;
			input.close();
			input2.close();
		}
	}
}
